/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.controller;
import RIVAL15042023.view.FormPeminjaman;
import RIVAL15042023.model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author RIVAL DINALIS
 */
public class PeminjamanController {
    protected FormPeminjaman formPeminjaman;
    protected PeminjamanDao peminjamanDao;
    protected Peminjaman peminjaman;
    
    protected AnggotaDao anggotaDao;
    protected BukuDao BukuDao;
    
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        BukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglkembali().setText("");
    }
    
    public void isiCombo(){
    List<Anggota> listAnggota = anggotaDao.getAll();
    formPeminjaman.getCboAnggota().removeAllItems();
    List<Buku> listBuku = BukuDao.getAll();
    formPeminjaman.getCboBuku().removeAllItems();

    //isi anggota
    for(Anggota anggota: listAnggota){
        formPeminjaman.getCboAnggota().addItem(anggota.getNobp());
    }
    //isi buku
    for(Buku buku: listBuku){
        formPeminjaman.getCboBuku().addItem(buku.getkodebuku());
    }
}

    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setbuku(BukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.settglpinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.settglkembali(formPeminjaman.getTxtTglkembali().getText());
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
            formPeminjaman.getTxtTglpinjam().setText(peminjaman.gettglpinjam());
            formPeminjaman.getTxtTglkembali().setText(peminjaman.gettglkembali());
        }
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setbuku(BukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.settglpinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.settglkembali(formPeminjaman.getTxtTglkembali().getText());
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
