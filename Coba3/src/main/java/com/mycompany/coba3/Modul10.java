/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.coba3;

/**
 *
 * @author luxxzy
 */
public class Modul10 extends javax.swing.JFrame {

    /**
     * Creates new form Modul10
     */
    public Modul10() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eData1 = new javax.swing.JTextField();
        eData2 = new javax.swing.JTextField();
        eHasil = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menFile = new javax.swing.JMenu();
        menProses = new javax.swing.JMenu();
        meltBersih = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menHitung = new javax.swing.JMenu();
        meltKali = new javax.swing.JMenuItem();
        meltBagi = new javax.swing.JMenuItem();
        meltTambah = new javax.swing.JMenuItem();
        meltKurang = new javax.swing.JMenuItem();
        menBantuan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data 1");

        jLabel2.setText("Data 2");

        jLabel3.setText("Hasil");

        menFile.setText("File");
        jMenuBar1.add(menFile);

        menProses.setText("Proses");

        meltBersih.setText("Bersih");
        menProses.add(meltBersih);
        menProses.add(jSeparator1);

        menHitung.setText("Hitung");

        meltKali.setText("Kali");
        meltKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltKaliActionPerformed(evt);
            }
        });
        menHitung.add(meltKali);

        meltBagi.setText("Bagi");
        meltBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltBagiActionPerformed(evt);
            }
        });
        menHitung.add(meltBagi);

        meltTambah.setText("Tambah");
        meltTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltTambahActionPerformed(evt);
            }
        });
        menHitung.add(meltTambah);

        meltKurang.setText("Kurang");
        meltKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltKurangActionPerformed(evt);
            }
        });
        menHitung.add(meltKurang);

        menProses.add(menHitung);

        jMenuBar1.add(menProses);

        menBantuan.setText("Bantuan");
        jMenuBar1.add(menBantuan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eData1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eData2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meltTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltTambahActionPerformed
        // TODO add your handling code here:
        int Data1 = Integer.parseInt(eData1.getText());
                int Data2 = Integer.parseInt(eData2.getText());
                int Hasil = Data1 + Data2;
                eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meltTambahActionPerformed

    private void meltBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltBagiActionPerformed
        // TODO add your handling code here:
          int Data1 = Integer.parseInt(eData1.getText());
                int Data2 = Integer.parseInt(eData2.getText());
                if (Data2 != 0) {
                    double Hasil = (double) Data1 / Data2;
                    eHasil.setText(String.valueOf(Hasil));
                } else {
                    eHasil.setText("Cannot divide by zero");
                }
    }//GEN-LAST:event_meltBagiActionPerformed

    private void meltKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltKaliActionPerformed
        // TODO add your handling code here:
        int Data1 = Integer.parseInt(eData1.getText());
        int Data2 = Integer.parseInt(eData2.getText());
        int Hasil;
        Hasil = Data1 * Data2;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meltKaliActionPerformed

    private void meltKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltKurangActionPerformed
        // TODO add your handling code here:
         int Data1 = Integer.parseInt(eData1.getText());
                int Data2 = Integer.parseInt(eData2.getText());
                int Hasil = Data1 - Data2;
                eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meltKurangActionPerformed

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
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eData1;
    private javax.swing.JTextField eData2;
    private javax.swing.JTextField eHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem meltBagi;
    private javax.swing.JMenuItem meltBersih;
    private javax.swing.JMenuItem meltKali;
    private javax.swing.JMenuItem meltKurang;
    private javax.swing.JMenuItem meltTambah;
    private javax.swing.JMenu menBantuan;
    private javax.swing.JMenu menFile;
    private javax.swing.JMenu menHitung;
    private javax.swing.JMenu menProses;
    // End of variables declaration//GEN-END:variables
}
