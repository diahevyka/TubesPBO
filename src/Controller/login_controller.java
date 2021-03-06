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
import java.awt.event.*;
import java.sql.*;

public class login_controller extends MouseAdapter implements FocusListener,KeyListener{
    
    private Login L;
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
            L.addMouseAdapter(this);
            L.addFocusListener(this);
            L.addKeyListener(this);
            L.setVisible(true);
        } else {
            new ErrorMassage().setVisible(true);
        }
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(L.getTUsername())){
            L.getErrorMassage().setText("");
        } else if (O.equals(L.getTPassword())){
            L.getErrorMassage().setText("");
        } else if (O.equals(L.getTExit())){
            System.exit(0);
        } else if (O.equals(L.BtnLogin())){
            ac = new Account(L.getTUsername().getText(),L.getTPassword().getText());
            try{
                sql = "Select * from account where UserName='"+ac.getUserName()+"' And password='"+ac.getPassword()+"'";
                rs = stat.executeQuery(sql);
                if(rs.next()){
                    L.setVisible(false);
                    new main_controller(ac);
                } else {
                    L.getErrorMassage().setText("Invalid Username or Password");
                }
            }catch(Exception ex){
                System.out.println(ex);
            }
        } else if (O.equals(L.BtnRegister())){
            L.setVisible(false);
            new register_controller();
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        Object O = e.getSource();
        if (O.equals(L.getTUsername())){
            if (L.getTUsername().getText().equals("username")){
                L.getTUsername().setText("");
            }
            L.getErrorMassage().setText("");
        } else if (O.equals(L.getTPassword())){
            if (L.getTPassword().getText().equals("password")){
                L.getTPassword().setText("");
            }
            L.getErrorMassage().setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Object O = e.getSource();
        int key = e.getKeyCode();
        if (O.equals(L.getTUsername())){
            if (key == KeyEvent.VK_ENTER){
                ac = new Account(L.getTUsername().getText(),L.getTPassword().getText());
                try{
                    sql = "Select * from account where UserName='"+ac.getUserName()+"' And password='"+ac.getPassword()+"'";
                    rs = stat.executeQuery(sql);
                    if(rs.next()){
                        if(ac.getUserName().equals(rs.getString("UserName")) && ac.getPassword().equals(rs.getString("password"))){
                            L.setVisible(false);
                            new main_controller(ac);
                        }
                    } else {
                        L.getErrorMassage().setText("Invalid Username or Password");
                    }
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        } else if (O.equals(L.getTPassword())){
            if (key == KeyEvent.VK_ENTER){
                ac = new Account(L.getTUsername().getText(),L.getTPassword().getText());
                try{
                    sql = "Select * from account where UserName='"+ac.getUserName()+"' And password='"+ac.getPassword()+"'";
                    rs = stat.executeQuery(sql);
                    if(rs.next()){
                        if(ac.getUserName().equals(rs.getString("UserName")) && ac.getPassword().equals(rs.getString("password"))){
                            L.setVisible(false);
                            new main_controller(ac);
                        }
                    } else {
                        L.getErrorMassage().setText("Invalid Username or Password");
                    }
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }
    }
}
