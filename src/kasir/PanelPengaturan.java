/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kasir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class PanelPengaturan extends javax.swing.JPanel {

    public PanelPengaturan() {
        initComponents();
        loadDataPengguna();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelPengaturan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tNamaPemilik = new javax.swing.JTextField();
        tAlamat = new javax.swing.JTextField();
        tProvinsi = new javax.swing.JTextField();
        tKabupaten = new javax.swing.JTextField();
        tKecamatan = new javax.swing.JTextField();
        tKelurahan = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        tNoHp = new javax.swing.JTextField();
        bSubmit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(730, 646));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237), 2));

        panelPengaturan.setBackground(new java.awt.Color(255, 255, 255));
        panelPengaturan.setPreferredSize(new java.awt.Dimension(730, 646));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nama Pemilik");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Provinsi");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Kabupaten");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Kecamatan");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Kelurahan");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("No Telp ");

        tNamaPemilik.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tAlamat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAlamatActionPerformed(evt);
            }
        });

        tProvinsi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tKabupaten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tKecamatan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tKelurahan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tNoHp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        bSubmit.setBackground(new java.awt.Color(102, 102, 255));
        bSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bSubmit.setForeground(new java.awt.Color(255, 255, 255));
        bSubmit.setText("Submit");
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPengaturanLayout = new javax.swing.GroupLayout(panelPengaturan);
        panelPengaturan.setLayout(panelPengaturanLayout);
        panelPengaturanLayout.setHorizontalGroup(
            panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPengaturanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelPengaturanLayout.createSequentialGroup()
                            .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(48, 48, 48)
                            .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tKecamatan)
                                    .addComponent(tNamaPemilik)
                                    .addComponent(tAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                                    .addComponent(tProvinsi)
                                    .addComponent(tKabupaten))
                                .addComponent(tKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelPengaturanLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPengaturanLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPengaturanLayout.setVerticalGroup(
            panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPengaturanLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNamaPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tProvinsi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tKabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 2));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Pengaturan");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPengaturan, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
public void loadDataPengguna() {
    try {
        Connection con = koneksi.konek();
        String sql = "SELECT namaPemilik, alamat, email, no_hp FROM identitas";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            tNamaPemilik.setText(rs.getString("namaPemilik"));
            tAlamat.setText(rs.getString("alamat"));
            tEmail.setText(rs.getString("email"));
            tNoHp.setText(rs.getString("no_hp"));
        }

        rs.close();
        ps.close();
        con.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal load data: " + e.getMessage());
    }
}

    private void tAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAlamatActionPerformed

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        // TODO add your handling code here:
            PanelTentang panelTentang = new PanelTentang();
            
            PanelTentang pt = new PanelTentang(); // atau ambil instance yang sudah ada
            
            String nama = tNamaPemilik.getText();
            String alamat = tAlamat.getText();
            String provinsi = tProvinsi.getText();
            String kabupaten = tKabupaten.getText();
            String kecamatan = tKecamatan.getText();
            String desa = tKelurahan.getText();
            String email = tEmail.getText();
            String noHP = tNoHp.getText();
            if(nama.isEmpty()||alamat.isEmpty()||email.isEmpty()||noHP.isEmpty()){
                JOptionPane.showMessageDialog(null, "Isi semua field untuk mengubah!");
                return;
            }
           try {
    Connection con = koneksi.konek();
    String sql = "UPDATE identitas SET namaPemilik=?, alamat=?, no_hp=?, email=? WHERE namaPemilik=? ";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, nama);
    ps.setString(2, alamat + " " + desa + " " + kecamatan + " " + kabupaten + " " + provinsi);
    ps.setString(3, noHP);
    ps.setString(4, email);
    ps.setString(5, nama);
    int result = ps.executeUpdate();
    ps.close();
    con.close();

    if (result > 0) {
        // langsung update panel Tentang
        pt.tNamaPemilik.setText(nama);
        pt.tAlamat.setText(alamat);
        pt.tNoTelepon.setText(noHP);
        pt.tEmail.setText(email);
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    } else {
        JOptionPane.showMessageDialog(null, "Tidak ada data yang diubah!");
    }

} catch (SQLException sQLException) {
    JOptionPane.showMessageDialog(null, "Error: " + sQLException.getMessage());
}

       
                    
        
        

    }//GEN-LAST:event_bSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSubmit;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panelPengaturan;
    private javax.swing.JTextField tAlamat;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tKabupaten;
    private javax.swing.JTextField tKecamatan;
    private javax.swing.JTextField tKelurahan;
    private javax.swing.JTextField tNamaPemilik;
    private javax.swing.JTextField tNoHp;
    private javax.swing.JTextField tProvinsi;
    // End of variables declaration//GEN-END:variables
}
