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
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import Model.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class register_controller extends MouseAdapter {
    private Register R;
    private Database db = new Database();
    private String sql;
    private Connection conn = db.con;
    private Employee employee;
    private Statement statement = db.stm;
    
    public register_controller(){
        R = new Register();
        R.addMouseAdapter(this);
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
}
