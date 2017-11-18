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

public class register_controller extends MouseAdapter {
    private Register R;
    
    public register_controller(){
        R = new Register();
        R.addMouseAdapter(this);
        
        //Configure Position of Window
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        R.setLocation(dim.width/2-R.getSize().width/2, dim.height/2-R.getSize().height/2);
        
        R.setVisible(true);
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(R.BtnRegister())){
            
        } else if (O.equals(R.getTUsername())){
            R.getTUsername().setText("");
        } else if (O.equals(R.getTName())){
            R.getTName().setText("");
        } else if (O.equals(R.getTEmail())){
            R.getTEmail().setText("");
        } else if (O.equals(R.getTAddress())){
            R.getTAddress().setText("");
        } else if (O.equals(R.getTPhone())){
            R.getTPhone().setText("");
        } else if (O.equals(R.getTPassword())){
            R.getTPassword().setText("");
        }
    }
}
