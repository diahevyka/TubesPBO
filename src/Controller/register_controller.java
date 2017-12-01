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
import java.awt.event.MouseEvent;
import Model.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.Statement;

public class register_controller extends MouseAdapter implements FocusListener {
    private Register R;
    private Database db = new Database();
    private String sql;
    private Connection conn = db.con;
    private Employee employee;
    private Statement statement = db.stm;
    
    public register_controller(){
        R = new Register();
        R.addMouseAdapter(this);
        R.addFocusListener(this);
        R.setVisible(true);
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(R.BtnRegister())){
            try {
                employee = new Employee(R.getTUsername().getText(),R.getTPassword().getText(),R.getTName().getText(),R.getTEmail().getText(),R.getTAddress().getText(),R.getTPhone().getText());
                String username = employee.getAccount().getUserName();
                String password = employee.getAccount().getPassword();
                sql = "INSERT INTO account " + " VALUES ('"+ username +"','"+ password +"')";
                statement = conn.createStatement();
                statement.executeUpdate(sql);
                sql = "INSERT INTO employee " + " VALUES ('"+ username + "', '"+ employee.getName() +"', '"+ employee.getEmail() +"', '"+ employee.getAddress() +"','"+ employee.getPhone() +"')";
                statement.executeUpdate(sql);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            R.setVisible(false);
            new login_controller();
        } else if (O.equals(R.getTUsername())){
            R.getTUsername().setText("");
        } else if (O.equals(R.getTName())){
            R.getTName().setText("");
        } else if (O.equals(R.getTEmail())){
            R.getTEmail().setText("");
        } else if (O.equals(R.getTAddress())){
            R.getTAddress().setText("");
        } else if (O.equals(R.getTPhone())){
            R.getTPhone().setText("");
        } else if (O.equals(R.getTPassword())){
            R.getTPassword().setText("");
        } else if(O.equals(R.BtnExit())){
            System.exit(0);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        Object O = e.getSource();
        if (O.equals(R.getTUsername())){
            if (R.getTUsername().getText().equals("username")){
                R.getTUsername().setText("");
            }
        } else if (O.equals(R.getTPassword())) {
            if (R.getTPassword().getText().equals("password")){
                R.getTPassword().setText("");
            }
        } else if (O.equals(R.getTEmail())){
            if (R.getTEmail().getText().equals("email")){
                R.getTEmail().setText("");
            }
        } else if (O.equals(R.getTAddress())){
            if (R.getTAddress().getText().equals("address")){
                R.getTAddress().setText("");
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        
    }
}
