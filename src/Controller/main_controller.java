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
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class main_controller extends MouseAdapter implements KeyListener,ItemListener{
    
    private dDriver dr;
    private Account ac;
    private String sql;
    private Connection conn;
    private Statement stat;
    private ResultSet rs;
    private Main M;
    private Employee em;
    private DefaultTableModel model;
    
    public main_controller(Account ac) {
        M = new Main();
        this.ac = ac;
        M.addMouseAdapter(this);
        M.addKeyListener(this);
        M.addItemListener(this);
        Database db = new Database();
        
        conn = db.con;
        stat = db.stm;
        
        try {
            sql = "SELECT * FROM employee JOIN account USING (username) WHERE username = '"+ac.getUserName()+"' ";
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
            
            try {
                String sql = "select name, borrow, returnd, noplat, price from rent join customer using (ktp)";
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                model = new DefaultTableModel(new Object[]{"Name","Borrow","Return","No. Plat","Price"},0);
                while (rs.next()) {
                    String name = rs.getString("name");
                    String borrow = rs.getString("borrow");
                    String returnd = rs.getString("returnd");
                    String noplat = rs.getString("noplat");
                    Double price = rs.getDouble("price");
                    model.addRow(new Object[]{name,borrow,returnd,noplat,price});
                }
                M.getTableRent().setModel(model);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (O.equals(M.getBtnlend())){
            M.resetColor(M.getBtnrent());
            M.resetColor(M.getBtnaccount());
            M.setColor(M.getBtnlend());
            M.resetColor(M.getBtndriver());
            M.getPaccount().setVisible(false);
            M.getPrent().setVisible(false);
            M.getPlend().setVisible(true);
            M.getPdriver().setVisible(false);
            try {
                String sql = "select name as 'Name', lendd as 'Lend', noplat, price from lend join car using (noplat) join owner using(ktp)";
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                model = new DefaultTableModel(new Object[]{"Name","Lend","No. Plat","Price"},0);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String lend = rs.getString("Lend");
                    String noplat = rs.getString("NoPlat");
                    Double price = rs.getDouble("Price");
                    model.addRow(new Object[]{name,lend,noplat,price});
                }
                M.getTableLend().setModel(model);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (O.equals(M.getBtndriver())){
            M.resetColor(M.getBtnrent());
            M.resetColor(M.getBtnaccount());
            M.resetColor(M.getBtnlend());
            M.setColor(M.getBtndriver());
            M.getPaccount().setVisible(false);
            M.getPrent().setVisible(false);
            M.getPlend().setVisible(false);
            M.getPdriver().setVisible(true);
            try {
                String sql = "select sim, name, address, phone, price from driver";
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                model = new DefaultTableModel(new Object[]{"Name","Address","Phone","Price","Sim"},0);
                while (rs.next()) {
                    String name = rs.getString("name");
                    String address = rs.getString("address");
                    String phone = rs.getString("phone");
                    Double price = rs.getDouble("price");
                    String sim = rs.getString("sim");
                    model.addRow(new Object[]{name,address,phone,price,sim});
                }
                M.getTableDriver().setModel(model);
                M.getTableDriver().getColumnModel().getColumn(4).setWidth(0);
                M.getTableDriver().getColumnModel().getColumn(4).setMinWidth(0);
                M.getTableDriver().getColumnModel().getColumn(4).setMaxWidth(0);
            } catch (Exception ex) {
                System.out.println(ex);
            }
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
            new lend_controller(ac);
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
                System.out.println(ex);
            }
            M.getBtnSave().setVisible(false);
        } else if (O.equals(M.getBtnnewDriver())){
            M.setVisible(false);
            new driver_controller(this.ac);
        } else if (O.equals(M.getSearch())){
            M.getSearch().setText("");
        } else if (O.equals(M.getSearchR())){
            M.getSearchR().setText("");
        } else if (O.equals(M.getSearchL())){
            M.getSearchL().setText("");
        } else if (O.equals(M.getNewRent())){
            M.setVisible(false);
            new rent_controller(ac);
        } else if (O.equals(M.getdEdit())){
            M.getTableDriver().setEnabled(true);
            M.getdDelete().setVisible(true);
            M.getdDone().setVisible(true);
        } else if (O.equals(M.getdDelete())){
            String name = (String) M.getTableDriver().getValueAt(M.getTableDriver().getSelectedRow(), 0);
            String address = (String) M.getTableDriver().getValueAt(M.getTableDriver().getSelectedRow(), 1);
            try {
                String sql = "delete from driver where name='"+name+"' and address='"+address+"'";
                stat = conn.createStatement();
                stat.executeUpdate(sql);
                do {
                    ((DefaultTableModel) M.getTableDriver().getModel()).removeRow(M.getTableDriver().getSelectedRows()[0]);
                } while (M.getTableDriver().getSelectedRowCount() > 0);
            } catch (Exception ex){
                System.out.println(ex);
            }
        } else if (O.equals(M.getdDone())){
            M.getdDelete().setVisible(false);
            M.getdDone().setVisible(false);
            M.getTableDriver().setEnabled(false);
        } else if (O.equals(M.getrEdit())){
            M.getTableRent().setEnabled(true);
            M.getrDelete().setVisible(true);
            M.getrDone().setVisible(true);
        } else if (O.equals(M.getrDelete())){
            String name = (String) M.getTableRent().getValueAt(M.getTableRent().getSelectedRow(), 0);
            String noplat = (String) M.getTableRent().getValueAt(M.getTableRent().getSelectedRow(), 3);
            try {
                String sql = "delete from rent where noplat='"+noplat+"'";
                stat = conn.createStatement();
                stat.executeUpdate(sql);
                sql = "delete from customer where name ='"+name+"'";
                stat = conn.createStatement();
                stat.executeUpdate(sql);
                sql = "update car set status=0 where noplat='"+noplat+"'";
                stat = conn.createStatement();
                stat.executeUpdate(sql);
                do {
                    ((DefaultTableModel) M.getTableRent().getModel()).removeRow(M.getTableRent().getSelectedRows()[0]);
                } while (M.getTableRent().getSelectedRowCount() > 0);
            } catch (Exception ex){
                System.out.println(ex);
            }
        } else if (O.equals(M.getrDone())){
            M.getTableRent().setEnabled(false);
            M.getrDelete().setVisible(false);
            M.getrDone().setVisible(false);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        Object O = e.getSource();
        if (O.equals(M.getSearch())){
            sql = "select * from driver where name like '"+"%"+M.getSearch().getText()+"%"+"'";
            System.out.println(sql);
            try {
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                model = new DefaultTableModel(new Object[]{"Name","Address","Phone","Price"},0);
                while (rs.next()) {
                    String name = rs.getString("name");
                    String address = rs.getString("address");
                    String phone = rs.getString("phone");
                    Double price = rs.getDouble("price");
                    model.addRow(new Object[]{name,address,phone,price});
                }
                M.getTableDriver().setModel(model);
            } catch (Exception ex){
                System.out.println(ex);
            }
        } else if (O.equals(M.getSearchR())){
            sql = "select * from rent join customer using (ktp) where name like '"+"%"+M.getSearchR().getText()+"%"+"'";
            System.out.println(sql);
            try {
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                model = new DefaultTableModel(new Object[]{"Name","Borrow","Return","No. Plat","Price"},0);
                while (rs.next()) {
                    String name = rs.getString("name");
                    String borrow = rs.getString("borrow");
                    String returnd = rs.getString("returnd");
                    String noplat = rs.getString("noplat");
                    Double price = rs.getDouble("price");
                    model.addRow(new Object[]{name,borrow,returnd,noplat,price});
                }
                M.getTableRent().setModel(model);
            } catch (Exception ex){
                System.out.println(ex);
            }
        } else if (O.equals(M.getSearchL())){
            sql = "select * from lend join owner using (ktp) join car using (noplat) where name like '"+"%"+M.getSearchL().getText()+"%"+"'";
            System.out.println(sql);
            try {
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                model = new DefaultTableModel(new Object[]{"Name","Lend","No. Plat","Price"},0);
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String lend = rs.getString("lendd");
                    String noplat = rs.getString("NoPlat");
                    Double price = rs.getDouble("Price");
                    model.addRow(new Object[]{name,lend,noplat,price});
                }
                M.getTableLend().setModel(model);
            } catch (Exception ex){
                System.out.println(ex);
            }
        } else if (O.equals(M.getTableDriver())) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_ENTER){
                int row = M.getTableDriver().getSelectedRow();
                int col = M.getTableDriver().getSelectedColumn();
                if (col == 0) {
                    try {
                        sql = "update driver set name = '"+M.getTableDriver().getModel().getValueAt(row,col)+"' where sim='"+M.getTableDriver().getModel().getValueAt(row,4)+"'";
                        stat = conn.createStatement();
                        stat.executeUpdate(sql);
                    } catch (Exception ex){
                        System.out.println(ex);
                    }
                } else if (col == 1){
                    try {
                        sql = "update driver set address = '"+M.getTableDriver().getModel().getValueAt(row,col)+"' where sim='"+M.getTableDriver().getModel().getValueAt(row,4)+"'";
                        stat = conn.createStatement();
                        stat.executeUpdate(sql);
                    } catch (Exception ex){
                        System.out.println(ex);
                    }
                } else if (col == 2){
                    try {
                        sql = "update driver set phone = '"+M.getTableDriver().getModel().getValueAt(row,col)+"' where sim='"+M.getTableDriver().getModel().getValueAt(row,4)+"'";
                        stat = conn.createStatement();
                        stat.executeUpdate(sql);
                    } catch (Exception ex){
                        System.out.println(ex);
                    }
                }
            }
        } else if (O.equals(M.getTableRent())) {
            int key = e.getKeyCode();
            String noplat = (String) M.getTableRent().getValueAt(M.getTableRent().getSelectedRow(),3);
            System.out.println(noplat);
            if (key == KeyEvent.VK_ENTER){
                int row = M.getTableRent().getSelectedRow();
                int col = M.getTableRent().getSelectedColumn();
                if (col == 0) {
                    try {
                        sql = "update customer join rent using(ktp) set name = '"+M.getTableRent().getValueAt(row,col)+"' where rent.noplat ='"+noplat+"'";
                        stat = conn.createStatement();
                        stat.executeUpdate(sql);
                    } catch (Exception ex){
                        System.out.println(ex);
                    }
                }
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object O = e.getSource();
        if (O.equals(M.getOrder())){
            if (M.getOrder().getSelectedIndex() == 1){
                try {
                    sql = "select * from driver order by price asc";
                    rs = stat.executeQuery(sql);
                    
                } catch (Exception ex){
                    System.out.println(ex);
                }
            } else if (M.getOrder().getSelectedIndex() == 2){
                try {
                    sql = "select * from driver order by name asc";
                    rs = stat.executeQuery(sql);
                } catch (Exception ex){
                    System.out.println(ex);
                }
            } else if (M.getOrder().getSelectedIndex() == 3){
                try {
                    sql = "select * from driver order by address asc";
                    rs = stat.executeQuery(sql);
                } catch (Exception ex){
                    System.out.println(ex);
                }
            } else {
                try {
                    sql = "select * from driver";
                    rs = stat.executeQuery(sql);
                } catch (Exception ex){
                    System.out.println(ex);
                }
            }
        }
        model = new DefaultTableModel(new Object[]{"Name","Address","Phone","Price","sim"},0);
        try {
            while (rs.next()) {
                String name = rs.getString("name");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                Double price = rs.getDouble("price");
                String sim = rs.getString("sim");
                model.addRow(new Object[]{name,address,phone,price,sim});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        M.getTableDriver().setModel(model);
        M.getTableDriver().getColumnModel().getColumn(4).setWidth(0);
        M.getTableDriver().getColumnModel().getColumn(4).setMinWidth(0);
        M.getTableDriver().getColumnModel().getColumn(4).setMaxWidth(0);
    }
    
}
