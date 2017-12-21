/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Atta
 */

import java.awt.event.MouseAdapter;
import javax.swing.*;

public class New_Driver extends javax.swing.JFrame {
    
    public New_Driver() {
        initComponents();
        jError.setVisible(false);
    }
    
    public JTextField getDNama(){
        return dNama;
    }
    
    public JTextField getDNoSIM(){
        return dNosim;
    }
    
    public JTextField getAddress(){
        return dAddress;
    }
    
    public JTextField getPhone(){
        return dPhone;
    }
    
    public JTextField getDHarga(){
        return dHarga;
    }
    
    public JPanel getBtnCancel(){
        return BtnDCancel;
    }
    
    public JPanel getDAdd(){
        return BtnSave;
    }
    
    public JLabel getError(){
        return jError;
    }
    
    public void addMouseAdapter(MouseAdapter e){
        BtnDCancel.addMouseListener(e);
        BtnSave.addMouseListener(e);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        dAddress = new javax.swing.JTextField();
        dNosim = new javax.swing.JTextField();
        dNama = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnDCancel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BtnSave = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jError = new javax.swing.JLabel();
        dPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dHarga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(204, 204, 204));

        dAddress.setBackground(new java.awt.Color(51, 51, 51));
        dAddress.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dAddress.setForeground(new java.awt.Color(255, 255, 255));
        dAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dAddress.setCaretColor(new java.awt.Color(255, 255, 255));
        dAddress.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        dAddress.setSelectionColor(new java.awt.Color(204, 204, 204));

        dNosim.setBackground(new java.awt.Color(51, 51, 51));
        dNosim.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dNosim.setForeground(new java.awt.Color(255, 255, 255));
        dNosim.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dNosim.setCaretColor(new java.awt.Color(255, 255, 255));
        dNosim.setPreferredSize(new java.awt.Dimension(259, 20));
        dNosim.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        dNosim.setSelectionColor(new java.awt.Color(204, 204, 204));

        dNama.setBackground(new java.awt.Color(51, 51, 51));
        dNama.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dNama.setForeground(new java.awt.Color(255, 255, 255));
        dNama.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dNama.setCaretColor(new java.awt.Color(255, 255, 255));
        dNama.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        dNama.setSelectionColor(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Name");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("No SIM");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Address");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-driving (1).png"))); // NOI18N
        jLabel2.setText("DRIVER");

        BtnDCancel.setBackground(new java.awt.Color(0, 153, 204));
        BtnDCancel.setForeground(new java.awt.Color(255, 255, 255));
        BtnDCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CANCEL");

        javax.swing.GroupLayout BtnDCancelLayout = new javax.swing.GroupLayout(BtnDCancel);
        BtnDCancel.setLayout(BtnDCancelLayout);
        BtnDCancelLayout.setHorizontalGroup(
            BtnDCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnDCancelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        BtnDCancelLayout.setVerticalGroup(
            BtnDCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        BtnSave.setBackground(new java.awt.Color(0, 153, 204));
        BtnSave.setForeground(new java.awt.Color(255, 255, 255));
        BtnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SAVE");

        javax.swing.GroupLayout BtnSaveLayout = new javax.swing.GroupLayout(BtnSave);
        BtnSave.setLayout(BtnSaveLayout);
        BtnSaveLayout.setHorizontalGroup(
            BtnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSaveLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        BtnSaveLayout.setVerticalGroup(
            BtnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSaveLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jError.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jError.setForeground(new java.awt.Color(51, 51, 51));
        jError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-attention-20.png"))); // NOI18N
        jError.setText("Please Fill All Field");

        dPhone.setBackground(new java.awt.Color(51, 51, 51));
        dPhone.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dPhone.setForeground(new java.awt.Color(255, 255, 255));
        dPhone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dPhone.setCaretColor(new java.awt.Color(255, 255, 255));
        dPhone.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        dPhone.setSelectionColor(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Phone");

        dHarga.setBackground(new java.awt.Color(51, 51, 51));
        dHarga.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dHarga.setForeground(new java.awt.Color(255, 255, 255));
        dHarga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dHarga.setCaretColor(new java.awt.Color(255, 255, 255));
        dHarga.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        dHarga.setSelectionColor(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Price");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("/ Day");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(31, 31, 31)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dNosim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(293, 293, 293))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dHarga))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(BtnDCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jError))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel2)))
                .addGap(98, 98, 98))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dNama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dNosim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(51, 51, 51)
                .addComponent(jError)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnDCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(426, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnDCancel;
    private javax.swing.JPanel BtnSave;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField dAddress;
    private javax.swing.JTextField dHarga;
    private javax.swing.JTextField dNama;
    private javax.swing.JTextField dNosim;
    private javax.swing.JTextField dPhone;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
