/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Account;
import Model.Database;
import View.ErrorMassage;
import View.Login;
import View.New_Driver;
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
    private New_Driver driver;
    private New_Driver view;
    private String sql;
    private Connection con;
    private Statement stat;
    private ResultSet rs;
    private Account ac;
    
        
    public driver_controller(){
        view = new New_Driver();
        view.addMouseAdapter(this);
        view.setVisible(true);
           
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(view.getBtnCancel())){
            view.setVisible(false);
            new main_controller(ac);
        }
        else if (O.equals(view.getDAdd())){
            try{
                driver = new New_Driver();
                String IdDriver = driver.getDidDriver().getText();
                String name = driver.getDNama().getText();
                String SIMNum = driver.getDNoSIM().getText();
                String RentPrice = driver.getDHarga().getText();
                String status = driver.getDStatus().getText();
                sql = "INSERT INTO driver " + " VALUES ('"+ IdDriver +"','"+ name +"','"+SIMNum+"','"+RentPrice+"','"+status+"')";
                stat = con.createStatement();
                stat.executeQuery(sql);
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
    
}
