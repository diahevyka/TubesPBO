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
import View.Main;
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
    private Main main;
    private String sql;
    private Connection conn;
    private Statement stat;
    private ResultSet rs;
    private Account ac;
    
        
    public driver_controller(){
        view = new New_Driver();
        view.addMouseAdapter(this);
        view.setVisible(true);
        Database db = new Database();
        
        conn = db.con;
        stat = db.stm;
    }

    public driver_controller(String a1, String b1, String c1, String d1, String e1) {
        view = new New_Driver();
        view.addMouseAdapter(this);
        view.setVisible(true);
        Main m = new Main();
        
        view.getDidDriver().setText(a1);
        view.getDNama().setText(b1);
        view.getDNoSIM().setText(c1);
        view.getDHarga().setText(d1);
        view.getDStatus().setText(e1);
        
        Database db = new Database();
        
        conn = db.con;
        stat = db.stm;
    }
    
    
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(view.getBtnCancel())){
            view.setVisible(false);
            new main_controller(ac);
        }
        else if (O.equals(view.getDAdd())){
            try{
                driver = view;
                String IdDriver = driver.getDidDriver().getText();
                String name = driver.getDNama().getText();
                String SIMNum = driver.getDNoSIM().getText();
                String RentPrice = driver.getDHarga().getText();
                String status = driver.getDStatus().getText();
                
                int i =1;
                sql = "select idDriver from driver where idDriver = '"+IdDriver+"'";
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                boolean hasResult = rs.next();
                
                if(hasResult == false ){
                    
                    sql = "INSERT INTO driver " + " VALUES ('"+ IdDriver +"','"+ name +"','"+SIMNum+"','"+RentPrice+"','"+status+"')";
                    stat = conn.createStatement();
                    stat.executeUpdate(sql);
                    driver.setVisible(false);
                    new main_controller(ac);
                }
                else{
                    sql = "UPDATE driver set name ='"+name+"', SIMNum = '"+SIMNum+"', rentPrice ='"+RentPrice+"', status ='"+status+"' where idDriver = '"+IdDriver+"'";
                    stat = conn.createStatement();
                    stat.executeUpdate(sql);
                    driver.setVisible(false);
                    new main_controller(ac);
                }
            }catch(Exception ex){
            }
        }
    }
    
}
