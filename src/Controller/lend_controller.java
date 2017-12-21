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

import View.*;
import Model.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class lend_controller extends MouseAdapter{
    private New_Lend view;
    private Lend lend;
    private Cars car;
    private Type type;
    private Merk merk;
    private Owner owner;
    private String sql;
    private ResultSet rs;
    private Connection conn;
    private Statement statement;
    private Account ac;
    
    public lend_controller(Account ac){
        this.ac = ac;
        view = new New_Lend();
        view.addMouseAdapter(this);
        view.setVisible(true);
        view.getInvalid().setVisible(false);
        
        Database db = new Database();
     
        conn = db.con;
        statement = db.stm;
        
        try {
            sql = "Select name from type";
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()){
                view.getTType().addItem(rs.getString("name"));
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(view.getBtnCancel())){
            view.setVisible(false);
            new main_controller(ac);
        } else if (O.equals(view.getBtnLend())){
            try {
                Double price = Double.parseDouble(view.getTPrice().getText());
                if (view.getTName().getText().equals("") || view.getTNoktp().getText().equals("") || view.getTEmail().getText().equals("") || view.getTAddress().getText().equals("") || view.getTPhone().getText().equals("")){
                    view.getError().setVisible(true);
                } else if (view.getTMerk().getText().equals("") || view.getTType().getSelectedItem().equals("Choose Type") || view.getTplat().getText().equals("") || view.getTPrice().getText().equals("")){
                    view.getError().setVisible(true);
                } else {
                    view.getError().setVisible(false);
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = new Date();
                   
                    owner = new Owner(view.getTNoktp().getText(),view.getTName().getText(),view.getTEmail().getText(),view.getTAddress().getText(),view.getTPhone().getText());
                    
                    sql = "select ktp from owner where ktp = '"+owner.getNoktp()+"'";
                    statement = conn.createStatement();
                    rs = statement.executeQuery(sql);
                    if (rs.next()){
                        
                    } else {
                        
                        sql = "select idtype from type where name = '"+view.getTType().getSelectedItem()+"'";
                        statement = conn.createStatement();
                        rs = statement.executeQuery(sql);
                        if (rs.next()){
                            type = new Type(rs.getString("idtype"),(String)view.getTType().getSelectedItem());
                            
                            boolean cek = false;
                            
                            while (!cek) {
                                merk = new Merk(view.getTMerk().getText());
                                try {
                                    cek = true;
                                    sql = "insert into merk values('"+merk.getIdMerk()+"','"+merk.getName()+"')";
                                    statement = conn.createStatement();
                                    statement.executeUpdate(sql);
                                } catch (Exception ex){
                                    cek = false;
                                }
                            }
                            
                            sql = "insert into owner values ('"+owner.getName()+"','"+owner.getNoktp()+"','"+owner.getEmail()+"','"+owner.getAddress()+"','"+owner.getPhone()+"')";
                            statement = conn.createStatement();
                            statement.executeUpdate(sql);
                            
                            car = new Cars(view.getTplat().getText(),type,merk,Double.parseDouble(view.getTPrice().getText()),false);
                            
                            sql = "insert into car values ('"+car.getNoplat()+"','"+car.getType().getIdType()+"','"+car.getMerk().getIdMerk()+"','"+car.getPrice()+"','"+0+"')";
                            statement = conn.createStatement();
                            statement.executeUpdate(sql);
                            
                            
                            lend = new Lend(dateFormat.format(date),owner,car);
                            
                            sql = "insert into lend values ('"+lend.getLendDate()+"','"+lend.getOwner().getNoktp()+"','"+lend.getCar().getNoplat()+"')";
                            statement = conn.createStatement();
                            statement.executeUpdate(sql);
                            
                            view.setVisible(false);
                            new main_controller(ac);
                        }        
                    }
                }
            } catch (NumberFormatException ex) {
                view.getInvalid().setVisible(true);
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
    }
}
