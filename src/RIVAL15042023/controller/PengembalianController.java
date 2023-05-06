/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.controller;
import RIVAL15042023.view.FormPengembalian;
import RIVAL15042023.model.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RIVAL DINALIS
 */
public class PengembalianController {
    private FormPengembalian formPengembalian;
    private Pengembalian pengembalian;
    private Peminjaman peminjaman;
    private PengembalianDao pengembalianDao;
    private PeminjamanDao peminjamanDao;
    
    public PengembalianController(FormPengembalian formPengembalian){
        this.formPengembalian = formPengembalian;
        pengembalianDao = new PengembalianDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
    }
    
    public void pinjam(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPengembalian.getCboAnggota().getSelectedIndex()));
        peminjaman.setbuku(BukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
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
            formPeminjaman.getCboAnggota().setSelectedItem(peminjaman.getanggota().getNobp());
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getbuku().getkodebuku());
            formPeminjaman.getTxttglpinjam().setText(peminjaman.gettglpinjam());
            formPeminjaman.getTxttglkembali().setText(peminjaman.gettglkembali());
        }
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setbuku(BukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.settglpinjam(formPeminjaman.getTxttglpinjam().getText());
        peminjaman.settglkembali(formPeminjaman.getTxttglkembali().getText());
        peminjamanDao.update(index, peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,
                "Update Ok");
    }
    public void kembalikan(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setbuku(BukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
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
                peminjaman.getanggota().getNobp(),
                peminjaman.getanggota().getNama(),
                peminjaman.getbuku().getkodebuku(),
                peminjaman.gettglpinjam(),
                peminjaman.gettglkembali()
        };
        tabelModel.addRow(data);
        }
    }
}    
  
