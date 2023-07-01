/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RIVALDINALIS.view;

import RIVALDINALIS.controler.ControlerPengembalian;
import RIVALDINALIS.dao.PeminjamanDao;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author RIVAL DINALIS
 */

public class FormPengembalian extends javax.swing.JFrame {

    /**
     * Creates new form FormPengembalian
     */
    ControlerPengembalian con;
    public FormPengembalian() {
        initComponents();
        con = new ControlerPengembalian(this);
        con.bersihform();
        con.isicomboanggota();
        con.isicombobuku();
        con.tampil();
        
    }

    public JButton getBtncancel() {
        return btncancel;
    }

    public JButton getBtndelete() {
        return btndelete;
    }

    public JButton getBtninsert() {
        return btninsert;
    }


    public JButton getBtnupdate() {
        return btnupdate;
    }

    public JComboBox<String> getCbokodeanggota() {
        return cbokodeanggota;
    }

    public JComboBox<String> getCbokodebuku() {
        return cbokodebuku;
    }

    public JTable getTblpengembalian() {
        return tblpengembalian;
    }

    public JTextField getTxttanggalDikembalikan() {
        return txttanggalDikembalikan;
    }

    public JTextField getTxttglkembali() {
        return txttglkembali;
    }

    public JTextField getTxttglpinjam() {
        return txttglpinjam;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttglpinjam = new javax.swing.JTextField();
        txttglkembali = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txttanggalDikembalikan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpengembalian = new javax.swing.JTable();
        cbokodeanggota = new javax.swing.JComboBox<>();
        cbokodebuku = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 9, 117, 16);

        jLabel2.setText("Kode Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 49, 117, 16);

        jLabel3.setText("Tanggal Pinjam");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 89, 117, 16);

        jLabel4.setText("Tanggal Kembali");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 129, 117, 16);

        txttglpinjam.setText("jTextField3");
        getContentPane().add(txttglpinjam);
        txttglpinjam.setBounds(141, 86, 390, 22);

        txttglkembali.setText("jTextField4");
        getContentPane().add(txttglkembali);
        txttglkembali.setBounds(140, 130, 390, 22);

        btninsert.setText("Insert");
        getContentPane().add(btninsert);
        btninsert.setBounds(20, 239, 72, 23);

        btnupdate.setText("Update");
        getContentPane().add(btnupdate);
        btnupdate.setBounds(154, 239, 72, 23);

        btndelete.setText("Delete");
        getContentPane().add(btndelete);
        btndelete.setBounds(300, 240, 72, 23);

        btncancel.setText("Cancel");
        getContentPane().add(btncancel);
        btncancel.setBounds(460, 230, 72, 23);

        jLabel5.setText("Terlambat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 170, 80, 16);

        txttanggalDikembalikan.setText("jTextField5");
        getContentPane().add(txttanggalDikembalikan);
        txttanggalDikembalikan.setBounds(140, 170, 390, 22);

        tblpengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Anggota", "NamaAnggota", "Kode Buku", "Judul Buku", "Tanggal pinjam", "Tanggal Kembali", "Tanggal Dikembalikan", "Terlambat", "Denda"
            }
        ));
        jScrollPane1.setViewportView(tblpengembalian);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 1163, 481);

        cbokodeanggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbokodeanggota);
        cbokodeanggota.setBounds(146, 6, 388, 22);

        cbokodebuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbokodebuku);
        cbokodebuku.setBounds(146, 46, 388, 22);

        jLabel6.setText("Denda");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 200, 80, 16);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 200, 390, 22);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 230, 72, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbokodeanggota;
    private javax.swing.JComboBox<String> cbokodebuku;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblpengembalian;
    private javax.swing.JTextField txttanggalDikembalikan;
    private javax.swing.JTextField txttglkembali;
    private javax.swing.JTextField txttglpinjam;
    // End of variables declaration//GEN-END:variables
}