/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import View.New_Lend;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

/**
 *
 * @author Windows 8.1
 */
public class driver_controller extends MouseAdapter{
    
    private New_Lend view;
    private String sql;
    private ResultSet rs;
    
    public driver_controller(){
        view.addMouseAdapter(this);
        view.setVisible(true);
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        
    }
    
}
