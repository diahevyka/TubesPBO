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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Windows 8.1
 */
public class rent_controller extends MouseAdapter implements ItemListener{

    private New_Rent view;
    private String sql;
    private Connection conn;
    private Statement stat;
    private ResultSet rs;    
    private Account ac;
    private Rent re;
    private Cars ca;
    private Employee em;
    private dDriver dr;
    
    public rent_controller(Account ac) {
        this.ac = ac;
        view = new New_Rent();
        view.addMouseAdapter(this);
        view.addItemListener(this);
        view.setVisible(true);
        
        Database db = new Database();
     
        conn = db.con;
        stat = db.stm;
        
        
        try {
            sql = "Select name from type";
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()){
                view.gettType().addItem(rs.getString("name"));
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        try {
            sql = "select sim,name from driver where status=0";
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()){
                view.getDriver().addItem(rs.getString("name"));
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        view.getError().setVisible(false);
        if (O.equals(view.getBtnCancel())){
            view.setVisible(false);
            new main_controller(this.ac);
        }else if (O.equals(view.getBtnLend())){
            try{
                String nama = view.getTName().getText();
                String ktp = view.getTNoktp().getText();
                String email = view.getTEmail().getText();
                String alamat = view.getTAddress().getText();
                String telp = view.getTPhone().getText();
                String type = (String) view.gettType().getSelectedItem();
                String merk = (String) view.gettMerk().getSelectedItem();
                //String driver = (String) view.getDriver().getSelectedItem();
                
                sql = "select idtype,type.name,idmerk,merk.name,noplat,price from car join type using(idtype) join merk using(idmerk) where type.name='"+type+"' and merk.name='"+merk+"'";
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                if (rs.next()) {
                    Type t = new Type(rs.getString("idtype"),type);
                    Merk m = new Merk(rs.getString("idmerk"),merk);
                    ca = new Cars(rs.getString("noplat"),t,m,rs.getDouble("price"),true);
                }

                sql = "update car set status = 1 where noplat = '"+ca.getNoplat()+"'";
                stat = conn.createStatement();
                stat.executeUpdate(sql);

                Customer c = new Customer(ktp,nama,email,alamat,telp);

                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                Calendar cl = Calendar.getInstance();
                cl.add(Calendar.DATE,Integer.parseInt(view.getDuration().getText()));

                sql = "select * from employee join account using (username) where username = '"+ac.getUserName()+"'";
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                if (rs.next()) {
                    em = new Employee(rs.getString("employee.username"),rs.getString("account.password"),rs.getString("name"),rs.getString("email"),rs.getString("address"),rs.getString("phone"));
                }
                
                if (view.getDriver().getSelectedIndex() == 0) {
                    re = new Rent(dateFormat.format(date),dateFormat.format(cl.getTime()),c,em,ca,Integer.parseInt(view.getDuration().getText()));
                } else {
                    try {
                        sql = "select * from driver where name ='"+view.getDriver().getSelectedItem()+"'";
                        stat = conn.createStatement();
                        rs = stat.executeQuery(sql);
                        String sim;
                        if (rs.next()){
                            sim = rs.getString("sim");
                            System.out.println(sim);
                            dr = new dDriver(rs.getString("name"),rs.getString("address"),rs.getString("phone"),rs.getString("sim"),rs.getDouble("price"),0);
                            re = new Rent(dateFormat.format(date),dateFormat.format(cl.getTime()),c,em,ca,Integer.parseInt(view.getDuration().getText()),dr);
                            sql = "update driver set status = 1 where sim='"+sim+"'";
                            stat = conn.createStatement();
                            stat.executeUpdate(sql);
                        }
                        
                    } catch (Exception ex){
                        System.out.println(ex);
                    }   
                }

                sql = "insert into customer values ('"+c.getName()+"','"+c.getNoktp()+"','"+c.getEmail()+"','"+c.getAddress()+"','"+c.getPhone()+"')";
                stat = conn.createStatement();
                stat.executeUpdate(sql);

                sql = "insert into rent values ('"+re.getCustomer().getNoktp()+"','"+re.getBorrowDate()+"','"+re.getReturnDate()+"','"+re.getCar().getNoplat()+"','"+re.getPrice()+"')";
                stat = conn.createStatement();
                stat.executeUpdate(sql);

                view.setVisible(false);
                new main_controller(ac);
                
            }catch(Exception ex){
                view.getError().setVisible(true);
            }
        } 
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object O = e.getSource();
        if (O.equals(view.gettType())){
            view.gettMerk().removeAllItems();
            view.getTPrice().setText("");
            view.gettMerk().addItem("Choose");
            sql = "Select merk.name from car join merk using (idmerk) join type using (idtype) where status = 0 and type.name = '"+view.gettType().getSelectedItem()+"'";
            try {
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()){
                    view.gettMerk().addItem(rs.getString("merk.name"));
                }
            } catch (Exception ex){
                System.out.println(ex);
            }
        } else if (O.equals(view.gettMerk())){
            try {
                sql = "select price from car join type using(idtype) join merk using(idmerk) where type.name ='"+view.gettType().getSelectedItem()+"' and merk.name='"+view.gettMerk().getSelectedItem()+"'";
                stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                if (rs.next()){
                    view.getTPrice().setText(rs.getString("price"));
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (O.equals(view.getDriver())){
            
        }
    }
}
