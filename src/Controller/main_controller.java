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
import Model.Driver;
import View.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.*;

public class main_controller extends MouseAdapter {
    
    private Driver dr;
    private String sql;
    private Connection conn;
    private Statement stat;
    private ResultSet rs;
    private Main M;
    private Employee em;
    
    
    
    public main_controller(Account ac) {
        M = new Main();
        M.addMouseAdapter(this);
        Database db = new Database();
        
        conn = db.con;
        stat = db.stm;
        
        try {
            sql = "SELECT * FROM employee JOIN account USING (username) WHERE username = '"+ ac.getUserName()+"' ";
            rs = stat.executeQuery(sql);
            if (rs.next()){
                em = new Employee(ac.getUserName(),ac.getPassword(),rs.getString("Name"),rs.getString("Email"),rs.getString("Address"),rs.getString("Phone"));
                M.getFName().setText(em.getName());
                M.getFEmail().setText(em.getEmail());
                M.getFAddress().setText(em.getAddress());
                M.getFPhone().setText(em.getPhone());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        M.setVisible(true);
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        
        if (O.equals(M.getBtnaccount())){
            M.setColor(M.getBtnaccount());
            M.resetColor(M.getBtnrent());
            M.resetColor(M.getBtnlend());
            M.resetColor(M.getBtndriver());
            M.getPaccount().setVisible(true);
            M.getPrent().setVisible(false);
            M.getPlend().setVisible(false);
            M.getPdriver().setVisible(false);
        } else if (O.equals(M.getBtnrent())){
            M.setColor(M.getBtnrent());
            M.resetColor(M.getBtnaccount());
            M.resetColor(M.getBtnlend());
            M.resetColor(M.getBtndriver());
            M.getPaccount().setVisible(false);
            M.getPrent().setVisible(true);
            M.getPlend().setVisible(false);
            M.getPdriver().setVisible(false);
        } else if (O.equals(M.getBtnlend())){
            M.resetColor(M.getBtnrent());
            M.resetColor(M.getBtnaccount());
            M.setColor(M.getBtnlend());
            M.resetColor(M.getBtndriver());
            M.getPaccount().setVisible(false);
            M.getPrent().setVisible(false);
            M.getPlend().setVisible(true);
            M.getPdriver().setVisible(false);
        } else if (O.equals(M.getBtndriver())){
            M.resetColor(M.getBtnrent());
            M.resetColor(M.getBtnaccount());
            M.resetColor(M.getBtnlend());
            M.setColor(M.getBtndriver());
            M.getPaccount().setVisible(false);
            M.getPrent().setVisible(false);
            M.getPlend().setVisible(false);
            M.getPdriver().setVisible(true);
        } else if (O.equals(M.getBtnExit())){
            System.exit(0);
        } else if (O.equals(M.getBtnEdit())){
            M.getFName().setEditable(true);
            M.getFEmail().setEditable(true);
            M.getFAddress().setEditable(true);
            M.getFPhone().setEditable(true);
            M.getBtnSave().setVisible(true);
        } else if (O.equals(M.getBtnnewLend())){
            M.setVisible(false);
            new lend_controller();
        } else if (O.equals(M.getBtnSave())){
            M.savee();
            M.getBtnSave().setVisible(false);
        }
    }
    
}
