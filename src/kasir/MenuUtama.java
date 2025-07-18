/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kasir;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Point;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MyBook Hype AMD
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama(String username) {
        initComponents();
        labelUser.setText( username);
       
    }
        
    public MenuUtama() {
        initComponents();
        setAppIcon();
        dinarmart.setIconTextGap(25);
        setExtendedState(MAXIMIZED_BOTH);
        bDashboard.setBackground(new Color(0, 123, 255));  
        bKasir.setBackground(new Color(51, 51, 51));
        bPenjualan.setBackground(new Color(51, 51, 51));
        bBarang.setBackground(new Color(51, 51, 51));
        bKasir.setBackground(new Color(51,51,51));
        bTentang.setBackground(new Color(51,51,51));
        bPengaturan.setBackground(new Color(51,51,51));
        bUser.setBackground(new Color(51,51,51));
        currentTab.setText("Dashboard");
        content.removeAll();
        content.add(new PanelDashboard());
        content.repaint();
        content.revalidate();
        
    }
    private void setAppIcon() {
       
        java.net.URL iconURL = getClass().getResource("/kasir/logo/store.png");
        if (iconURL != null) {
            setIconImage(new javax.swing.ImageIcon(iconURL).getImage());
        } else {
            System.err.println("Logo tidak ditemukan!");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        dinarmart = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        bDashboard = new javax.swing.JButton();
        bKasir = new javax.swing.JButton();
        bPenjualan = new javax.swing.JButton();
        bBarang = new javax.swing.JButton();
        bPengaturan = new javax.swing.JButton();
        bUser = new javax.swing.JButton();
        bTentang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        currentTab = new javax.swing.JLabel();
        profil = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dinar Mart POS");
        setUndecorated(true);

        mainPanel.setPreferredSize(new java.awt.Dimension(1280, 695));

        content.setPreferredSize(new java.awt.Dimension(939, 575));
        content.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(55, 61, 79));

        dinarmart.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dinarmart.setForeground(new java.awt.Color(255, 255, 255));
        dinarmart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-store-50.png"))); // NOI18N
        dinarmart.setText("Dinar Mart");

        sidebar.setBackground(new java.awt.Color(51, 51, 51));
        sidebar.setPreferredSize(new java.awt.Dimension(250, 600));

        bDashboard.setBackground(new java.awt.Color(51, 51, 51));
        bDashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bDashboard.setForeground(new java.awt.Color(255, 255, 255));
        bDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-dashboard-30.png"))); // NOI18N
        bDashboard.setText("Dashboard");
        bDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        bDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bDashboard.setIconTextGap(20);
        bDashboard.setMargin(new java.awt.Insets(2, 30, 3, 14));
        bDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDashboardActionPerformed(evt);
            }
        });

        bKasir.setBackground(new java.awt.Color(51, 51, 51));
        bKasir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bKasir.setForeground(new java.awt.Color(255, 255, 255));
        bKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-cashier-30.png"))); // NOI18N
        bKasir.setText("Kasir");
        bKasir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        bKasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bKasir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bKasir.setIconTextGap(20);
        bKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKasirActionPerformed(evt);
            }
        });

        bPenjualan.setBackground(new java.awt.Color(51, 51, 51));
        bPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        bPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-sales-30.png"))); // NOI18N
        bPenjualan.setText("Penjualan");
        bPenjualan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        bPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPenjualan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bPenjualan.setIconTextGap(20);
        bPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPenjualanActionPerformed(evt);
            }
        });

        bBarang.setBackground(new java.awt.Color(51, 51, 51));
        bBarang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bBarang.setForeground(new java.awt.Color(255, 255, 255));
        bBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-grocery-30.png"))); // NOI18N
        bBarang.setText("Barang");
        bBarang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        bBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bBarang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bBarang.setIconTextGap(20);
        bBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBarangActionPerformed(evt);
            }
        });

        bPengaturan.setBackground(new java.awt.Color(51, 51, 51));
        bPengaturan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bPengaturan.setForeground(new java.awt.Color(255, 255, 255));
        bPengaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-settings-30.png"))); // NOI18N
        bPengaturan.setText("Pengaturan");
        bPengaturan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        bPengaturan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPengaturan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bPengaturan.setIconTextGap(20);
        bPengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPengaturanActionPerformed(evt);
            }
        });

        bUser.setBackground(new java.awt.Color(51, 51, 51));
        bUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bUser.setForeground(new java.awt.Color(255, 255, 255));
        bUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-user-30.png"))); // NOI18N
        bUser.setText("User");
        bUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        bUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bUser.setIconTextGap(20);
        bUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUserActionPerformed(evt);
            }
        });

        bTentang.setBackground(new java.awt.Color(51, 51, 51));
        bTentang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bTentang.setForeground(new java.awt.Color(255, 255, 255));
        bTentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-about-30.png"))); // NOI18N
        bTentang.setText("Tentang");
        bTentang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        bTentang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bTentang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bTentang.setIconTextGap(20);
        bTentang.setMargin(new java.awt.Insets(2, 20, 3, 14));
        bTentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTentangActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikasi Inventori dan POS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu Utama Aplikasi");

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bTentang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bKasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(bPengaturan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bTentang, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(dinarmart)
                .addContainerGap(146, Short.MAX_VALUE))
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dinarmart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(25, 118, 210));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home  >>");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 23, -1, -1));

        currentTab.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        currentTab.setForeground(new java.awt.Color(255, 255, 255));
        currentTab.setText("Dashboard");
        jPanel2.add(currentTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 23, -1, -1));

        profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-profile-50.png"))); // NOI18N
        profil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilMouseClicked(evt);
            }
        });
        jPanel2.add(profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 4, -1, 50));

        labelUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUser.setText("Admin");
        jPanel2.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 50, 20));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 759, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void bDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDashboardActionPerformed
        // TODO add your handling code here:
        bDashboard.setBackground(new Color(0, 123, 255));  
        bKasir.setBackground(new Color(51, 51, 51));
        bPenjualan.setBackground(new Color(51, 51, 51));
        bBarang.setBackground(new Color(51, 51, 51));
        bKasir.setBackground(new Color(51,51,51));
        bTentang.setBackground(new Color(51,51,51));
        bPengaturan.setBackground(new Color(51,51,51));
        bUser.setBackground(new Color(51,51,51));
        currentTab.setText("Dashboard");
        content.removeAll();
        content.add(new PanelDashboard());
        content.repaint();
        content.revalidate();
    }//GEN-LAST:event_bDashboardActionPerformed
    private userpopup popup = null;
    private void profilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilMouseClicked
        //popupProfil.show(profil, 0, profil.getHeight());//           
        boolean close = true;
        try {
        if (popup != null && popup.isVisible()) {
            popup.setVisible(false);
            popup.dispose();
            popup = null;
        } else {
            popup = new userpopup(MenuUtama.this, false);
            Point lokasi = profil.getLocationOnScreen(); 
            int x = lokasi.x + profil.getWidth() - 250; 
            int y = lokasi.y + profil.getHeight(); 
            popup.setLocation(x, y);
            popup.setVisible(true);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }      
    }//GEN-LAST:event_profilMouseClicked

    private void bPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPenjualanActionPerformed
        // TODO add your handling code here:
        bPenjualan.setBackground(new Color(0, 123, 255));
        bDashboard.setBackground(new Color(51, 51, 51));  
        bKasir.setBackground(new Color(51, 51, 51));
        bBarang.setBackground(new Color(51, 51, 51));
        bTentang.setBackground(new Color(51,51,51));
        bPengaturan.setBackground(new Color(51,51,51));
        bUser.setBackground(new Color(51,51,51));
        currentTab.setText("Penjualan");
        content.removeAll();
        content.add(new PanelPenjualan());
        content.repaint();
        content.revalidate();
    }//GEN-LAST:event_bPenjualanActionPerformed

    private void bBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBarangActionPerformed
        // TODO add your handling code here:
        bBarang.setBackground(new Color(0, 123, 255));
        bPenjualan.setBackground(new Color(51, 51, 51));
        bDashboard.setBackground(new Color(51, 51, 51));  
        bKasir.setBackground(new Color(51, 51, 51));
        bTentang.setBackground(new Color(51,51,51));
        bPengaturan.setBackground(new Color(51,51,51));
        bUser.setBackground(new Color(51,51,51));
        currentTab.setText("Barang");
        content.removeAll();
        content.add(new PanelBarang());
        content.repaint();
        content.revalidate();
    }//GEN-LAST:event_bBarangActionPerformed

    private void bPengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPengaturanActionPerformed
        // TODO add your handling code here:
        bPengaturan.setBackground(new Color(0,123,255));
        bBarang.setBackground(new Color(51, 51, 51));
        bPenjualan.setBackground(new Color(51, 51, 51));
        bDashboard.setBackground(new Color(51, 51, 51));  
        bKasir.setBackground(new Color(51, 51, 51));
        bUser.setBackground(new Color(51,51,51));
        bTentang.setBackground(new Color(51,51,51));
        currentTab.setText("Pengaturan");
        content.removeAll();
        content.add(new PanelPengaturan());
        content.repaint();
        content.revalidate();
    }//GEN-LAST:event_bPengaturanActionPerformed

    private void bUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUserActionPerformed
        // TODO add your handling code here:
        bUser.setBackground(new Color(0,123,255));
        bPengaturan.setBackground(new Color(51,51,51));
        bBarang.setBackground(new Color(51, 51, 51));
        bPenjualan.setBackground(new Color(51, 51, 51));
        bDashboard.setBackground(new Color(51, 51, 51));  
        bKasir.setBackground(new Color(51, 51, 51));
        bTentang.setBackground(new Color(51,51,51));
        currentTab.setText("user");
        content.removeAll();
        content.add(new PanelUser());
        content.repaint();
        content.revalidate();
    }//GEN-LAST:event_bUserActionPerformed

    private void bTentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTentangActionPerformed
        // TODO add your handling code here:
         bTentang.setBackground(new Color(0,123,255));
        bUser.setBackground(new Color(51,51,51));
        bPengaturan.setBackground(new Color(51,51,51));
        bBarang.setBackground(new Color(51, 51, 51));
        bPenjualan.setBackground(new Color(51, 51, 51));
        bDashboard.setBackground(new Color(51, 51, 51));  
        bKasir.setBackground(new Color(51, 51, 51));
       
        currentTab.setText("Tentang");
        content.removeAll();
        content.add(new PanelTentang());
        content.repaint();
        content.revalidate();
    }//GEN-LAST:event_bTentangActionPerformed

    private void bKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKasirActionPerformed
        // TODO add your handling code here:
        bKasir.setBackground(new Color(0, 123, 255));
        bTentang.setBackground(new Color(51,51,51));
        bUser.setBackground(new Color(51,51,51));
        bPengaturan.setBackground(new Color(51,51,51));
        bBarang.setBackground(new Color(51, 51, 51));
        bPenjualan.setBackground(new Color(51, 51, 51));
        bDashboard.setBackground(new Color(51, 51, 51));  
        
        currentTab.setText("Kasir");
        content.removeAll();
        content.add(new PanelKasir());
        content.repaint();
        content.revalidate();
    }//GEN-LAST:event_bKasirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBarang;
    private javax.swing.JButton bDashboard;
    private javax.swing.JButton bKasir;
    private javax.swing.JButton bPengaturan;
    private javax.swing.JButton bPenjualan;
    private javax.swing.JButton bTentang;
    private javax.swing.JButton bUser;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel currentTab;
    private javax.swing.JLabel dinarmart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel profil;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
