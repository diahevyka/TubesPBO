/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.MouseAdapter;

/**
 *
 * @author Atta
 */

import View.*;
import java.awt.event.*;
import Model.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class register_controller extends MouseAdapter implements FocusListener {
    private Register R;
    private Database db;
    private String sql;
    private Connection conn = db.con;
    private ResultSet rs;
    private Employee employee;
    private Statement statement = db.stm;
    
    public register_controller(){
        R = new Register();
        db = new Database();
        R.addMouseAdapter(this);
        R.addFocusListener(this);
        R.setVisible(true);
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(R.BtnRegister())){
            try {
                if (R.getTUsername().getText().equals("") || R.getTName().getText().equals("") || R.getTEmail().getText().equals("") || R.getTAddress().getText().equals("") || R.getTPhone().getText().equals("") || R.getTPassword().getText().equals("") || R.getTUsername().getText().equals("username") || R.getTName().getText().equals("name") || R.getTEmail().getText().equals("email") || R.getTAddress().getText().equals("address") || R.getTPhone().getText().equals("phone") || R.getTPassword().getText().equals("password")){
                    R.getErrorMassage().setText("      Please fill all field");
                    R.getErrorMassage().setVisible(true);
                } else {
                    String temp = R.getTUsername().getText();
                    try {
                        sql = "SELECT USERNAME FROM ACCOUNT WHERE USERNAME = '"+temp+"'";
                        rs = statement.executeQuery(sql);
                        if (rs.next()){
                            R.getErrorMassage().setText("username already exist");
                            R.getErrorMassage().setVisible(true);
                        } else {
                            employee = new Employee(R.getTUsername().getText(),R.getTPassword().getText(),R.getTName().getText(),R.getTEmail().getText(),R.getTAddress().getText(),R.getTPhone().getText());
                            String username = employee.getAccount().getUserName();
                            String password = employee.getAccount().getPassword();
                            sql = "INSERT INTO account " + " VALUES ('"+ username +"','"+ password +"')";
                            statement.executeUpdate(sql);
                            sql = "INSERT INTO employee " + " VALUES ('"+ username + "', '"+ employee.getName() +"', '"+ employee.getEmail() +"', '"+ employee.getAddress() +"','"+ employee.getPhone() +"')";
                            statement.executeUpdate(sql);
                            R.setVisible(false);
                            new login_controller();
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if(O.equals(R.BtnExit())){
            System.exit(0);
        } else if(O.equals(R.BtnBack())){
            R.setVisible(false);
            new login_controller();
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        Object O = e.getSource();
        if (O.equals(R.getTUsername())){
            R.getErrorMassage().setVisible(false);
            if (R.getTUsername().getText().equals("username")){
                R.getTUsername().setText("");
            }
        } else if (O.equals(R.getTPassword())) {
            R.getErrorMassage().setVisible(false);
            if (R.getTPassword().getText().equals("password")){
                R.getTPassword().setText("");
            }
        } else if (O.equals(R.getTEmail())){
            R.getErrorMassage().setVisible(false);
            if (R.getTEmail().getText().equals("email")){
                R.getTEmail().setText("");
            }
        } else if (O.equals(R.getTAddress())){
            R.getErrorMassage().setVisible(false);
            if (R.getTAddress().getText().equals("address")){
                R.getTAddress().setText("");
            }
        } else if (O.equals(R.getTPhone())){
            R.getErrorMassage().setVisible(false);
            if (R.getTPhone().getText().equals("phone")){
                R.getTPhone().setText("");
            }
        } else if (O.equals(R.getTName())){
            R.getErrorMassage().setVisible(false);
            if (R.getTName().getText().equals("name")){
                R.getTName().setText("");
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
    }
}
