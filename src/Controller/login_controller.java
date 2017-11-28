/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


/**
 *
 * @author Atta
 */

import Model.*;
import View.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.*;
import javax.swing.Timer;

public class login_controller extends MouseAdapter {
    
    private Login L;
    private Loading Lo = new Loading();
    private Account ac;
    private String sql;
    private Connection conn;
    private Statement stat;
    private ResultSet rs;
    
    
    public login_controller(){
        
        Database db = new Database();
        
        db.connect();
        conn = db.con;
        stat = db.stm;
        
        if (db.connect_status) {
            L = new Login();
            ac = new Account();
            L.addMouseAdapter(this);
            L.setVisible(true);
        } else {
            new ErrorMassage().setVisible(true);
        }
        
       
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(L.getTUsername())){
            L.getTUsername().setText("");
            L.getErrorMassage().setText("");
        } else if (O.equals(L.getTPassword())){
            L.getTPassword().setText("");
            L.getErrorMassage().setText("");
        } else if (O.equals(L.getTExit())){
            System.exit(0);
        } else if (O.equals(L.BtnLogin())){
            ac.setUserName(L.getTUsername().getText());
            ac.setPassword(L.getTPassword().getText());
            try{
                sql = "Select * from account where UserName='"+ac.getUserName()+"' And password='"+ac.getPassword()+"'";
                rs = stat.executeQuery(sql);
                if(rs.next()){
                    if(ac.getUserName().equals(rs.getString("UserName")) && ac.getPassword().equals(rs.getString("password"))){
                        L.setVisible(false);
                        new main_controller(ac);
                    }
                    else{
                        
                    }
                } else {
                    L.getErrorMassage().setText("Invalid Username or Password");
                }
            }catch(Exception ex){
                
            }
        } else if (O.equals(L.BtnRegister())){
            L.setVisible(false);
            new register_controller();
        }
    }
    
    
    
}
