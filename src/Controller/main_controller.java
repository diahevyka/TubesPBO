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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class main_controller extends MouseAdapter {
    
    private Model.Driver dr;
    private String sql;
    private Connection conn;
    private Statement stat;
    private ResultSet rs;
    private Main M;
    private Employee em;
    private DefaultTableModel model;
    String id, nama, sim, harga, stt;
    
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
            em.setName(M.getFName().getText());
            em.setEmail(M.getFEmail().getText());
            em.setAddress(M.getFAddress().getText());
            em.setPhone(M.getFPhone().getText());
            try {
                sql = "update employee join account using(username) set name = '"+em.getName()+"', email = '"+em.getEmail()+"', Address = '"+em.getAddress()+"', Phone = '"+em.getPhone()+"' where account.UserName = '"+em.getAccount().getUserName()+"'";
                stat.executeUpdate(sql);
            } catch (Exception ex){
                System.out.println("error");
            }
            M.getBtnSave().setVisible(false);
        } else if (O.equals(M.getBtnnewDriver())){
            M.setVisible(false);
            new driver_controller();
        } else if (O.equals(M.getDeleteDriver())){
            try{
                String idDriver = M.getTable().getValueAt(M.getTable().getSelectedRow(), 0).toString();
                sql = "DELETE from driver where idDriver = '"+idDriver+"'";
                stat = conn.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Penghapusan Data Berhasil");
            } catch(Exception ex){
                
            }
        } else if (O.equals(M.getEditDriver())){
            M.setVisible(false);
            String idDriver = M.getTable().getValueAt(M.getTable().getSelectedRow(), 0).toString();
            String nama = M.getTable().getValueAt(M.getTable().getSelectedRow(), 1).toString();
            String noSIM = M.getTable().getValueAt(M.getTable().getSelectedRow(), 2).toString();
            String harga = M.getTable().getValueAt(M.getTable().getSelectedRow(), 3).toString();
            String status = M.getTable().getValueAt(M.getTable().getSelectedRow(), 4).toString();
            new driver_controller(idDriver, nama, noSIM, harga, status);
        } else if (O.equals(M.getViewDriver())){
            model = new DefaultTableModel();
            M.getTable().setModel(model);
            
            model.addColumn("ID Driver");
            model.addColumn("Nama Driver");
            model.addColumn("No SIM");
            model.addColumn("Harga Sewa");
            model.addColumn("Status");
            try{
                int i = 1;
                sql = "Select * from driver";
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                while(rs.next()){
                    model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    i++;
                }
                M.getTable().setModel(model);
            }catch(Exception ex){
                System.out.println(ex);
            }
        }else if (O.equals(M.getNewRent())){
            M.setVisible(false);
            new rent_controller();
        }
    }
    
}
