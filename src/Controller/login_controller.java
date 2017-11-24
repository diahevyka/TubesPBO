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

import Model.Account;
import Model.Database;
import View.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class login_controller extends MouseAdapter {
    
    private Login L;
    private Account ac;
    private Loading Lo;
    String sql;
    Connection con;
    Statement stat;
    ResultSet rs;
    
    
    public login_controller(){
        L = new Login();
        Lo = new Loading();
        L.addMouseAdapter(this);
        ac = new Account();
        Database db = new Database();
        db.config();
        con = db.con;
        stat = db.stm;
        //Configure Position of Window
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        L.setLocation(dim.width/2-L.getSize().width/2, dim.height/2-L.getSize().height/2);
        
        L.setVisible(true);
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
                        Lo.setVisible(true);
                        Timer timer = new Timer(3000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Lo.setVisible(false);
                                new main_controller();
                            } 
                        });
                        timer.start();
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
