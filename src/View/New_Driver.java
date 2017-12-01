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
    
    public JTextField getDidDriver(){
        return didDriver;
    }
    
    public JTextField getDNama(){
        return dNama;
    }
    
    public JTextField getDNoSIM(){
        return dNosim;
    }
    
    public JTextField getDHarga(){
        return dHarga;
    }
    
    public JTextField getDStatus(){
        return dStatus;
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

        dStatus = new javax.swing.JTextField();
        dHarga = new javax.swing.JTextField();
        dNosim = new javax.swing.JTextField();
        dNama = new javax.swing.JTextField();
        didDriver = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnDCancel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BtnSave = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        dStatus.setBackground(new java.awt.Color(51, 51, 51));
        dStatus.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dStatus.setForeground(new java.awt.Color(255, 255, 255));
        dStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dStatus.setCaretColor(new java.awt.Color(255, 255, 255));
        dStatus.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        dStatus.setSelectionColor(new java.awt.Color(204, 204, 204));

        dHarga.setBackground(new java.awt.Color(51, 51, 51));
        dHarga.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dHarga.setForeground(new java.awt.Color(255, 255, 255));
        dHarga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dHarga.setCaretColor(new java.awt.Color(255, 255, 255));
        dHarga.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        dHarga.setSelectionColor(new java.awt.Color(204, 204, 204));
        dHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dHargaActionPerformed(evt);
            }
        });

        dNosim.setBackground(new java.awt.Color(51, 51, 51));
        dNosim.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dNosim.setForeground(new java.awt.Color(255, 255, 255));
        dNosim.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dNosim.setCaretColor(new java.awt.Color(255, 255, 255));
        dNosim.setPreferredSize(new java.awt.Dimension(259, 20));
        dNosim.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        dNosim.setSelectionColor(new java.awt.Color(204, 204, 204));
        dNosim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNosimActionPerformed(evt);
            }
        });

        dNama.setBackground(new java.awt.Color(51, 51, 51));
        dNama.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dNama.setForeground(new java.awt.Color(255, 255, 255));
        dNama.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        dNama.setCaretColor(new java.awt.Color(255, 255, 255));
        dNama.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        dNama.setSelectionColor(new java.awt.Color(204, 204, 204));
        dNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNamaActionPerformed(evt);
            }
        });

        didDriver.setBackground(new java.awt.Color(51, 51, 51));
        didDriver.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        didDriver.setForeground(new java.awt.Color(255, 255, 255));
        didDriver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        didDriver.setCaretColor(new java.awt.Color(255, 255, 255));
        didDriver.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        didDriver.setSelectionColor(new java.awt.Color(204, 204, 204));
        didDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                didDriverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ID Driver");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("No SIM");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Harga Sewa");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Status");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
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
        jError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-attention-20.png"))); // NOI18N
        jError.setText("Please Fill All Field");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dStatus)
                                    .addComponent(dHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(didDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jError))
                            .addComponent(dNosim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(BtnDCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(didDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dNama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dNosim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnDCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(472, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dHargaActionPerformed

    private void dNosimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNosimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNosimActionPerformed

    private void dNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNamaActionPerformed

    private void didDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_didDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_didDriverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnDCancel;
    private javax.swing.JPanel BtnSave;
    private javax.swing.JTextField dHarga;
    private javax.swing.JTextField dNama;
    private javax.swing.JTextField dNosim;
    private javax.swing.JTextField dStatus;
    private javax.swing.JTextField didDriver;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
