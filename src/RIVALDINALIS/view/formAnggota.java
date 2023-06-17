/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RIVALDINALIS.view;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import RIVALDINALIS.controler.*;

/**
 *
 * @author RIVAL DINALIS
 */
public class formAnggota extends javax.swing.JFrame {

    /**
     * Creates new form formAnggota
     */
    AnggotaControler controller;

    public formAnggota() {
        initComponents();
        controller = new AnggotaControler(this);
        controller.clearForm();
        controller.tampil();
    }

    public JComboBox<String> getCbojeniskelamin() {
        return cbojeniskelamin;
    }

    public JTable getTabelanggota() {
        return tabelanggota;
    }

    public JTextField getTxtalamat() {
        return txtalamat;
    }

    public JTextField getTxtkodeanggota() {
        return txtkodeanggota;
    }

    public JTextField getTxtnamaanggota() {
        return txtnamaanggota;
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
        txtkodeanggota = new javax.swing.JTextField();
        txtnamaanggota = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbojeniskelamin = new javax.swing.JComboBox<>();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncencel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelanggota = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 13, 100, 16);

        jLabel2.setText("Nama Anggota");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 41, 81, 16);

        jLabel3.setText("alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 36, 20);

        txtkodeanggota.setText("jTextField1");
        getContentPane().add(txtkodeanggota);
        txtkodeanggota.setBounds(100, 10, 296, 22);

        txtnamaanggota.setText("jTextField2");
        getContentPane().add(txtnamaanggota);
        txtnamaanggota.setBounds(100, 40, 296, 22);

        txtalamat.setText("jTextField3");
        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });
        getContentPane().add(txtalamat);
        txtalamat.setBounds(100, 70, 296, 22);

        jLabel4.setText("Jenis Kelamin");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 100, 80, 20);

        cbojeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbojeniskelamin);
        cbojeniskelamin.setBounds(100, 100, 296, 22);

        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        getContentPane().add(btninsert);
        btninsert.setBounds(10, 140, 72, 23);

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(100, 140, 72, 23);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(200, 140, 72, 23);

        btncencel.setText("Cencel");
        btncencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncencelActionPerformed(evt);
            }
        });
        getContentPane().add(btncencel);
        btncencel.setBounds(300, 140, 72, 23);

        tabelanggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Anggota", "Nama Anggota", "Alamat", "Jenis Kelamin"
            }
        ));
        tabelanggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelanggotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelanggota);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 452, 402);

        setSize(new java.awt.Dimension(495, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void btncencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncencelActionPerformed
        controller.clearForm();        // TODO add your handling code here:
    }//GEN-LAST:event_btncencelActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        controller.delete();
        controller.clearForm();
        controller.tampil();          // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        controller.insert();
        controller.clearForm();
        controller.tampil();        // TODO add your handling code here:
    }//GEN-LAST:event_btninsertActionPerformed

    private void tabelanggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelanggotaMouseClicked
        controller.tabelKlik();      // TODO add your handling code here:
    }//GEN-LAST:event_tabelanggotaMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        controller.update();
        controller.clearForm();
        controller.tampil();        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(formAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncencel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbojeniskelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelanggota;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtkodeanggota;
    private javax.swing.JTextField txtnamaanggota;
    // End of variables declaration//GEN-END:variables
}
