/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.*;
import View.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Windows 8.1
 */
public class driver_controller extends MouseAdapter{
    private New_Driver d;
    private dDriver dr;
    private Main main;
    private String sql;
    private Connection conn;
    private Statement stat;
    private ResultSet rs;
    private Account ac;
    
        
    public driver_controller(Account ac){
        this.ac = ac;
        d = new New_Driver();
        d.addMouseAdapter(this);
        d.setVisible(true);
        Database db = new Database();
        
        conn = db.con;
        stat = db.stm;
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(d.getBtnCancel())){
            d.setVisible(false);
            new main_controller(this.ac);
        } else if (O.equals(d.getDAdd())){
            if (d.getDNama().getText().equals("")||d.getDNoSIM().getText().equals("")||d.getDNoSIM().getText().equals("")||d.getAddress().getText().equals("")||d.getPhone().getText().equals("")||d.getDHarga().getText().equals("")){
                d.getError().setVisible(true);
            } else {
                try{
                    sql = "select sim from driver where sim = '"+d.getDNoSIM().getText()+"'";
                    stat = conn.createStatement();
                    rs = stat.executeQuery(sql);
                    
                    if (!rs.next()) {
                        dr = new dDriver(d.getDNama().getText(),d.getAddress().getText(),d.getPhone().getText(),d.getDNoSIM().getText(),Double.parseDouble(d.getDHarga().getText()),0);
                        sql = "INSERT INTO driver " + " VALUES ('"+dr.getSIMnum()+"','"+dr.getName()+"','"+dr.getAddress()+"','"+dr.getPhone()+"','"+dr.getRentPrice()+"','"+dr.isStatus()+"')";
                        stat = conn.createStatement();
                        stat.executeUpdate(sql);
                        d.setVisible(false);
                        new main_controller(this.ac);
                    } else {
                        d.getError().setText("Driver already exist");
                        d.getError().setVisible(true);
                    }
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }
    }
    
}
