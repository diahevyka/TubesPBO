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
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class main_controller extends MouseAdapter {
    
    private Driver dr;
    private String sql;
    private Connection conn;
    private Statement stat;
    private ResultSet rs;
    private Main M;
    private Employee em;
    private DefaultTableModel model;
    
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
        } else if (O.equals(M.getBtnnewDriver())){
            M.setVisible(false);
            new driver_controller();
        }
        else if (O.equals(M.getDeleteDriver())){
            try{
                
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        else if (O.equals(M.getEditDriver())){
            try{
//                sql = "update Driver set "
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        
        else if (O.equals(M.getViewDriver())){
            try{
                model = new DefaultTableModel();
                M.getTable().setModel(model);

                sql = "Select * from Driver";
                rs = stat.executeQuery(sql);
                while(rs.next()){
                    Object[] ob = new Object[5];
                    ob[0] = rs.getString("idDriver");
                    ob[1] = rs.getString("Name");
                    ob[2] = rs.getString("SIMNum");
                    ob[3] = rs.getString("rentPrice");
                    ob[4] = rs.getString("status");
                    
                    model.addRow(ob);
                }
                
                model.addColumn("ID Driver");
                model.addColumn("Nama Driver");
                model.addColumn("No SIM");
                model.addColumn("Harga Sewa");
                model.addColumn("Status");
                
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
    
}
