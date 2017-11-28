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
import java.sql.ResultSet;
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
    private Double price = 0.0;
    
    public lend_controller(){
        view = new New_Lend();
        view.addMouseAdapter(this);
        view.setVisible(true);
    }
    
    public void mousePressed(MouseEvent e){
        Object O = e.getSource();
        if (O.equals(view.getBtnCancel())){
            view.setVisible(false);
        } else if (O.equals(view.getBtnLend())){
            if (view.getTName().getText().equals("") || view.getTNoktp().getText().equals("") || view.getTEmail().getText().equals("") || view.getTAddress().getText().equals("") || view.getTPhone().getText().equals("")){
                view.getError().setVisible(true);
            } else if (view.getTMerk().getText().equals("") || view.getTType().getText().equals("") || view.getTplat().getText().equals("") || view.getTPrice().getText().equals("")){
                view.getError().setVisible(true);
            } else {
                view.getError().setVisible(false);
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date date = new Date();
                owner = new Owner(view.getTNoktp().getText(),view.getTName().getText(),view.getTEmail().getText(),view.getTAddress().getText(),view.getTPhone().getText());
                type = new Type("0",view.getTType().getText());
                merk = new Merk("0",view.getTMerk().getText());
                try {
                    price = Double.parseDouble(view.getTPrice().getText());
                } catch (Exception E) {
                    
                }
                car = new Cars(view.getTplat().getText(),price,type,merk);
                lend = new Lend(dateFormat.format(date),owner,car);
            }
        }
    }
}
