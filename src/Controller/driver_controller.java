/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Account;
import Model.Database;
import View.Driver;
import View.ErrorMassage;
import View.Login;
import View.New_Lend;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 8.1
 */
public class driver_controller extends MouseAdapter{
    private Driver D;
    private Driver driver;
    private Driver view;
    private String sql;
    private Connection con;
    private Statement stat;
    private ResultSet rs;
    private Account ac;
    
        
    public driver_controller(){
        Database db = new Database();
        
        db.connect();
        con = db.con;
        stat = db.stm;
        
        if (db.connect_status) {
            D = new Driver();
            D.addMouseAdapter(this);
            D.setVisible(true);
        } else {
            new ErrorMassage().setVisible(true);
        }
        
        view.addMouseAdapter(this);
        view.setVisible(true);
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(view.getCancleDriver())){
            view.setVisible(false);
            new main_controller(ac);
        }
        else if (O.equals(view.getAddDriver())){
            try{
                driver = new Driver();
                String IdDriver = driver.getDIdDriver().getText();
                String name = driver.getDNamaDriver().getText();
                String SIMNum = driver.getDSimNum().getText();
                String RentPrice = driver.getDStatusDriver().getText();
                String status = driver.getDStatusDriver().getText();
                sql = "INSERT INTO driver " + " VALUES ('"+ IdDriver +"','"+ name +"','"+SIMNum+"','"+RentPrice+"','"+status+"')";
                stat = con.createStatement();
                stat.executeQuery(sql);
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
    
}
