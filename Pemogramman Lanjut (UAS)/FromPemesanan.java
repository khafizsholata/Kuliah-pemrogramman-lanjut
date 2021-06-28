package menupemesanan;
/**
 *
 * @Khafiz
 */
public class FromPemesanan extends javax.swing.JFrame {
    private Object nama_barang;

    public FromPemesanan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        harga_barang = new javax.swing.JTextField();
        jumlah_pesanan = new javax.swing.JTextField();
        jumlah_harga = new javax.swing.JTextField();
        jumlah_bayar = new javax.swing.JTextField();
        jumlah_kembalian = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        hitung_jumlah_barang = new javax.swing.JButton();
        bayar = new javax.swing.JButton();
        pilih_barang = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU DAN HARGA MAKANAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 390, 29);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA MAKANAN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 170, 19);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HARGA MAKANAN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(32, 137, 160, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JUMLAH PESANAN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(33, 201, 151, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JUMLAH HARGA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(32, 258, 150, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("JUMLAH BAYAR ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(27, 330, 150, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JUMLAH KEMBALIAN");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(31, 385, 190, 20);

        harga_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_barangActionPerformed(evt);
            }
        });
        getContentPane().add(harga_barang);
        harga_barang.setBounds(244, 132, 166, 26);

        jumlah_pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_pesananActionPerformed(evt);
            }
        });
        getContentPane().add(jumlah_pesanan);
        jumlah_pesanan.setBounds(244, 196, 166, 26);

        jumlah_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(jumlah_harga);
        jumlah_harga.setBounds(244, 253, 166, 26);

        jumlah_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_bayarActionPerformed(evt);
            }
        });
        getContentPane().add(jumlah_bayar);
        jumlah_bayar.setBounds(244, 325, 166, 26);
        getContentPane().add(jumlah_kembalian);
        jumlah_kembalian.setBounds(244, 380, 166, 26);

        batal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        batal.setText("BATAL");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        getContentPane().add(batal);
        batal.setBounds(450, 280, 89, 25);

        keluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(560, 280, 120, 25);

        hitung_jumlah_barang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hitung_jumlah_barang.setText("HITUNG JUMLAH BARANG");
        hitung_jumlah_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung_jumlah_barangActionPerformed(evt);
            }
        });
        getContentPane().add(hitung_jumlah_barang);
        hitung_jumlah_barang.setBounds(444, 226, 240, 25);

        bayar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bayar.setText("BAYAR");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        getContentPane().add(bayar);
        bayar.setBounds(500, 350, 100, 25);

        pilih_barang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Menu", "Nasi Goreng", "Nasi Lemak", "Ayam Bakar", "Sup Ayam Kampung", "Sate Minang", " " }));
        pilih_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilih_barangActionPerformed(evt);
            }
        });
        getContentPane().add(pilih_barang);
        pilih_barang.setBounds(244, 88, 166, 26);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Pictures\\Pemogramman Lanjut\\gui3.jpg")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, -50, 730, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void harga_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_barangActionPerformed
     
    }//GEN-LAST:event_harga_barangActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
       
        harga_barang.setText("");
        jumlah_pesanan.setText("");
        jumlah_harga.setText("");
        jumlah_bayar.setText("");
        jumlah_kembalian.setText("");
        pilih_barang.setSelectedIndex(0);
    }//GEN-LAST:event_batalActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed

        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void hitung_jumlah_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung_jumlah_barangActionPerformed
     
        int JumlahBarang=Integer.parseInt(jumlah_pesanan.getText());
        int HargaBarang=Integer.parseInt(harga_barang.getText());
        jumlah_harga.setText(Integer.toString(HargaBarang*JumlahBarang));
    }//GEN-LAST:event_hitung_jumlah_barangActionPerformed

    private void jumlah_pesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_pesananActionPerformed

    }//GEN-LAST:event_jumlah_pesananActionPerformed

    private void pilih_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilih_barangActionPerformed
       
        String NamaBarang=(String)pilih_barang.getSelectedItem();
switch (NamaBarang){
case "Nasi Goreng":
harga_barang.setText("10000");
break;
case "Nasi Lemak":
harga_barang.setText("5000");
break;
case "Ayam Bakar":
harga_barang.setText("20000");
break;
case "Sup Ayam Kampung":
harga_barang.setText("25000");
break;
case "Sate Minang":
harga_barang.setText("15000");
break;
    }//GEN-LAST:event_pilih_barangActionPerformed
    }
    private void jumlah_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_hargaActionPerformed
        
    }//GEN-LAST:event_jumlah_hargaActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
       
        int JumlahBayar=Integer.parseInt(jumlah_bayar.getText());
    int JumlahHarga=Integer.parseInt(jumlah_harga.getText());
    if (JumlahBayar>=JumlahHarga){
    jumlah_kembalian.setText(Integer.toString(JumlahBayar-JumlahHarga));
}
    else {
    jumlah_kembalian.setText("Uang Anda Kurang");
}
    }//GEN-LAST:event_bayarActionPerformed

    private void jumlah_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_bayarActionPerformed
       
    }//GEN-LAST:event_jumlah_bayarActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(FromPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromPemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton bayar;
    private javax.swing.JTextField harga_barang;
    private javax.swing.JButton hitung_jumlah_barang;
    private javax.swing.JFrame jFrame1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jumlah_bayar;
    private javax.swing.JTextField jumlah_harga;
    private javax.swing.JTextField jumlah_kembalian;
    private javax.swing.JTextField jumlah_pesanan;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox pilih_barang;
    // End of variables declaration//GEN-END:variables
}
