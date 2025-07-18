package kasir;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import kasir.PanelKasir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.SQLException;

public class kasirPopup extends javax.swing.JDialog {

    private JPanel panelKeranjang;
    public kasirPopup(java.awt.Frame parent, boolean modal, JPanel panelKeranjang) {
        super(parent, modal);
        initComponents();
        this.panelKeranjang = panelKeranjang; 
        tJumlahBayar.getDocument().addDocumentListener(new DocumentListener() {
        public void insertUpdate(DocumentEvent e) { hitungKembalian(); }
        public void removeUpdate(DocumentEvent e) { hitungKembalian(); }
        public void changedUpdate(DocumentEvent e) { hitungKembalian(); }
        });
    }
    public kasirPopup(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
}
private int totalHarga = 0;

public void setTotalHarga(int total) {
    this.totalHarga = total;
    lblTotalHarga.setText("Rp " + totalHarga);
}


private void hitungKembalian() {
    String bayarText = tJumlahBayar.getText().trim();

    if (!bayarText.isEmpty() && bayarText.matches("\\d+")) { // hanya angka
        int totalBayar = Integer.parseInt(bayarText);
        int kembalian = totalBayar - totalHarga;

        if (kembalian >= 0) {
            lblKembalian.setForeground(new Color(0, 128, 0)); // hijau
            lblKembalian.setText("Rp " + kembalian);
        } else {
            lblKembalian.setForeground(Color.RED);
            lblKembalian.setText("Uang kurang Rp " + Math.abs(kembalian));
        }
    } else {
        lblKembalian.setText("Kembalian: Rp 0");
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTotalHarga = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tJumlahBayar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblKembalian = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bBayar = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Bayar");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblTotalHarga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTotalHarga.setText("120000");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Jenis Pembayaran");

        tJumlahBayar.setText("50000");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Jumlah Bayar");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Kembali");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash" }));

        lblKembalian.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKembalian.setText("30000");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        bBayar.setText("Bayar");
        bBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBayarActionPerformed(evt);
            }
        });

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Jumlah Tagihan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblKembalian)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tJumlahBayar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotalHarga)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox1, 0, 216, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalHarga)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblKembalian))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void simpanTransaksiKeDatabase(int bayar, int kembali) {
    try {
        Connection con = koneksi.konek();

        // 1️⃣ Hitung total dari keranjang (mirip subtotal)
        int totalTransaksi = totalHarga;

        // 2️⃣ Insert ke tabel transaksi
        String sqlTransaksi = "INSERT INTO transaksi (tgl_transaksi, id_kasir, total, bayar, kembali) VALUES (NOW(), ?, ?, ?, ?)";
        PreparedStatement psTransaksi = con.prepareStatement(sqlTransaksi,Statement.RETURN_GENERATED_KEYS);
        psTransaksi.setInt(1, 1); // sementara hardcode id_kasir = 1
        psTransaksi.setInt(2, totalTransaksi);
        psTransaksi.setInt(3, bayar);
        psTransaksi.setInt(4, kembali);
        psTransaksi.executeUpdate();

        // Ambil id_transaksi yang baru
        ResultSet rs = psTransaksi.getGeneratedKeys();
        int idTransaksi = 0;
        if (rs.next()) {
            idTransaksi = rs.getInt(1);
        }
        rs.close();
        psTransaksi.close();

        // 3️⃣ Siapkan query detail_transaksi
        String sqlDetail = "INSERT INTO detail_transaksi (id_transaksi, kode_barang, qty, harga_satuan, subtotal) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement psDetail = con.prepareStatement(sqlDetail);
        PanelKasir panelKasir2 = new PanelKasir();    
        // Loop semua item di keranjang
        for (Component comp : panelKeranjang.getComponents()) {
            if (comp instanceof JPanel) {
                JPanel itemPanel = (JPanel) comp;

                // 👉 Ambil nama barang
                String namaBarang = ((JLabel) itemPanel.getComponent(0)).getText();

                // 👉 Ambil qty
                JPanel qtyPanel = (JPanel) itemPanel.getComponent(1);
                JLabel lblQty = (JLabel) qtyPanel.getComponent(1);
                int qty = Integer.parseInt(lblQty.getText());

                // 👉 Ambil subtotal
                JPanel rightPanel = (JPanel) itemPanel.getComponent(2);
                JLabel lblHarga = (JLabel) rightPanel.getComponent(0);
                int subtotal = Integer.parseInt(lblHarga.getText().replace("Rp", "").trim());
                int hargaSatuan = subtotal / qty;

                // 👉 Cari kode_barang dari nama_barang (query ke DB)
                String kodeBarang = "";
                String sqlCari = "SELECT kode_barang FROM barang WHERE nama_barang = ? LIMIT 1";
                PreparedStatement psCari = con.prepareStatement(sqlCari);
                psCari.setString(1, namaBarang);
                ResultSet rsCari = psCari.executeQuery();
                if (rsCari.next()) {
                    kodeBarang = rsCari.getString("kode_barang");
                }
                rsCari.close();
                psCari.close();

                // 👉 Insert ke detail_transaksi
                psDetail.setInt(1, idTransaksi);
                psDetail.setString(2, kodeBarang);
                psDetail.setInt(3, qty);
                psDetail.setInt(4, hargaSatuan);
                psDetail.setInt(5, subtotal);
                psDetail.executeUpdate();
                String sqlUpdateStok = "UPDATE barang SET stok = stok - ? WHERE kode_barang = ?";
                PreparedStatement psUpdateStok = con.prepareStatement(sqlUpdateStok);
                psUpdateStok.setInt(1, qty);
                psUpdateStok.setString(2, kodeBarang);
                psUpdateStok.executeUpdate();
                psUpdateStok.close();
            }
        }

        psDetail.close();
        con.close();

        // 4️⃣ Setelah berhasil, kosongkan keranjang
        panelKeranjang.removeAll();
        panelKeranjang.revalidate();
        panelKeranjang.repaint();

        JOptionPane.showMessageDialog(null, "Transaksi berhasil disimpan!");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal menyimpan transaksi: " + e.getMessage());
    }
}

    private void bBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBayarActionPerformed
        // TODO add your handling code here:
        
        String bayarText = tJumlahBayar.getText().trim();

    if (bayarText.isEmpty() || !bayarText.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Masukkan jumlah bayar yang valid!");
        return;
    }

    int totalBayar = Integer.parseInt(bayarText);
    if (totalBayar < totalHarga) {
        JOptionPane.showMessageDialog(this, "Uang tidak cukup!");
        return;
    }

    int kembalian = totalBayar - totalHarga;
    try {
        // ✅ Ambil total transaksi dari label
        int totalTransaksi = Integer.parseInt(lblTotalHarga.getText().replace("Rp", "").trim());

        // ✅ Ambil input bayar dari textfield
        int bayar = Integer.parseInt(tJumlahBayar.getText().trim());

        if (bayar < totalTransaksi) {
            JOptionPane.showMessageDialog(this, "Uang bayar kurang!");
            return;
        }

        // ✅ Hitung kembalian

        lblKembalian.setText("Rp " + kembalian);

        // ✅ Panggil method simpan transaksi
        simpanTransaksiKeDatabase(bayar, kembalian);
        
        // ✅ Tutup dialog
        dispose();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan jumlah bayar yang valid!");
    }
    
    
    dispose();       
    }//GEN-LAST:event_bBayarActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kasirPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasirPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasirPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasirPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                kasirPopup dialog = new kasirPopup(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBayar;
    private javax.swing.JButton bCancel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblKembalian;
    private javax.swing.JLabel lblTotalHarga;
    private javax.swing.JTextField tJumlahBayar;
    // End of variables declaration//GEN-END:variables
}
