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

public class New_Lend extends javax.swing.JFrame {
    
    public New_Lend() {
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
    
    public JTextField getTplat(){
        return tNoplat;
    }
    
    public JTextField getTType(){
        return tType;
    }
    
    public JTextField getTMerk(){
        return tMerk;
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
    
    public void addMouseAdapter(MouseAdapter e){
        BtnCancel.addMouseListener(e);
        BtnLend.addMouseListener(e);
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
        tType = new javax.swing.JTextField();
        tMerk = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        tNoplat = new javax.swing.JTextField();
        jError = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setPreferredSize(new java.awt.Dimension(800, 520));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-account-60.png"))); // NOI18N
        jLabel2.setText("OWNER");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Phone");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Address");

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

        tPhone.setBackground(new java.awt.Color(51, 51, 51));
        tPhone.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tPhone.setForeground(new java.awt.Color(255, 255, 255));
        tPhone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tPhone.setCaretColor(new java.awt.Color(255, 255, 255));
        tPhone.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tPhone.setSelectionColor(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-car-60.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Type");

        tType.setBackground(new java.awt.Color(51, 51, 51));
        tType.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tType.setForeground(new java.awt.Color(255, 255, 255));
        tType.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tType.setCaretColor(new java.awt.Color(255, 255, 255));
        tType.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tType.setSelectionColor(new java.awt.Color(204, 204, 204));
        tType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTypeActionPerformed(evt);
            }
        });

        tMerk.setBackground(new java.awt.Color(51, 51, 51));
        tMerk.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tMerk.setForeground(new java.awt.Color(255, 255, 255));
        tMerk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tMerk.setCaretColor(new java.awt.Color(255, 255, 255));
        tMerk.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tMerk.setSelectionColor(new java.awt.Color(204, 204, 204));
        tMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMerkActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Merk");

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

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Price");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("/ Day");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText(" CAR");

        BtnLend.setBackground(new java.awt.Color(0, 153, 204));
        BtnLend.setForeground(new java.awt.Color(255, 255, 255));
        BtnLend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LEND");

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

        tEmail.setBackground(new java.awt.Color(51, 51, 51));
        tEmail.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tEmail.setForeground(new java.awt.Color(255, 255, 255));
        tEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        tEmail.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tEmail.setSelectionColor(new java.awt.Color(204, 204, 204));
        tEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailActionPerformed(evt);
            }
        });

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

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("No. KTP");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("No. Plat");

        tNoplat.setBackground(new java.awt.Color(51, 51, 51));
        tNoplat.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tNoplat.setForeground(new java.awt.Color(255, 255, 255));
        tNoplat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        tNoplat.setCaretColor(new java.awt.Color(255, 255, 255));
        tNoplat.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tNoplat.setSelectionColor(new java.awt.Color(204, 204, 204));
        tNoplat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNoplatActionPerformed(evt);
            }
        });

        jError.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jError.setForeground(new java.awt.Color(51, 51, 51));
        jError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-attention-20.png"))); // NOI18N
        jError.setText("Please Fill All Field");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(142, 142, 142))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tPhone)
                                    .addComponent(tName)
                                    .addComponent(tEmail)
                                    .addComponent(tAddress)
                                    .addComponent(tNoktp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnLend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(3, 3, 3)))
                                .addGap(12, 12, 12)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addComponent(tPrice)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addComponent(tMerk)
                                    .addComponent(tType)
                                    .addComponent(tNoplat, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tNoktp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(8, 8, 8)))
                .addGap(60, 60, 60)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tNoplat, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tType, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(77, 77, 77)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnLend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

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

    private void tTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTypeActionPerformed

    private void tMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMerkActionPerformed

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

    private void tNoplatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNoplatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNoplatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnCancel;
    private javax.swing.JPanel BtnLend;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tAddress;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tMerk;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tNoktp;
    private javax.swing.JTextField tNoplat;
    private javax.swing.JTextField tPhone;
    private javax.swing.JTextField tPrice;
    private javax.swing.JTextField tType;
    // End of variables declaration//GEN-END:variables
}
