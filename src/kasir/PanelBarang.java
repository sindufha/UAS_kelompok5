package kasir;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import kasir.MenuUtama;

public class PanelBarang extends javax.swing.JPanel {
 
    public PanelBarang() {
       initComponents();
       setupTabelBarang();
       loaddataBarang();
       tabelBarang.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,16));
       tabelBarang.getTableHeader().setBackground(new Color(235,235,235));
       tabelBarang.setSelectionBackground(new Color(222,222,222));
       tabelBarang.setSelectionForeground(new Color(0,0,0));
       tabelBarang.getTableHeader().setPreferredSize(new Dimension(100,35));
      
    }
    private Image getScaledImage(Image srcImg, int w, int h) {
    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2 = resizedImg.createGraphics();


    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    

    g2.drawImage(srcImg, 0, 0, w, h, null);
    g2.dispose();

    return resizedImg;
}

private void loaddataBarang(){
DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
    model.setRowCount(0);
    
    try {
        Connection con = koneksi.konek();
        String sql = "SELECT * FROM barang";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
            String kodeBarang = rs.getString("kode_barang");
            String namaBarang = rs.getString("nama_barang");
            int harga = rs.getInt("harga");
            int stok = rs.getInt("stok");
            String foto = rs.getString("foto");
            ImageIcon icon = null; 
            if (foto != null && !foto.isEmpty()) {
                ImageIcon tempIcon = new ImageIcon(foto);
                Image img = getScaledImage(tempIcon.getImage(), 65, 65); 
                icon = new ImageIcon(img);
            }
            
            model.addRow(new Object[]{kodeBarang, namaBarang,harga,stok,icon});
        }
    } catch (SQLException sQLException) {
    }
    
}
private void setupTabelBarang() {
    DefaultTableModel model = new DefaultTableModel(
        new Object[]{"Kode Barang", "Nama", "Harga", "Stok", "Foto"}, 0
    ) {
        @Override
        public Class<?> getColumnClass(int column) {
            if (column == 4) return ImageIcon.class;
            return String.class;
        }
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    };
    
    tabelBarang.setModel(model);

    // Biar tinggi baris cukup untuk gambar thumbnail
    tabelBarang.setRowHeight(60);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBarang = new javax.swing.JPanel();
        bTambahbarang = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        barangHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bHapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(730, 646));

        panelBarang.setBackground(new java.awt.Color(255, 255, 255));
        panelBarang.setPreferredSize(new java.awt.Dimension(730, 646));
        panelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBarangMouseClicked(evt);
            }
        });

        bTambahbarang.setBackground(new java.awt.Color(0, 204, 0));
        bTambahbarang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bTambahbarang.setForeground(new java.awt.Color(255, 255, 255));
        bTambahbarang.setText("Tambah Barang");
        bTambahbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahbarangActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText(" Search :");

        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCariKeyReleased(evt);
            }
        });

        tabelBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga", "Stok", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        barangHeader.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Stok Barang");

        javax.swing.GroupLayout barangHeaderLayout = new javax.swing.GroupLayout(barangHeader);
        barangHeader.setLayout(barangHeaderLayout);
        barangHeaderLayout.setHorizontalGroup(
            barangHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barangHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        barangHeaderLayout.setVerticalGroup(
            barangHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barangHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        bHapus.setBackground(new java.awt.Color(255, 0, 0));
        bHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bHapus.setForeground(new java.awt.Color(255, 255, 255));
        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bUbah.setBackground(new java.awt.Color(255, 149, 0));
        bUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bUbah.setForeground(new java.awt.Color(255, 255, 255));
        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBarangLayout = new javax.swing.GroupLayout(panelBarang);
        panelBarang.setLayout(panelBarangLayout);
        panelBarangLayout.setHorizontalGroup(
            panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarangLayout.createSequentialGroup()
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                            .addGroup(panelBarangLayout.createSequentialGroup()
                                .addComponent(bTambahbarang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(177, 177, 177))
            .addComponent(barangHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        panelBarangLayout.setVerticalGroup(
            panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarangLayout.createSequentialGroup()
                .addComponent(barangHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambahbarang)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahbarangActionPerformed
     MenuUtama.content.removeAll();
     MenuUtama.content.revalidate();
     MenuUtama.content.add(new PanelBarang2());
     MenuUtama.content.repaint();
  
    }//GEN-LAST:event_bTambahbarangActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabelBarang.getSelectedRow();
            if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.");
            return;}
            String kodeBarang = tabelBarang.getValueAt(selectedRow, 0).toString();
            
    int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) return;
    try {
        Connection con = koneksi.konek();
        String sql = "DELETE FROM barang WHERE kode_barang = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeBarang);
        ps.executeUpdate();
        ps.close();
        con.close();
        DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
        model.removeRow(selectedRow);

        JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal menghapus dari database: " + e.getMessage());
    }     
    }//GEN-LAST:event_bHapusActionPerformed

    private void panelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarangMouseClicked
        // TODO add your handling code here:
        tabelBarang.clearSelection();
    }//GEN-LAST:event_panelBarangMouseClicked

    private void tCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyReleased
        // TODO add your handling code here:
        TableRowSorter<TableModel> rowSorter;
        DefaultTableModel model = (DefaultTableModel) tabelBarang.getModel();
        rowSorter = new TableRowSorter<>(model);
        tabelBarang.setRowSorter(rowSorter);
        String text = tCari.getText();
    
    if (text.trim().length() == 0) {
        rowSorter.setRowFilter(null); // tampilkan semua data
    } else {
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text)); // filter, ignore case
    }
    }//GEN-LAST:event_tCariKeyReleased

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
       int selectedRow = tabelBarang.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih barang yang mau diubah dulu!");
        return;
    }
    String kodeBarang  = tabelBarang.getValueAt(selectedRow, 0).toString();
    String namaBarang  = tabelBarang.getValueAt(selectedRow, 1).toString();
    String harga       = tabelBarang.getValueAt(selectedRow, 2).toString();
    String stok        = tabelBarang.getValueAt(selectedRow, 3).toString();


    Window window = SwingUtilities.getWindowAncestor(this);
    Frame frame = (window instanceof Frame) ? (Frame) window : null;
    ubahBarang ub = new ubahBarang(
           frame,
            true,
            kodeBarang,
            namaBarang,
            harga,
            stok
    );

    ub.setLocationRelativeTo(null);
    ub.setVisible(true);

    loaddataBarang();
    }//GEN-LAST:event_bUbahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambahbarang;
    private javax.swing.JButton bUbah;
    private javax.swing.JPanel barangHeader;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelBarang;
    private javax.swing.JTextField tCari;
    public static javax.swing.JTable tabelBarang;
    // End of variables declaration//GEN-END:variables
}
