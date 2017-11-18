package View;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.*;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        jName.setEditable(false);
        jEmail.setEditable(false);
        jAddress.setEditable(false);
        jPhone.setEditable(false);
        jSave.setVisible(false);
        
        //Table Rent
        tRent.getTableHeader().setPreferredSize(new Dimension(tRent.getTableHeader().getWidth(), 35));
        tRent.getTableHeader().setBackground(new Color(102,102,102));
        tRent.getTableHeader().setForeground(new Color(255,255,255));
        tRent.getTableHeader().setBorder(null);
        tRent.getColumnModel().getColumn(0).setPreferredWidth(100);
        
        //Table Lend
        tLend.getTableHeader().setPreferredSize(new Dimension(tRent.getTableHeader().getWidth(), 35));
        tLend.getTableHeader().setBackground(new Color(102,102,102));
        tLend.getTableHeader().setForeground(new Color(255,255,255));
        tLend.getTableHeader().setBorder(null);
        tLend.getColumnModel().getColumn(0).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        bg = new javax.swing.JPanel();
        jExit = new javax.swing.JLabel();
        Navigation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nAccount = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nRent = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nLend = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nDriver = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pAccount = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        jAddress = new javax.swing.JTextField();
        jPhone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jEdit = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSave = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pRent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tRent = new javax.swing.JTable();
        bNew = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pLend = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tLend = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pDriver = new javax.swing.JPanel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField2.setText("jTextField2");

        jRadioButton1.setText("jRadioButton1");

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(102, 102, 102));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jExit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jExit.setForeground(new java.awt.Color(204, 204, 204));
        jExit.setText("   X ");
        bg.add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 40));

        Navigation.setBackground(new java.awt.Color(255, 255, 255));
        Navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cars.png"))); // NOI18N
        Navigation.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 19, -1, 108));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Co-Cars");
        Navigation.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 133, -1, -1));

        nAccount.setBackground(new java.awt.Color(204, 204, 204));
        nAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Account");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-user-filled.png"))); // NOI18N

        javax.swing.GroupLayout nAccountLayout = new javax.swing.GroupLayout(nAccount);
        nAccount.setLayout(nAccountLayout);
        nAccountLayout.setHorizontalGroup(
            nAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nAccountLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nAccountLayout.setVerticalGroup(
            nAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nAccountLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(nAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Navigation.add(nAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 193, 200, -1));

        nRent.setBackground(new java.awt.Color(255, 255, 255));
        nRent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nRent.setPreferredSize(new java.awt.Dimension(124, 54));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Rent");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-car-filled.png"))); // NOI18N

        javax.swing.GroupLayout nRentLayout = new javax.swing.GroupLayout(nRent);
        nRent.setLayout(nRentLayout);
        nRentLayout.setHorizontalGroup(
            nRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nRentLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nRentLayout.setVerticalGroup(
            nRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nRentLayout.createSequentialGroup()
                .addGroup(nRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nRentLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nRentLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        Navigation.add(nRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 59));

        nLend.setBackground(new java.awt.Color(255, 255, 255));
        nLend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nLend.setPreferredSize(new java.awt.Dimension(124, 54));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Lend");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-key.png"))); // NOI18N

        javax.swing.GroupLayout nLendLayout = new javax.swing.GroupLayout(nLend);
        nLend.setLayout(nLendLayout);
        nLendLayout.setHorizontalGroup(
            nLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nLendLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nLendLayout.setVerticalGroup(
            nLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nLendLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nLendLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Navigation.add(nLend, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 309, 200, 60));

        nDriver.setBackground(new java.awt.Color(255, 255, 255));
        nDriver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nDriver.setPreferredSize(new java.awt.Dimension(124, 54));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Driver");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-driving (1).png"))); // NOI18N

        javax.swing.GroupLayout nDriverLayout = new javax.swing.GroupLayout(nDriver);
        nDriver.setLayout(nDriverLayout);
        nDriverLayout.setHorizontalGroup(
            nDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nDriverLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nDriverLayout.setVerticalGroup(
            nDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nDriverLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nDriverLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Navigation.add(nDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 60));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel10.setText("HAR - 2017");
        Navigation.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Navigation.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 200, 10));

        bg.add(Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pAccount.setBackground(new java.awt.Color(102, 102, 102));
        pAccount.setPreferredSize(new java.awt.Dimension(604, 460));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Email");

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Address");

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Phone");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user1.png"))); // NOI18N

        jName.setBackground(new java.awt.Color(102, 102, 102));
        jName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jName.setForeground(new java.awt.Color(255, 255, 255));
        jName.setText("Muhammad Hatta");
        jName.setBorder(null);
        jName.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jName.setSelectionColor(new java.awt.Color(0, 0, 0));

        jEmail.setBackground(new java.awt.Color(102, 102, 102));
        jEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jEmail.setForeground(new java.awt.Color(255, 255, 255));
        jEmail.setText("hatta.eka.p@gmail.com");
        jEmail.setBorder(null);
        jEmail.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jEmail.setSelectionColor(new java.awt.Color(0, 0, 0));

        jAddress.setBackground(new java.awt.Color(102, 102, 102));
        jAddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jAddress.setForeground(new java.awt.Color(255, 255, 255));
        jAddress.setText("Wisma Annafi");
        jAddress.setBorder(null);
        jAddress.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jAddress.setSelectionColor(new java.awt.Color(0, 0, 0));

        jPhone.setBackground(new java.awt.Color(102, 102, 102));
        jPhone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPhone.setForeground(new java.awt.Color(255, 255, 255));
        jPhone.setText("081221447275");
        jPhone.setBorder(null);
        jPhone.setCaretColor(new java.awt.Color(51, 51, 51));
        jPhone.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jPhone.setSelectionColor(new java.awt.Color(0, 0, 0));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jEdit.setBackground(new java.awt.Color(255, 255, 255));
        jEdit.setForeground(new java.awt.Color(255, 255, 255));
        jEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jEditMousePressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("EDIT DATA");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-edit-filled (2).png"))); // NOI18N

        javax.swing.GroupLayout jEditLayout = new javax.swing.GroupLayout(jEdit);
        jEdit.setLayout(jEditLayout);
        jEditLayout.setHorizontalGroup(
            jEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEditLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jEditLayout.setVerticalGroup(
            jEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEditLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSave.setBackground(new java.awt.Color(255, 255, 255));
        jSave.setForeground(new java.awt.Color(255, 255, 255));
        jSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSave.setPreferredSize(new java.awt.Dimension(85, 42));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("SAVE");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-filled.png"))); // NOI18N

        javax.swing.GroupLayout jSaveLayout = new javax.swing.GroupLayout(jSave);
        jSave.setLayout(jSaveLayout);
        jSaveLayout.setHorizontalGroup(
            jSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jSaveLayout.setVerticalGroup(
            jSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pAccountLayout = new javax.swing.GroupLayout(pAccount);
        pAccount.setLayout(pAccountLayout);
        pAccountLayout.setHorizontalGroup(
            pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAccountLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pAccountLayout.createSequentialGroup()
                        .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAccountLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pAccountLayout.createSequentialGroup()
                                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pAccountLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pAccountLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pAccountLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pAccountLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pAccountLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pAccountLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel16, jLabel17, jLabel18, jLabel7});

        pAccountLayout.setVerticalGroup(
            pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAccountLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAccountLayout.createSequentialGroup()
                        .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pAccountLayout.createSequentialGroup()
                                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pAccountLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSave, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        pAccountLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jAddress, jEmail, jName, jPhone});

        pAccountLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel16, jLabel17, jLabel18, jLabel7});

        bg.add(pAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 600, 460));

        pRent.setBackground(new java.awt.Color(102, 102, 102));
        pRent.setPreferredSize(new java.awt.Dimension(604, 460));

        tRent.setBackground(new java.awt.Color(204, 204, 204));
        tRent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tRent.setForeground(new java.awt.Color(102, 102, 102));
        tRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Borrow", "Return", "Cars", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tRent.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tRent.setEnabled(false);
        tRent.setFocusable(false);
        tRent.setGridColor(new java.awt.Color(204, 204, 204));
        tRent.setRequestFocusEnabled(false);
        tRent.setRowHeight(30);
        tRent.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tRent.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tRent);
        if (tRent.getColumnModel().getColumnCount() > 0) {
            tRent.getColumnModel().getColumn(0).setResizable(false);
            tRent.getColumnModel().getColumn(0).setPreferredWidth(20);
            tRent.getColumnModel().getColumn(1).setResizable(false);
            tRent.getColumnModel().getColumn(2).setResizable(false);
            tRent.getColumnModel().getColumn(2).setHeaderValue("Return");
            tRent.getColumnModel().getColumn(3).setResizable(false);
            tRent.getColumnModel().getColumn(4).setResizable(false);
        }

        bNew.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PLUS.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("NEW");

        javax.swing.GroupLayout bNewLayout = new javax.swing.GroupLayout(bNew);
        bNew.setLayout(bNewLayout);
        bNewLayout.setHorizontalGroup(
            bNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bNewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bNewLayout.setVerticalGroup(
            bNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pRentLayout = new javax.swing.GroupLayout(pRent);
        pRent.setLayout(pRentLayout);
        pRentLayout.setHorizontalGroup(
            pRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRentLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        pRentLayout.setVerticalGroup(
            pRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        bg.add(pRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 600, 460));

        pLend.setBackground(new java.awt.Color(102, 102, 102));
        pLend.setPreferredSize(new java.awt.Dimension(604, 460));

        tLend.setBackground(new java.awt.Color(204, 204, 204));
        tLend.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tLend.setForeground(new java.awt.Color(102, 102, 102));
        tLend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Owner Name", "Lend Date", "Cars", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tLend.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tLend.setEnabled(false);
        tLend.setGridColor(new java.awt.Color(204, 204, 204));
        tLend.setRequestFocusEnabled(false);
        tLend.setRowHeight(30);
        tLend.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tLend.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tLend);
        if (tLend.getColumnModel().getColumnCount() > 0) {
            tLend.getColumnModel().getColumn(0).setResizable(false);
            tLend.getColumnModel().getColumn(0).setPreferredWidth(20);
            tLend.getColumnModel().getColumn(1).setResizable(false);
            tLend.getColumnModel().getColumn(2).setResizable(false);
            tLend.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PLUS.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("NEW");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pLendLayout = new javax.swing.GroupLayout(pLend);
        pLend.setLayout(pLendLayout);
        pLendLayout.setHorizontalGroup(
            pLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLendLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        pLendLayout.setVerticalGroup(
            pLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLendLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        bg.add(pLend, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 600, 460));

        pDriver.setBackground(new java.awt.Color(102, 102, 102));
        pDriver.setPreferredSize(new java.awt.Dimension(604, 460));

        javax.swing.GroupLayout pDriverLayout = new javax.swing.GroupLayout(pDriver);
        pDriver.setLayout(pDriverLayout);
        pDriverLayout.setHorizontalGroup(
            pDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pDriverLayout.setVerticalGroup(
            pDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        bg.add(pDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 600, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditMousePressed
        jName.setEditable(true);
        jEmail.setEditable(true);
        jAddress.setEditable(true);
        jPhone.setEditable(true);
        jSave.setVisible(true);
    }//GEN-LAST:event_jEditMousePressed

    //Navigation
    public void setColor(JPanel panel){
        panel.setBackground(new Color(204,204,204));
    }
    
    public void resetColor(JPanel panel){
        panel.setBackground(new Color(255,255,255));
    }
    
    public JPanel getBtnaccount(){
        return nAccount;
    } 
    
    public JPanel getBtnrent(){
        return nRent;
    }
    
    public JPanel getBtnlend(){
        return nLend;
    }
    
    public JPanel getBtndriver(){
        return nDriver;
    }
    
    public JPanel getPaccount(){
        return pAccount;
    }

    public JPanel getPrent(){
        return pRent;
    }
    
    public JPanel getPlend(){
        return pLend;
    }
    
    public JPanel getPdriver(){
        return pDriver;
    }
    
    public void addMouseAdapter(MouseAdapter e){
        nAccount.addMouseListener(e);
        nRent.addMouseListener(e);
        nLend.addMouseListener(e);
        nDriver.addMouseListener(e);
        jExit.addMouseListener(e);
    }
    
    public JLabel getBtnExit(){
        return jExit;
    }
    //End Navigation
    
    //Panel Account
    public JTextField getFName(){
        return jName;
    }
    
    public JTextField getFEmail(){
        return jEmail;
    }
    
    public JTextField getFAddress(){
        return jAddress;
    }
    
    public JTextField getFPhone(){
        return jPhone;
    }
    
    public JPanel getBtnEdit(){
        return jEdit;
    }
    
    public JPanel getBtnSave(){
        return jSave;
    }
    //End Panel Account
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Navigation;
    private javax.swing.JPanel bNew;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField jAddress;
    private javax.swing.JPanel jEdit;
    private javax.swing.JTextField jEmail;
    private javax.swing.JLabel jExit;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jPhone;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPanel jSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel nAccount;
    private javax.swing.JPanel nDriver;
    private javax.swing.JPanel nLend;
    private javax.swing.JPanel nRent;
    private javax.swing.JPanel pAccount;
    private javax.swing.JPanel pDriver;
    private javax.swing.JPanel pLend;
    private javax.swing.JPanel pRent;
    private javax.swing.JTable tLend;
    private javax.swing.JTable tRent;
    // End of variables declaration//GEN-END:variables
    
}
