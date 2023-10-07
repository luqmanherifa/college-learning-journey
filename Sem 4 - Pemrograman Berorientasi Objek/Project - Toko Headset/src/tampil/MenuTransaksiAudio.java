/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.KoneksiAudio;

/**
 *
 * @author Kyrin
 */
public class MenuTransaksiAudio extends javax.swing.JFrame {

    /**
     * Creates new form MenuTransaksiAudio
     */

    private Connection conn = new KoneksiAudio().connect();
    private DefaultTableModel tabmode1, tabmode2, tabmode3;
    
    ArrayList<String> TransaksiArray = new ArrayList<String>();

    //tanggal
    java.util.Date tgl_ini = new java.util.Date();
    private SimpleDateFormat tgltgl = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
    private String tanggal = tgltgl.format(tgl_ini);
    
    protected void aktif() {
       txtNamaTS.setEnabled(true);
       txtTanggalTS.setEnabled(true);
       txtJenisTS.setEnabled(true);
       txtMerkTS.setEnabled(true);
       txtTipeTS.setEnabled(true);
       txtHargaTS.setEnabled(true);
       txtJumlahTS.setEnabled(true);
       txtTotalTS.setEnabled(true);
       txtKodeTS.requestFocus();
    }

    protected void kosong() {
       txtKodeTS.setText("");
       txtNamaTS.setText("");
       txtTanggalTS.setText("");
       txtJenisTS.setText("");
       txtMerkTS.setText("");
       txtTipeTS.setText("");
       txtHargaTS.setText("");
       txtJumlahTS.setText("");
       txtTotalTS.setText("");
    }
 
    protected void datatable1() {
        Object[] Baris = {"Kode","Nama","Tanggal","Jenis","Merk","Tipe","Harga","Jumlah","Total"};
        tabmode1 = new DefaultTableModel(null, Baris);
        tblTransaksi.setModel(tabmode1);
        String sql = "SELECT * FROM menu_transaksi";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
               String kd_ts = hasil.getString("kdtrans");
               String nama_ts = hasil.getString("pelanggan");
               String tanggal_ts = hasil.getString("tanggal");
               String jenis_ts = hasil.getString("jenis");
               String merk_ts = hasil.getString("merk");
               String tipe_ts = hasil.getString("tipe");
               String harga_ts = hasil.getString("harga");
               String jumlah_ts = hasil.getString("jumlah");
               String total_ts = hasil.getString("total");
               
               String[] data = {kd_ts, nama_ts, tanggal_ts, jenis_ts, merk_ts, tipe_ts, harga_ts, jumlah_ts, total_ts};
               tabmode1.addRow(data);
            }
        } catch (Exception e) {

        }
    }
    
    protected void datatable2() {
        Object[] Baris = {"Kode","Merk","Tipe","Warna","Earcup","Headband","Harga","Stok"};
        tabmode2 = new DefaultTableModel(null, Baris);
        tblHeadset.setModel(tabmode2);
        String sql = "SELECT * FROM tabel_headset";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
               String kd_hs = hasil.getString("kdhs");
               String merk_hs = hasil.getString("merkhs");
               String tipe_hs = hasil.getString("tipehs");
               String warna_hs = hasil.getString("warnahs");
               String earcup_hs = hasil.getString("modelearcup");
               String headband_hs = hasil.getString("warnaheadband");
               String harga_hs = hasil.getString("hargahs");
               String stok_hs = hasil.getString("stokhs");
               
               String[] data = {kd_hs, merk_hs, tipe_hs, warna_hs, earcup_hs, headband_hs, harga_hs, stok_hs};
               tabmode2.addRow(data);
            }
        } catch (Exception e) {

        }
    }    
    
        protected void datatable3() {
        Object[] Baris = {"Kode","Merk","Tipe","Warna","Earbud","Harga","Stok"};
        tabmode3 = new DefaultTableModel(null, Baris);
        tblEarset.setModel(tabmode3);
        String sql = "SELECT * FROM tabel_earset";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
               String kd_es = hasil.getString("kdes");
               String merk_es = hasil.getString("merkes");
               String tipe_es = hasil.getString("tipees");
               String warna_es = hasil.getString("warnaes");
               String earbud_es = hasil.getString("modelearbud");
               String harga_es = hasil.getString("hargaes");
               String stok_es = hasil.getString("stokes");
               
               String[] data = {kd_es, merk_es, tipe_es, warna_es, earbud_es, harga_es, stok_es};
               tabmode3.addRow(data);
            }
        } catch (Exception e) {

        }
    }    
    
    public MenuTransaksiAudio() {
        initComponents();
        datatable1();
        datatable2();
        datatable3();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHeadset = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEarset = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKodeTS = new javax.swing.JTextField();
        txtJenisTS = new javax.swing.JTextField();
        txtMerkTS = new javax.swing.JTextField();
        txtTipeTS = new javax.swing.JTextField();
        txtJumlahTS = new javax.swing.JTextField();
        txtTotalTS = new javax.swing.JTextField();
        btnSave = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        txtNamaTS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTanggalTS = new javax.swing.JTextField();
        btnTanggal = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtHargaTS = new javax.swing.JTextField();
        btnHitung = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblHeadset.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHeadset.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblHeadsetAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblHeadset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHeadsetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHeadset);

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTransaksi);

        tblEarset.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEarset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEarsetMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblEarset);

        jLabel1.setText("Kode Transaksi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("MENU TRANSAKSI");

        jLabel3.setText("Jenis Barang");

        jLabel4.setText("Merk Barang");

        jLabel5.setText("Tipe Barang");

        jLabel6.setText("Jumlah Barang");

        jLabel7.setText("Total Harga");

        txtKodeTS.setText("TS");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel8.setText("Nama Pelanggan");

        jLabel9.setText("Tanggal");

        btnTanggal.setText("TGL");
        btnTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanggalActionPerformed(evt);
            }
        });

        jLabel10.setText("Harga Barang");

        btnHitung.setText("HTG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNamaTS)
                                            .addComponent(txtTotalTS)
                                            .addComponent(txtJumlahTS)
                                            .addComponent(txtTipeTS)
                                            .addComponent(txtMerkTS)
                                            .addComponent(txtJenisTS)
                                            .addComponent(txtKodeTS)
                                            .addComponent(txtTanggalTS)
                                            .addComponent(txtHargaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(37, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKodeTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNamaTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTanggalTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTanggal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtJenisTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMerkTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTipeTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtHargaTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtJumlahTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTotalTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHitung))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanggalActionPerformed
        txtTanggalTS.setText(tanggal);
    }//GEN-LAST:event_btnTanggalActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            String sql = "INSERT INTO menu_transaksi"
            + "(kdtrans, pelanggan, tanggal, jenis, merk, tipe, harga, jumlah, total) VALUES (?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stat = conn.prepareStatement(sql);

            if(txtKodeTS.getText().equals("")||txtNamaTS.getText().equals("")||txtTanggalTS.getText().equals("")
                ||txtJenisTS.getText().equals("")||txtMerkTS.getText().equals("")||txtTipeTS.getText().equals("")
                ||txtHargaTS.getText().equals("")||txtJumlahTS.getText().equals("")||txtTotalTS.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Input data terlebih dahulu!","ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                stat.setString(1, txtKodeTS.getText());
                stat.setString(2, txtNamaTS.getText());
                stat.setString(3, txtTanggalTS.getText());
                stat.setString(4, txtJenisTS.getText());
                stat.setString(5, txtMerkTS.getText());
                stat.setString(6, txtTipeTS.getText());
                stat.setInt(7, Integer.valueOf(txtHargaTS.getText()));
                stat.setInt(8, Integer.valueOf(txtJumlahTS.getText()));
                stat.setInt(9, Integer.valueOf(txtTotalTS.getText()));
                
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil diinsert!");

                kosong();
                txtKodeTS.requestFocus();
                datatable1();
            }
        } catch (Exception except) {
            JOptionPane.showMessageDialog(null, ("Error!\n"+except));
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblHeadsetAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblHeadsetAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHeadsetAncestorAdded

    private void tblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransaksiMouseClicked
        int bar = tblTransaksi.getSelectedRow();
        String a = tabmode1.getValueAt(bar, 0).toString();
        String b = tabmode1.getValueAt(bar, 1).toString();
        String c = tabmode1.getValueAt(bar, 2).toString();
        String d = tabmode1.getValueAt(bar, 3).toString();
        String e = tabmode1.getValueAt(bar, 4).toString();
        String f = tabmode1.getValueAt(bar, 5).toString();
        String g = tabmode1.getValueAt(bar, 6).toString();
        String h = tabmode1.getValueAt(bar, 7).toString();
        String i = tabmode1.getValueAt(bar, 8).toString();
        
        txtKodeTS.setText(a);
        txtNamaTS.setText(b);
        txtTanggalTS.setText(c);
        txtJenisTS.setText(d);
        txtMerkTS.setText(e);
        txtTipeTS.setText(f);
        txtHargaTS.setText(g);
        txtJumlahTS.setText(h);
        txtTotalTS.setText(i);
    }//GEN-LAST:event_tblTransaksiMouseClicked

    private void tblHeadsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHeadsetMouseClicked
        int bar = tblHeadset.getSelectedRow();
        String a = tabmode2.getValueAt(bar, 1).toString();
        String b = tabmode2.getValueAt(bar, 2).toString();
        String c = tabmode2.getValueAt(bar, 6).toString();

        txtMerkTS.setText(a);
        txtTipeTS.setText(b);
        txtHargaTS.setText(c);
    }//GEN-LAST:event_tblHeadsetMouseClicked

    private void tblEarsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEarsetMouseClicked
        int bar = tblEarset.getSelectedRow();
        String a = tabmode3.getValueAt(bar, 1).toString();
        String b = tabmode3.getValueAt(bar, 2).toString();
        String c = tabmode3.getValueAt(bar, 5).toString();

        txtMerkTS.setText(a);
        txtTipeTS.setText(b);
        txtHargaTS.setText(c);
    }//GEN-LAST:event_tblEarsetMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MenuFiturAudio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        int satu = Integer.parseInt(txtHargaTS.getText());
        int dua = Integer.parseInt(txtJumlahTS.getText());
        
        String calculate = String.valueOf(satu*dua);
        txtTotalTS.setText(calculate);
    }//GEN-LAST:event_btnHitungActionPerformed

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
            java.util.logging.Logger.getLogger(MenuTransaksiAudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTransaksiAudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTransaksiAudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTransaksiAudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTransaksiAudio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JToggleButton btnHitung;
    private javax.swing.JToggleButton btnSave;
    private javax.swing.JButton btnTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblEarset;
    private javax.swing.JTable tblHeadset;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextField txtHargaTS;
    private javax.swing.JTextField txtJenisTS;
    private javax.swing.JTextField txtJumlahTS;
    private javax.swing.JTextField txtKodeTS;
    private javax.swing.JTextField txtMerkTS;
    private javax.swing.JTextField txtNamaTS;
    private javax.swing.JTextField txtTanggalTS;
    private javax.swing.JTextField txtTipeTS;
    private javax.swing.JTextField txtTotalTS;
    // End of variables declaration//GEN-END:variables
}
