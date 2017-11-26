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
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;

public class main_controller extends MouseAdapter {
    
    private Main M;
    
    public main_controller() {
        M = new Main();
        M.addMouseAdapter(this);
        
        //Configure Position of Window
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        M.setLocation(dim.width/2-M.getSize().width/2, dim.height/2-M.getSize().height/2);
        
        M.setVisible(true);
    }
    
    public Main getMain(){
        return M;
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
        }
    }
    
}
