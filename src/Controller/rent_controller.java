/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Account;
import Model.Database;
import View.New_Rent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Windows 8.1
 */
public class rent_controller extends MouseAdapter{

    private New_Rent view;
    private String sql;
    private Connection conn;
    private Statement stat;
    private ResultSet rs;    
    private Account ac;
    
    public rent_controller() {
        view = new New_Rent();
        view.addMouseAdapter(this);
        view.setVisible(true);
        
        Database db = new Database();
     
        conn = db.con;
        stat = db.stm;
    }
    
    public void MousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(view.getBtnCancel())){
            view.setVisible(false);
            new main_controller(ac);
        }else if (O.equals(view.getBtnLend())){
            try{
                String nama = view.getTName().getText();
                String ktp = view.getTNoktp().getText();
                String email = view.getTEmail().getText();
                String alamat = view.getTAddress().getText();
                String telp = view.getTPhone().getText();
                String merk = view.getTType().getSelectedItem().toString();
                String type = view.getTMerk().getSelectedItem().toString();
                String harga = view.getTPhone().getText();
                
                //tinggal querynya ini
                sql = "insert into customer values ('"+nama+"','"+ktp+"','"+email+"','"+alamat+"','"+telp+"')";
                stat = conn.createStatement();
                stat.executeUpdate(sql);
                
                sql = "insert into owner car ('"+merk+"','"+type+"','"+harga+"')";
                stat = conn.createStatement();
                stat.executeUpdate(sql);
                
                view.setVisible(false);
                new main_controller(ac);
            }catch(Exception ex){
                
            }
        }
    }
}
