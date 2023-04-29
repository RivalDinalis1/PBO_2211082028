/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.controller;
import RIVAL15042023.view.FormPeminjaman;
import RIVAL15042023.model.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIVAL DINALIS
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    private AnggotaDao anggotaDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtkodebuku().setText("");
        formPeminjaman.getTxttglpinjam().setText("");
        formPeminjaman.getTxttglkembali().setText("");
    }
    
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAll();
        formPeminjaman.getCboAnggota().removeAllItems();
        
        //isi anggota
        for(Anggota anggota: listAnggota){
            formPeminjaman.getCboAnggota().addItem(anggota.getNobp());
        }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
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
            formPeminjaman.getCboAnggota().setSelectedItem(peminjaman.getanggota().getNobp());
            formPeminjaman.getTxtkodebuku().setText(peminjaman.getkodebuku());
            formPeminjaman.getTxttglpinjam().setText(peminjaman.gettglpinjam());
            formPeminjaman.getTxttglkembali().setText(peminjaman.gettglkembali());
        }
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
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
                peminjaman.getanggota().getNobp(),
                peminjaman.getanggota().getNama(),
                peminjaman.getkodebuku(),
                peminjaman.gettglpinjam(),
                peminjaman.gettglkembali()
        };
        tabelModel.addRow(data);
        }
    }
}
