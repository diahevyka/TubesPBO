/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.MouseAdapter;

/**
 *
 * @author Atta
 */

import View.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;

public class login_controller extends MouseAdapter {
    
    private Login L;
    
    public login_controller(){
        L = new Login();
        L.addMouseAdapter(this);
        
        //Configure Position of Window
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        L.setLocation(dim.width/2-L.getSize().width/2, dim.height/2-L.getSize().height/2);
        
        L.setVisible(true);
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(L.getTUsername())){
            L.getTUsername().setText("");
        } else if (O.equals(L.getTPassword())){
            L.getTPassword().setText("");
        } else if (O.equals(L.getTExit())){
            System.exit(0);
        } else if (O.equals(L.BtnLogin())){
            
        } else if (O.equals(L.BtnRegister())){
            L.setVisible(false);
            new register_controller();
        }
    }
    
    
    
}
