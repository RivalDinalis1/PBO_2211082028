/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.controller;
import RIVAL15042023.view.FormPeminjaman;
import RIVAL15042023.model.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIVAL DINALIS
 */
public class PeminjamanController {
     private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtNobp().setText("");
        formPeminjaman.getTxtkodebuku().setText("");
        formPeminjaman.getTxttglpinjam().setText("");
        formPeminjaman.getTxttglkembali().setText("");
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setkodebuku(formPeminjaman.getTxtkodebuku().getText());
        peminjaman.settglpinjam(formPeminjaman.getTxttglpinjam().getText());
        peminjaman.settglkembali(formPeminjaman.getTxttglkembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,
                "Entri Ok");
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getTxtNobp().setText(peminjaman.getNobp());
            formPeminjaman.getTxtkodebuku().setText(peminjaman.getkodebuku());
            formPeminjaman.getTxttglpinjam().setText(peminjaman.gettglpinjam());
            formPeminjaman.getTxttglkembali().setText(peminjaman.gettglkembali());
        }
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setkodebuku(formPeminjaman.getTxtkodebuku().getText());
        peminjaman.settglpinjam(formPeminjaman.getTxttglpinjam().getText());
        peminjaman.settglkembali(formPeminjaman.getTxttglkembali().getText());
        peminjamanDao.update(index, peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,
                "Update Ok");
    }
    
    public void deletePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getkodebuku(),
                peminjaman.gettglpinjam(),
                peminjaman.gettglkembali()
        };
        tabelModel.addRow(data);
        }
    }
}
