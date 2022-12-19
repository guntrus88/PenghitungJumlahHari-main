/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penghitungjumlahhari;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Raifuru
 */
public class PenentuJumlahHari extends javax.swing.JFrame {

    /**
     * Creates new form PenentuJumlahHari
     */
    public PenentuJumlahHari() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jumlahhariLabel = new javax.swing.JLabel();
        hitungButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        keluarButton = new javax.swing.JButton();
        tahunTextField = new javax.swing.JTextField();
        bulanComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Aplikasi Penentu Jumlah Hari");

        jLabel2.setText("Tahun");

        jLabel3.setText("Bulan");

        jumlahhariLabel.setText("Jumlah hari adalah");

        hitungButton.setText("Hitung");
        hitungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        keluarButton.setText("Keluar");
        keluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarButtonActionPerformed(evt);
            }
        });

        bulanComboBox.setMaximumRowCount(12);
        bulanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Pebruari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        bulanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulanComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jumlahhariLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bulanComboBox, 0, 94, Short.MAX_VALUE)
                            .addComponent(tahunTextField))))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(hitungButton)
                            .addGap(18, 18, 18)
                            .addComponent(hapusButton)
                            .addGap(18, 18, 18)
                            .addComponent(simpanButton)
                            .addGap(18, 18, 18)
                            .addComponent(keluarButton))
                        .addComponent(jLabel1))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jumlahhariLabel)
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(153, 153, 153)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hitungButton)
                        .addComponent(hapusButton)
                        .addComponent(simpanButton)
                        .addComponent(keluarButton))
                    .addContainerGap(77, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
    try{
        BufferedWriter out = new BufferedWriter (new FileWriter ("jumlahhari.txt"));
        out.write(tahunTextField.getText());
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan dalam File");
        out.close();
    }catch (Exception e) {
        System.err.println("Error: " +e.getMessage());
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void keluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
       tahunTextField.setText("");
       tahunTextField.setText("");
       bulanComboBox.setSelectedItem("januari");
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void hitungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungButtonActionPerformed
       if(tahunTextField.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Error: isian tahun kosong!", "Error: isian tahun kosong!", JOptionPane.WARNING_MESSAGE);
       }else{
        int tahun = Integer.parseInt(tahunTextField.getText());
        int jumlahHari;
        if(bulanComboBox.getSelectedItem().equals("Pebruari")){
            if( ((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0) )
                 jumlahHari = 29;
            else jumlahHari = 28;
        }else if(bulanComboBox.getSelectedItem().equals("April") || 
                bulanComboBox.getSelectedItem().equals("Juni") ||
                bulanComboBox.getSelectedItem().equals("September") ||
                bulanComboBox.getSelectedItem().equals("Nopember")) {
            jumlahHari = 30;
        }else{
            jumlahHari = 31;
            }
        jumlahhariLabel.setText("Jumlah hari pada bulan " +
                bulanComboBox.getSelectedItem() + 
                " tahun " + tahun + " adalah " + jumlahHari);
        }
    }//GEN-LAST:event_hitungButtonActionPerformed

    private void bulanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulanComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenentuJumlahHari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bulanComboBox;
    private javax.swing.JButton hapusButton;
    private javax.swing.JButton hitungButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jumlahhariLabel;
    private javax.swing.JButton keluarButton;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTextField tahunTextField;
    // End of variables declaration//GEN-END:variables
}
