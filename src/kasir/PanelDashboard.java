package kasir;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelDashboard extends javax.swing.JPanel {

    public PanelDashboard() {
        initComponents();
        loadTotalBarangTerjual();
        loadPenjualanTerbesar();
       tabelPenjualanTerbesar.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,16));
       tabelPenjualanTerbesar.getTableHeader().setBackground(new Color(235,235,235));
       tabelPenjualanTerbesar.setSelectionBackground(new Color(222,222,222));
       tabelPenjualanTerbesar.setSelectionForeground(new Color(0,0,0));
       tabelPenjualanTerbesar.getTableHeader().setPreferredSize(new Dimension(100,35));
       tabelPenjualanTerbesar.setRowHeight(30);
       tabelPenjualanTerbesar.getColumnModel().getColumn(0).setPreferredWidth(40); 
       tabelPenjualanTerbesar.getColumnModel().getColumn(1).setPreferredWidth(200);
       tabelPenjualanTerbesar.getColumnModel().getColumn(2).setPreferredWidth(100);
       tabelPenjualanTerbesar.getColumnModel().getColumn(3).setPreferredWidth(80);
       tabelPenjualanTerbesar.getColumnModel().getColumn(4).setPreferredWidth(120);
       tabelPenjualanTerbesar.getColumnModel().getColumn(5).setPreferredWidth(90);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDashboard = new javax.swing.JPanel();
        card = new RoundedPanel();
        lblTotalBarang = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new RoundedPanel(40);
        jLabel3 = new javax.swing.JLabel();
        lblTotalTransaksi = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new RoundedPanel(40);
        lblTotalPendapatan = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel11 = new javax.swing.JLabel();
        tCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPenjualanTerbesar = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(939, 575));

        panelDashboard.setBackground(new java.awt.Color(255, 255, 255));
        panelDashboard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        panelDashboard.setPreferredSize(new java.awt.Dimension(939, 575));

        card.setBackground(new java.awt.Color(39, 128, 227));
        card.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        lblTotalBarang.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalBarang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotalBarang.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalBarang.setText("10.000,00");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-delivery-truck-50.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total item terjual");

        javax.swing.GroupLayout cardLayout = new javax.swing.GroupLayout(card);
        card.setLayout(cardLayout);
        cardLayout.setHorizontalGroup(
            cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardLayout.createSequentialGroup()
                        .addComponent(lblTotalBarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21))
                    .addGroup(cardLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(125, Short.MAX_VALUE))))
        );
        cardLayout.setVerticalGroup(
            cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout.createSequentialGroup()
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTotalBarang))
                    .addGroup(cardLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(14, 14, 14))
        );

        jPanel5.setBackground(new java.awt.Color(255, 130, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-paper-bag-50 (1).png"))); // NOI18N

        lblTotalTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalTransaksi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotalTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalTransaksi.setText("2.000,00");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Transaksi");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblTotalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTotalTransaksi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(16, 16, 16))
        );

        jPanel6.setBackground(new java.awt.Color(255, 0, 57));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        lblTotalPendapatan.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalPendapatan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotalPendapatan.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPendapatan.setText("1.000.000,00");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/logo/icons8-income-50.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Income");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblTotalPendapatan, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTotalPendapatan))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(15, 15, 15))
        );

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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Penjualan barang terbesar");

        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCariKeyReleased(evt);
            }
        });

        tabelPenjualanTerbesar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Barang", "Harga Satuan", "Jumlah", "Total", "Kontribusi"
            }
        ));
        jScrollPane1.setViewportView(tabelPenjualanTerbesar);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Search : ");

        javax.swing.GroupLayout panelDashboardLayout = new javax.swing.GroupLayout(panelDashboard);
        panelDashboard.setLayout(panelDashboardLayout);
        panelDashboardLayout.setHorizontalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashboardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashboardLayout.createSequentialGroup()
                        .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDashboardLayout.createSequentialGroup()
                                .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelDashboardLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
        );
        panelDashboardLayout.setVerticalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyReleased

        DefaultTableModel model = (DefaultTableModel) tabelPenjualanTerbesar.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    tabelPenjualanTerbesar.setRowSorter(sorter);

    String keyword = tCari.getText();
    if (keyword.trim().length() == 0) {
        sorter.setRowFilter(null); 
    } else {
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword)); 
    }     
    }//GEN-LAST:event_tCariKeyReleased
private void loadTotalBarangTerjual() {
    String sqlBarang = "SELECT SUM(qty) AS total_barang FROM detail_transaksi";
    String sqlTransaksi = "SELECT COUNT(*) AS total_transaksi FROM transaksi";
    String sqlPendapatan = "SELECT SUM(subtotal) AS total_pendapatan FROM detail_transaksi";

try (Connection con = koneksi.konek();
     PreparedStatement psBarang = con.prepareStatement(sqlBarang);
     ResultSet rsBarang = psBarang.executeQuery();
     PreparedStatement psTransaksi = con.prepareStatement(sqlTransaksi);
     ResultSet rsTransaksi = psTransaksi.executeQuery();
     PreparedStatement psPendapatan = con.prepareStatement(sqlPendapatan);
     ResultSet rsPendapatan = psPendapatan.executeQuery()) {

    if (rsBarang.next()) {
        int totalBarang = rsBarang.getInt("total_barang");
        lblTotalBarang.setText(String.valueOf(totalBarang));
    }

    if (rsTransaksi.next()) {
        int totalTransaksi = rsTransaksi.getInt("total_transaksi");
        lblTotalTransaksi.setText(String.valueOf(totalTransaksi));
    }

    if (rsPendapatan.next()) {
        int totalPendapatan = rsPendapatan.getInt("total_pendapatan");
        lblTotalPendapatan.setText("Rp " + totalPendapatan);
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "gagal memuat data " + e);
}

}
private void loadPenjualanTerbesar() {
    DefaultTableModel model = (DefaultTableModel) tabelPenjualanTerbesar.getModel();
    model.setRowCount(0); // bersihkan dulu

    String sql = "SELECT b.nama_barang, dt.harga_satuan, " +
                 "SUM(dt.qty) AS jumlah_terjual, " +
                 "SUM(dt.subtotal) AS total_penjualan " +
                 "FROM detail_transaksi dt " +
                 "JOIN barang b ON dt.kode_barang = b.kode_barang " +
                 "GROUP BY b.nama_barang, dt.harga_satuan " +
                 "ORDER BY jumlah_terjual DESC " +
                 "LIMIT 10";

    try (Connection con = koneksi.konek();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        int totalSemua = getTotalSemuaPenjualan();

        int no = 1;
        while (rs.next()) {
            String namaBarang = rs.getString("nama_barang");
            int hargaSatuan = rs.getInt("harga_satuan");
            int jumlah = rs.getInt("jumlah_terjual");
            int total = rs.getInt("total_penjualan");


            double kontribusi = (totalSemua > 0) ? ((double) total / totalSemua * 100) : 0;

            model.addRow(new Object[]{
                no++,
                namaBarang,
                "Rp " + hargaSatuan,
                jumlah,
                "Rp " + total,
                String.format("%.2f%%", kontribusi)
            });
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}


private int getTotalSemuaPenjualan() {
    int total = 0;
    String sql = "SELECT SUM(subtotal) AS total_semua FROM detail_transaksi";

    try (Connection con = koneksi.konek();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        if (rs.next()) {
            total = rs.getInt("total_semua");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return total;
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel card;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalBarang;
    private javax.swing.JLabel lblTotalPendapatan;
    private javax.swing.JLabel lblTotalTransaksi;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tabelPenjualanTerbesar;
    // End of variables declaration//GEN-END:variables
    // End of variables declaration                   
}
