/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import View.*;

/**
 *
 * @author Windows 8.1
 */
public class Database {
    public static Connection con;
    public static Statement stm;
    ErrorMassage EM = new ErrorMassage();
    public boolean connect_status = false;
    
    public void connect() {
     try {
            String url ="jdbc:mysql://localhost/RentalMobil";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(url,user,pass);
            stm = (Statement) con.createStatement();
            connect_status = true;
        } catch (Exception e) {
            connect_status = false;
        }
    }
}
