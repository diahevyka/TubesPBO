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

import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;

public class New_Rent extends javax.swing.JFrame {
    
    public New_Rent() {
        initComponents();
        jError.setVisible(false);
    }
    
    public JTextField getTName(){
        return tName;
    }
    
    public JTextField getTNoktp(){
        return tNoktp;
    }
    
    public JTextField getTEmail(){
        return tEmail;
    }
    
    public JTextField getTAddress(){
        return tAddress;
    }
    
    public JTextField getTPhone(){
        return tPhone;
    }
    
    public JTextField getTPrice(){
        return tPrice;
    }
    
    public JPanel getBtnCancel(){
        return BtnCancel;
    }
    
    public JPanel getBtnLend(){
        return BtnLend;
    }
    
    public JLabel getError(){
        return jError;
    }
    
    public JComboBox gettType(){
        return jType;
    }
    
    public JComboBox gettMerk(){
        return jMerk;
    }
    
    public JComboBox getDriver(){
        return jDriver;
    }
    
    public JTextField getDuration(){
        return jDuration;
    }
    
    public void addMouseAdapter(MouseAdapter e){
        BtnCancel.addMouseListener(e);
        BtnLend.addMouseListener(e);
        //jType.addMouseListener(e);
        //jMerk.addMouseListener(e);
    }
    
    public void addItemListener(ItemListener e){
        jType.addItemListener(e);
        jMerk.addItemListener(e);
        jDriver.addItemListener(e);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tName = new javax.swing.JTextField();
        tPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BtnLend = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnCancel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        tAddress = new javax.swing.JTextField();
        tNoktp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jError = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jType = new javax.swing.JComboBox<>();
        jMerk = new javax.swing.JComboBox<>();
        jDriver = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDuration = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setPreferredSize(new java.awt.Dimension(800, 520));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-account-60.png"))); // NOI18N
        jLabel2.setText("CUSTOMER");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 169, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Email");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Phone");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Address");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        tName.setBackground(new java.awt.Color(51, 51, 51));
        tName.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tName.setForeground(new java.awt.Color(255, 255, 255));
        tName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tName.setCaretColor(new java.awt.Color(255, 255, 255));
        tName.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tName.setSelectionColor(new java.awt.Color(204, 204, 204));
        tName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNameActionPerformed(evt);
            }
        });
        bg.add(tName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 259, 38));

        tPhone.setBackground(new java.awt.Color(51, 51, 51));
        tPhone.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tPhone.setForeground(new java.awt.Color(255, 255, 255));
        tPhone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tPhone.setCaretColor(new java.awt.Color(255, 255, 255));
        tPhone.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tPhone.setSelectionColor(new java.awt.Color(204, 204, 204));
        bg.add(tPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 259, 38));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-car-60.png"))); // NOI18N
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Type");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        tPrice.setBackground(new java.awt.Color(51, 51, 51));
        tPrice.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tPrice.setForeground(new java.awt.Color(255, 255, 255));
        tPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tPrice.setCaretColor(new java.awt.Color(255, 255, 255));
        tPrice.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tPrice.setSelectionColor(new java.awt.Color(204, 204, 204));
        tPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPriceActionPerformed(evt);
            }
        });
        bg.add(tPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 184, 38));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Price");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("/ Day");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText(" CAR");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 77, -1));

        BtnLend.setBackground(new java.awt.Color(0, 153, 204));
        BtnLend.setForeground(new java.awt.Color(255, 255, 255));
        BtnLend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RENT");

        javax.swing.GroupLayout BtnLendLayout = new javax.swing.GroupLayout(BtnLend);
        BtnLend.setLayout(BtnLendLayout);
        BtnLendLayout.setHorizontalGroup(
            BtnLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnLendLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        BtnLendLayout.setVerticalGroup(
            BtnLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnLendLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(BtnLend, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        BtnCancel.setBackground(new java.awt.Color(0, 153, 204));
        BtnCancel.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CANCEL");

        javax.swing.GroupLayout BtnCancelLayout = new javax.swing.GroupLayout(BtnCancel);
        BtnCancel.setLayout(BtnCancelLayout);
        BtnCancelLayout.setHorizontalGroup(
            BtnCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnCancelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        BtnCancelLayout.setVerticalGroup(
            BtnCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        bg.add(BtnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, -1));

        tEmail.setBackground(new java.awt.Color(51, 51, 51));
        tEmail.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tEmail.setForeground(new java.awt.Color(255, 255, 255));
        tEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        tEmail.setPreferredSize(new java.awt.Dimension(259, 20));
        tEmail.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tEmail.setSelectionColor(new java.awt.Color(204, 204, 204));
        tEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailActionPerformed(evt);
            }
        });
        bg.add(tEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, 38));

        tAddress.setBackground(new java.awt.Color(51, 51, 51));
        tAddress.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tAddress.setForeground(new java.awt.Color(255, 255, 255));
        tAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tAddress.setCaretColor(new java.awt.Color(255, 255, 255));
        tAddress.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tAddress.setSelectionColor(new java.awt.Color(204, 204, 204));
        tAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAddressActionPerformed(evt);
            }
        });
        bg.add(tAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 259, 38));

        tNoktp.setBackground(new java.awt.Color(51, 51, 51));
        tNoktp.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tNoktp.setForeground(new java.awt.Color(255, 255, 255));
        tNoktp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tNoktp.setCaretColor(new java.awt.Color(255, 255, 255));
        tNoktp.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tNoktp.setSelectionColor(new java.awt.Color(204, 204, 204));
        tNoktp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNoktpActionPerformed(evt);
            }
        });
        bg.add(tNoktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 259, 38));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("No. KTP");
        bg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jError.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jError.setForeground(new java.awt.Color(51, 51, 51));
        jError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-attention-20.png"))); // NOI18N
        jError.setText("Please Fill All Field");
        bg.add(jError, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(2, 384));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Merk");
        bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jType.setBackground(new java.awt.Color(51, 51, 51));
        jType.setForeground(new java.awt.Color(255, 255, 255));
        jType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Type" }));
        jType.setBorder(null);
        jType.setFocusable(false);
        bg.add(jType, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 230, 39));

        jMerk.setBackground(new java.awt.Color(51, 51, 51));
        jMerk.setForeground(new java.awt.Color(255, 255, 255));
        jMerk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMerk.setFocusable(false);
        bg.add(jMerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 230, 39));

        jDriver.setBackground(new java.awt.Color(51, 51, 51));
        jDriver.setForeground(new java.awt.Color(255, 255, 255));
        jDriver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        jDriver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jDriver.setFocusable(false);
        bg.add(jDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 230, 39));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Driver");
        bg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Duration");
        bg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jDuration.setBackground(new java.awt.Color(51, 51, 51));
        jDuration.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jDuration.setForeground(new java.awt.Color(255, 255, 255));
        jDuration.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jDuration.setCaretColor(new java.awt.Color(255, 255, 255));
        jDuration.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jDuration.setSelectionColor(new java.awt.Color(204, 204, 204));
        jDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDurationActionPerformed(evt);
            }
        });
        bg.add(jDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 190, 38));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText(" Day");
        bg.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 70, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(800, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNameActionPerformed

    private void tPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPriceActionPerformed

    private void tEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailActionPerformed

    private void tAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAddressActionPerformed

    private void tNoktpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNoktpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNoktpActionPerformed

    private void jDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDurationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnCancel;
    private javax.swing.JPanel BtnLend;
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> jDriver;
    private javax.swing.JTextField jDuration;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jMerk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jType;
    private javax.swing.JTextField tAddress;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tNoktp;
    private javax.swing.JTextField tPhone;
    private javax.swing.JTextField tPrice;
    // End of variables declaration//GEN-END:variables
}
