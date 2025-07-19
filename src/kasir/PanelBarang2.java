/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kasir;

import java.awt.HeadlessException;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static kasir.PanelBarang.tabelBarang;

public class PanelBarang2 extends javax.swing.JPanel {

    public PanelBarang2() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBarang = new javax.swing.JPanel();
        bkembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tNamaBarang = new javax.swing.JTextField();
        tHarga = new javax.swing.JTextField();
        tStok = new javax.swing.JTextField();
        bSubmit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Chooser = new javax.swing.JButton();
        fotopath = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(730, 646));

        panelBarang.setBackground(new java.awt.Color(255, 255, 255));
        panelBarang.setPreferredSize(new java.awt.Dimension(730, 646));

        bkembali.setBackground(new java.awt.Color(0, 204, 0));
        bkembali.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bkembali.setForeground(new java.awt.Color(255, 255, 255));
        bkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-back-30.png"))); // NOI18N
        bkembali.setText("Daftar Barang");
        bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkembaliActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Harga Satuan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Stok");

        tNamaBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tHarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tHargaActionPerformed(evt);
            }
        });

        tStok.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        bSubmit.setBackground(new java.awt.Color(0, 204, 0));
        bSubmit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bSubmit.setForeground(new java.awt.Color(255, 255, 255));
        bSubmit.setText("Submit");
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Foto");

        Chooser.setText("Pilih File");
        Chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooserActionPerformed(evt);
            }
        });

        fotopath.setText("C://foto.jpg");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tambah Barang");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBarangLayout = new javax.swing.GroupLayout(panelBarang);
        panelBarang.setLayout(panelBarangLayout);
        panelBarangLayout.setHorizontalGroup(
            panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bkembali)
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(80, 80, 80)
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBarangLayout.createSequentialGroup()
                                .addComponent(Chooser)
                                .addGap(38, 38, 38)
                                .addComponent(fotopath, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(tHarga)
                                .addComponent(tStok))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarangLayout.createSequentialGroup()
                        .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        panelBarangLayout.setVerticalGroup(
            panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarangLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(bkembali)
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBarangLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3))
                            .addGroup(panelBarangLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(tNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82))
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(39, 39, 39)
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tStok, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(fotopath, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(bSubmit)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tHargaActionPerformed

    private void ChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooserActionPerformed
        // TODO add your handling code here:
        try {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
        File file = chooser.getSelectedFile();
        if (file != null) {
            ImageIcon icon = new ImageIcon(file.toString());

            String filename = file.getAbsolutePath();
            fotopath.setText(filename);
        }
    } else {
        System.out.println("Pemilihan file dibatalkan oleh pengguna.");
    }
} catch (HeadlessException e) {
    JOptionPane.showMessageDialog(null, "Error Upload: " + e.getMessage());
}         
    }//GEN-LAST:event_ChooserActionPerformed

    private void bkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkembaliActionPerformed
        // TODO add your handling code here:
        MenuUtama.content.removeAll();
     MenuUtama.content.revalidate();
     MenuUtama.content.add(new PanelBarang());
     MenuUtama.content.repaint();
         
    }//GEN-LAST:event_bkembaliActionPerformed

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        // TODO add your handling code here:
         
        String namaBarang = tNamaBarang.getText();
        String harga = tHarga.getText();
        String stok = tStok.getText();
        String foto = fotopath.getText();
        if (namaBarang.isEmpty() || harga.isEmpty() || stok.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
        return;
    }
        try {
            Connection con = koneksi.konek();
            String sql = "insert into barang(nama_barang,harga,stok,foto) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(1, namaBarang);
            ps.setString(2, harga);
            ps.setString(3, stok);
            ps.setString(4, foto);
            ps.executeUpdate();
            ps.close();
            con.close();
            DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
            model.addRow(new Object[]{namaBarang, harga, stok});
            JOptionPane.showMessageDialog(null, "Barang Berhasil Ditambahkan!");
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Barang gagal ditambahkan " + sQLException);
        }                           
    }//GEN-LAST:event_bSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chooser;
    private javax.swing.JButton bSubmit;
    private javax.swing.JButton bkembali;
    private javax.swing.JLabel fotopath;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelBarang;
    private javax.swing.JTextField tHarga;
    private javax.swing.JTextField tNamaBarang;
    private javax.swing.JTextField tStok;
    // End of variables declaration//GEN-END:variables
}
