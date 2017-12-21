package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        jName.setEditable(false);
        jEmail.setEditable(false);
        jAddress.setEditable(false);
        jPhone.setEditable(false);
        jSave.setVisible(false);
        
        rDelete.setVisible(false);
        rDone.setVisible(false);
        dDelete.setVisible(false);
        dDone.setVisible(false);
        tRent.setEnabled(false);
        tLend.setEnabled(false);
        tDriver.setEnabled(false);
        
        //Table Rent
        tRent.getTableHeader().setPreferredSize(new Dimension(tRent.getTableHeader().getWidth(), 30));
        tRent.getTableHeader().setBorder(null);
        tRent.setShowGrid(false);
        
        jScrollPane5.setOpaque(false);
        jScrollPane5.getViewport().setOpaque(false);
        
        //Table Lend
        tLend.getTableHeader().setPreferredSize(new Dimension(tLend.getTableHeader().getWidth(), 30));
        tLend.getTableHeader().setBorder(null);
        tLend.setShowGrid(false);
        
        jScrollPane6.setOpaque(false);
        jScrollPane6.getViewport().setOpaque(false);
        
        //Table Lend
        tDriver.getTableHeader().setPreferredSize(new Dimension(tDriver.getTableHeader().getWidth(), 30));
        tDriver.getTableHeader().setBorder(null);
        tDriver.setShowGrid(false);
        
        jScrollPane7.setOpaque(false);
        jScrollPane7.getViewport().setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTextField2 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
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
        bNew = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tRent = new javax.swing.JTable();
        jSearchR = new javax.swing.JTextField();
        rEdit = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        rDelete = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        rDone = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        pLend = new javax.swing.JPanel();
        newLend = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tLend = new javax.swing.JTable();
        jSearchL = new javax.swing.JTextField();
        pDriver = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tDriver = new javax.swing.JTable();
        newDriver = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jOrder = new javax.swing.JComboBox<>();
        dEdit = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        dDelete = new javax.swing.JPanel();
        del = new javax.swing.JLabel();
        dDone = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();

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

        jFormattedTextField1.setText("jFormattedTextField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(102, 102, 102));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jExit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jExit.setForeground(new java.awt.Color(204, 204, 204));
        jExit.setText("   X ");
        bg.add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 40));

        Navigation.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cars.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Co-Cars");

        nAccount.setBackground(new java.awt.Color(255, 255, 255));
        nAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
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
                .addContainerGap(79, Short.MAX_VALUE))
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

        nRent.setBackground(new java.awt.Color(204, 204, 204));
        nRent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nRent.setPreferredSize(new java.awt.Dimension(200, 59));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
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
                .addContainerGap(106, Short.MAX_VALUE))
        );
        nRentLayout.setVerticalGroup(
            nRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nRentLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        nLend.setBackground(new java.awt.Color(204, 204, 204));
        nLend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nLend.setPreferredSize(new java.awt.Dimension(124, 54));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
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
                .addContainerGap(104, Short.MAX_VALUE))
        );
        nLendLayout.setVerticalGroup(
            nLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nLendLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        nDriver.setBackground(new java.awt.Color(204, 204, 204));
        nDriver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nDriver.setPreferredSize(new java.awt.Dimension(124, 54));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        nDriverLayout.setVerticalGroup(
            nDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nDriverLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel10.setText("HAR - 2017");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1))
            .addGroup(NavigationLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2))
            .addComponent(nAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(nRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(nLend, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(nDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel10))
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        NavigationLayout.setVerticalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(nAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nLend, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

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
        jName.setCaretColor(new java.awt.Color(255, 255, 255));
        jName.setSelectionColor(new java.awt.Color(0, 0, 0));

        jEmail.setBackground(new java.awt.Color(102, 102, 102));
        jEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jEmail.setForeground(new java.awt.Color(255, 255, 255));
        jEmail.setText("hatta.eka.p@gmail.com");
        jEmail.setBorder(null);
        jEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        jEmail.setSelectionColor(new java.awt.Color(0, 0, 0));

        jAddress.setBackground(new java.awt.Color(102, 102, 102));
        jAddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jAddress.setForeground(new java.awt.Color(255, 255, 255));
        jAddress.setText("Wisma Annafi");
        jAddress.setBorder(null);
        jAddress.setCaretColor(new java.awt.Color(255, 255, 255));
        jAddress.setSelectionColor(new java.awt.Color(0, 0, 0));

        jPhone.setBackground(new java.awt.Color(102, 102, 102));
        jPhone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPhone.setForeground(new java.awt.Color(255, 255, 255));
        jPhone.setText("081221447275");
        jPhone.setBorder(null);
        jPhone.setCaretColor(new java.awt.Color(255, 255, 255));
        jPhone.setSelectionColor(new java.awt.Color(0, 0, 0));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jEdit.setBackground(new java.awt.Color(255, 255, 255));
        jEdit.setForeground(new java.awt.Color(255, 255, 255));
        jEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
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
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAccountLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pAccountLayout.createSequentialGroup()
                        .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(pAccountLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pAccountLayout.createSequentialGroup()
                                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
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
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        pAccountLayout.setVerticalGroup(
            pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAccountLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAccountLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        bNew.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PLUS.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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

        tRent.setBackground(new java.awt.Color(51, 51, 51));
        tRent.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        tRent.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tRent.setForeground(new java.awt.Color(255, 255, 255));
        tRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Borrow", "Return", "NoPlat", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tRent.setOpaque(false);
        tRent.setRowHeight(35);
        tRent.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tRent.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tRent.setShowHorizontalLines(false);
        tRent.setShowVerticalLines(false);
        tRent.getTableHeader().setResizingAllowed(false);
        tRent.getTableHeader().setReorderingAllowed(false);
        tRent.setUpdateSelectionOnSort(false);
        jScrollPane5.setViewportView(tRent);
        if (tRent.getColumnModel().getColumnCount() > 0) {
            tRent.getColumnModel().getColumn(0).setResizable(false);
            tRent.getColumnModel().getColumn(1).setResizable(false);
            tRent.getColumnModel().getColumn(2).setResizable(false);
            tRent.getColumnModel().getColumn(3).setResizable(false);
            tRent.getColumnModel().getColumn(3).setHeaderValue("NoPlat");
            tRent.getColumnModel().getColumn(4).setResizable(false);
        }

        jSearchR.setBackground(new java.awt.Color(255, 255, 255));
        jSearchR.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jSearchR.setForeground(new java.awt.Color(0, 0, 0));
        jSearchR.setText("Search name here...");
        jSearchR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        rEdit.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("EDIT");

        javax.swing.GroupLayout rEditLayout = new javax.swing.GroupLayout(rEdit);
        rEdit.setLayout(rEditLayout);
        rEditLayout.setHorizontalGroup(
            rEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rEditLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel28)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        rEditLayout.setVerticalGroup(
            rEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rDelete.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("DELETE");

        javax.swing.GroupLayout rDeleteLayout = new javax.swing.GroupLayout(rDelete);
        rDelete.setLayout(rDeleteLayout);
        rDeleteLayout.setHorizontalGroup(
            rDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );
        rDeleteLayout.setVerticalGroup(
            rDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rDone.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("DONE");

        javax.swing.GroupLayout rDoneLayout = new javax.swing.GroupLayout(rDone);
        rDone.setLayout(rDoneLayout);
        rDoneLayout.setHorizontalGroup(
            rDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rDoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rDoneLayout.setVerticalGroup(
            rDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rDoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pRentLayout = new javax.swing.GroupLayout(pRent);
        pRent.setLayout(pRentLayout);
        pRentLayout.setHorizontalGroup(
            pRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRentLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pRentLayout.createSequentialGroup()
                        .addComponent(bNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        pRentLayout.setVerticalGroup(
            pRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearchR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        bg.add(pRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 600, 460));

        pLend.setBackground(new java.awt.Color(102, 102, 102));
        pLend.setPreferredSize(new java.awt.Dimension(604, 460));

        newLend.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PLUS.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("NEW");

        javax.swing.GroupLayout newLendLayout = new javax.swing.GroupLayout(newLend);
        newLend.setLayout(newLendLayout);
        newLendLayout.setHorizontalGroup(
            newLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newLendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        newLendLayout.setVerticalGroup(
            newLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newLendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tLend.setBackground(new java.awt.Color(51, 51, 51));
        tLend.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        tLend.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tLend.setForeground(new java.awt.Color(255, 255, 255));
        tLend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Lend", "NoPlat", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tLend.setEnabled(false);
        tLend.setOpaque(false);
        tLend.setRowHeight(35);
        tLend.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tLend.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tLend.setShowHorizontalLines(false);
        tLend.setShowVerticalLines(false);
        tLend.getTableHeader().setResizingAllowed(false);
        tLend.getTableHeader().setReorderingAllowed(false);
        tLend.setUpdateSelectionOnSort(false);
        jScrollPane6.setViewportView(tLend);
        if (tLend.getColumnModel().getColumnCount() > 0) {
            tLend.getColumnModel().getColumn(0).setResizable(false);
            tLend.getColumnModel().getColumn(1).setResizable(false);
            tLend.getColumnModel().getColumn(2).setResizable(false);
            tLend.getColumnModel().getColumn(3).setResizable(false);
        }

        jSearchL.setBackground(new java.awt.Color(255, 255, 255));
        jSearchL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jSearchL.setForeground(new java.awt.Color(0, 0, 0));
        jSearchL.setText("Search name here...");
        jSearchL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout pLendLayout = new javax.swing.GroupLayout(pLend);
        pLend.setLayout(pLendLayout);
        pLendLayout.setHorizontalGroup(
            pLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLendLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pLendLayout.createSequentialGroup()
                        .addComponent(newLend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSearchL, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        pLendLayout.setVerticalGroup(
            pLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLendLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pLendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newLend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearchL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        bg.add(pLend, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 600, 460));

        pDriver.setBackground(new java.awt.Color(102, 102, 102));
        pDriver.setPreferredSize(new java.awt.Dimension(604, 460));

        tDriver.setBackground(new java.awt.Color(51, 51, 51));
        tDriver.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        tDriver.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tDriver.setForeground(new java.awt.Color(255, 255, 255));
        tDriver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Adress", "Phone", "Price", "Sim"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tDriver.setEnabled(false);
        tDriver.setOpaque(false);
        tDriver.setRowHeight(35);
        tDriver.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tDriver.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tDriver.setShowHorizontalLines(false);
        tDriver.setShowVerticalLines(false);
        tDriver.getTableHeader().setResizingAllowed(false);
        tDriver.getTableHeader().setReorderingAllowed(false);
        tDriver.setUpdateSelectionOnSort(false);
        jScrollPane7.setViewportView(tDriver);
        if (tDriver.getColumnModel().getColumnCount() > 0) {
            tDriver.getColumnModel().getColumn(0).setResizable(false);
            tDriver.getColumnModel().getColumn(1).setResizable(false);
            tDriver.getColumnModel().getColumn(2).setResizable(false);
            tDriver.getColumnModel().getColumn(3).setResizable(false);
            tDriver.getColumnModel().getColumn(4).setMinWidth(0);
            tDriver.getColumnModel().getColumn(4).setPreferredWidth(0);
            tDriver.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        newDriver.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PLUS.png"))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("NEW");

        javax.swing.GroupLayout newDriverLayout = new javax.swing.GroupLayout(newDriver);
        newDriver.setLayout(newDriverLayout);
        newDriverLayout.setHorizontalGroup(
            newDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newDriverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        newDriverLayout.setVerticalGroup(
            newDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newDriverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSearch.setBackground(new java.awt.Color(255, 255, 255));
        jSearch.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jSearch.setForeground(new java.awt.Color(0, 0, 0));
        jSearch.setText("Search name here...");
        jSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Order By");

        jOrder.setBackground(new java.awt.Color(204, 204, 204));
        jOrder.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jOrder.setForeground(new java.awt.Color(51, 51, 51));
        jOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Price", "Name", "Address" }));
        jOrder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        dEdit.setBackground(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("EDIT");

        javax.swing.GroupLayout dEditLayout = new javax.swing.GroupLayout(dEdit);
        dEdit.setLayout(dEditLayout);
        dEditLayout.setHorizontalGroup(
            dEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dEditLayout.setVerticalGroup(
            dEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dDelete.setBackground(new java.awt.Color(255, 255, 255));

        del.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del.setText("DELETE");

        javax.swing.GroupLayout dDeleteLayout = new javax.swing.GroupLayout(dDelete);
        dDelete.setLayout(dDeleteLayout);
        dDeleteLayout.setHorizontalGroup(
            dDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        dDeleteLayout.setVerticalGroup(
            dDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dDone.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("DONE");

        javax.swing.GroupLayout dDoneLayout = new javax.swing.GroupLayout(dDone);
        dDone.setLayout(dDoneLayout);
        dDoneLayout.setHorizontalGroup(
            dDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dDoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dDoneLayout.setVerticalGroup(
            dDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dDoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pDriverLayout = new javax.swing.GroupLayout(pDriver);
        pDriver.setLayout(pDriverLayout);
        pDriverLayout.setHorizontalGroup(
            pDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDriverLayout.createSequentialGroup()
                .addGroup(pDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pDriverLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(jOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDriverLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDriverLayout.createSequentialGroup()
                                .addComponent(newDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pDriverLayout.setVerticalGroup(
            pDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDriverLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDriverLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addGroup(pDriverLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

        setSize(new java.awt.Dimension(800, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Navigation
    public void setColor(JPanel panel){
        panel.setBackground(new Color(255,255,255));
    }
    
    public void resetColor(JPanel panel){
        panel.setBackground(new Color(204,204,204));
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
    
    public JPanel getBtnnewLend(){
        return newLend;
    }
    
    public JPanel getBtnnewDriver(){
        return newDriver;
    }
    
    public JTable getTableRent(){
        return tRent;
    }
    
    public JTable getTableLend(){
        return tLend;
    }
    
    public JComboBox getOrder(){
        return jOrder;
    }
    
    public JLabel getBtnExit(){
        return jExit;
    }
    
    //End Navigation
    
    //Rent
    public JPanel getrEdit(){
        return rEdit;
    }
    
    public JPanel getrDelete(){
        return rDelete;
    }
    
    public JPanel getrDone(){
        return rDone;
    }
    
    //Driver
    public JPanel getdEdit(){
        return dEdit;
    }
    
    public JPanel getdDelete(){
        return dDelete;
    }
    
    public JPanel getdDone(){
        return dDone;
    }
    
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
    
    public JTable getTableDriver(){
        return tDriver;
    }
    
    public JPanel getNewRent(){
        return bNew;
    }
    
    public JTextField getSearch(){
        return jSearch;
    }
    
    public JTextField getSearchR(){
        return jSearchR;
    }
    
    public JTextField getSearchL(){
        return jSearchL;
    }
    
    public void savee(){
        jName.setEditable(false);
        jEmail.setEditable(false);
        jAddress.setEditable(false);
        jPhone.setEditable(false);
        jSave.setVisible(false);
    }
    
    public void addMouseAdapter(MouseAdapter e){
        nAccount.addMouseListener(e);
        nRent.addMouseListener(e);
        nLend.addMouseListener(e);
        nDriver.addMouseListener(e);
        jExit.addMouseListener(e);
        jEdit.addMouseListener(e);
        jSave.addMouseListener(e);
        newLend.addMouseListener(e);
        newDriver.addMouseListener(e);
        bNew.addMouseListener(e);
        jSearch.addMouseListener(e);
        jSearchR.addMouseListener(e);
        jSearchL.addMouseListener(e);
        dEdit.addMouseListener(e);
        tDriver.addMouseListener(e);
        dDelete.addMouseListener(e);
        dDone.addMouseListener(e);
        rEdit.addMouseListener(e);
        rDelete.addMouseListener(e);
        rDone.addMouseListener(e);
    }
    
    public void addKeyListener(KeyListener e){
        jSearch.addKeyListener(e);
        jSearchR.addKeyListener(e);
        jSearchL.addKeyListener(e);
        tDriver.addKeyListener(e);
        tRent.addKeyListener(e);
    }
    
    public void addItemListener(ItemListener e){
        jOrder.addItemListener(e);
    }
    
    //End Panel Account
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Navigation;
    private javax.swing.JPanel bNew;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel dDelete;
    private javax.swing.JPanel dDone;
    private javax.swing.JPanel dEdit;
    private javax.swing.JLabel del;
    private javax.swing.JTextField jAddress;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jName;
    private javax.swing.JComboBox<String> jOrder;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jPhone;
    private javax.swing.JPanel jSave;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jSearch;
    private javax.swing.JTextField jSearchL;
    private javax.swing.JTextField jSearchR;
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
    private javax.swing.JPanel newDriver;
    private javax.swing.JPanel newLend;
    private javax.swing.JPanel pAccount;
    private javax.swing.JPanel pDriver;
    private javax.swing.JPanel pLend;
    private javax.swing.JPanel pRent;
    private javax.swing.JPanel rDelete;
    private javax.swing.JPanel rDone;
    private javax.swing.JPanel rEdit;
    private javax.swing.JTable tDriver;
    private javax.swing.JTable tLend;
    private javax.swing.JTable tRent;
    // End of variables declaration//GEN-END:variables
    
}
