
package kasir;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class PanelPenjualan extends javax.swing.JPanel {

    public PanelPenjualan() {
        initComponents();
        setDefaultTanggal();
        loadLaporanPenjualan();
        tabelPenjualan.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,16));
        tabelPenjualan.getTableHeader().setBackground(new Color(235,235,235));
        tabelPenjualan.setSelectionBackground(new Color(222,222,222));
        tabelPenjualan.setSelectionForeground(new Color(0,0,0));
        tabelPenjualan.getTableHeader().setPreferredSize(new Dimension(10,30));
        tabelPenjualan.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabelPenjualan.getColumnModel().getColumn(0).setMinWidth(20);
        tabelPenjualan.getColumnModel().getColumn(0).setMaxWidth(60);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dateFrom = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dateTo = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTotalPenjualan = new javax.swing.JLabel();
        lblTotalUntung = new javax.swing.JLabel();
        lblTotalQty = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPenjualan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(730, 657));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tanggal");

        dateFrom.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateFromPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("s/d");

        dateTo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateToPropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total Penjualan (Rp)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Total  Keuntungan (Rp)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Qty Terjual");

        lblTotalPenjualan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotalPenjualan.setText("20000");

        lblTotalUntung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotalUntung.setText("1000");

        lblTotalQty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotalQty.setText("4");

        tabelPenjualan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Barang", "Harga Satuan", "Qty Terjual", "Neto", "Untung"
            }
        ));
        tabelPenjualan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tabelPenjualan.setPreferredSize(new java.awt.Dimension(500, 80));
        jScrollPane1.setViewportView(tabelPenjualan);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242), 2));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Penjualan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblTotalQty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotalUntung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotalPenjualan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblTotalPenjualan)))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblTotalUntung))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblTotalQty))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dateFromPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateFromPropertyChange
     if (dateFrom.getDate() != null && dateTo.getDate() != null){
         loadLaporanPenjualan();
     }
    }//GEN-LAST:event_dateFromPropertyChange

    private void dateToPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateToPropertyChange
    if (dateFrom.getDate() != null && dateTo.getDate() != null){
         loadLaporanPenjualan();
     }   
    }//GEN-LAST:event_dateToPropertyChange

private void setDefaultTanggal() {
    if (dateFrom.getDate() == null) {
    dateFrom.setDate(new java.util.Date()); // hari ini
}
if (dateTo.getDate() == null) {
    dateTo.setDate(new java.util.Date()); // hari ini
}

}

    private void loadLaporanPenjualan() {
      java.util.Date dari = dateFrom.getDate();
      java.util.Date sampai = dateTo.getDate();

    java.sql.Date sqlDari = new java.sql.Date(dari.getTime());
    java.sql.Date sqlSampai = new java.sql.Date(sampai.getTime());

    int totalPenjualan = 0;
    int totalQty = 0;

    // Model tabel
    DefaultTableModel model = new DefaultTableModel(new Object[]{
        "No", "Nama Barang", "Harga Satuan", "Qty Terjual"
    }, 0);

    try (Connection con = koneksi.konek()) {
        String sql = """
            SELECT 
                b.nama_barang,
                d.harga_satuan,
                SUM(d.qty) AS total_qty,
                SUM(d.subtotal) AS total_penjualan
            FROM detail_transaksi d
            JOIN barang b ON d.kode_barang = b.kode_barang
            JOIN transaksi t ON d.id_transaksi = t.id_transaksi
            WHERE DATE(t.tgl_transaksi) BETWEEN ? AND ?
            GROUP BY b.nama_barang, d.harga_satuan
            ORDER BY b.nama_barang ASC
        """;

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, sqlDari);
        ps.setDate(2, sqlSampai);

        ResultSet rs = ps.executeQuery();
        int no = 1;

        while (rs.next()) {
            String namaBarang = rs.getString("nama_barang");
            int hargaSatuan = rs.getInt("harga_satuan");
            int qty = rs.getInt("total_qty");
            int subtotal = rs.getInt("total_penjualan");

            totalPenjualan += subtotal;
            totalQty += qty;

            model.addRow(new Object[]{
                no++,
                namaBarang,
                "Rp " + hargaSatuan,
                qty
            });
        }

        rs.close();
        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal load laporan: " + e.getMessage());
    }

    // Set model ke tabel
    tabelPenjualan.setModel(model);

    // Tampilkan total penjualan & qty terjual
    lblTotalPenjualan.setText("Rp " + totalPenjualan);
    lblTotalQty.setText(String.valueOf(totalQty));
    lblTotalUntung.setText("Rp " + totalPenjualan);
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateFrom;
    private com.toedter.calendar.JDateChooser dateTo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalPenjualan;
    private javax.swing.JLabel lblTotalQty;
    private javax.swing.JLabel lblTotalUntung;
    private javax.swing.JTable tabelPenjualan;
    // End of variables declaration//GEN-END:variables
}
