/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.controller;
import RIVAL15042023.view.FormBuku;
import RIVAL15042023.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RIVAL DINALIS
 */
public class BukuController {
    private FormBuku formBuku;
    private BukuDao bukuDao;
    private Buku buku;
    
    public BukuController(FormBuku formBuku){
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formBuku.getTxtkodebuku().setText("");
        formBuku.getTxtjudulbuku().setText("");
        formBuku.getTxtpengarang().setText("");
        formBuku.getTxtpenerbit().setText("");
        formBuku.getTxttahunterbit().setText("");
    }
    
    public void saveBuku(){
        buku = new Buku();
        buku.setkodebuku(formBuku.getTxtkodebuku().getText());
        buku.setjudulbuku(formBuku.getTxtjudulbuku().getText());
        buku.setpengarang(formBuku.getTxtpengarang().getText());
        buku.setpenerbit(formBuku.getTxtpenerbit().getText());
        buku.settahunterbit(formBuku.getTxttahunterbit().getText());
        bukuDao.save(buku);
        javax.swing.JOptionPane.showMessageDialog(formBuku,
                "Entri Ok");
    }
    
    public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku != null){
            formBuku.getTxtkodebuku().setText(buku.getkodebuku());
            formBuku.getTxtjudulbuku().setText(buku.getjudulbuku());
            formBuku.getTxtpengarang().setText(buku.getpengarang());
            formBuku.getTxtpenerbit().setText(buku.getpenerbit());
            formBuku.getTxttahunterbit().setText(buku.gettahunterbit());
        }
    }
    
    public void updateBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku.setkodebuku(formBuku.getTxtkodebuku().getText());
        buku.setjudulbuku(formBuku.getTxtjudulbuku().getText());
        buku.setpengarang(formBuku.getTxtpengarang().getText());
        buku.setpenerbit(formBuku.getTxtpenerbit().getText());
        buku.settahunterbit(formBuku.getTxttahunterbit().getText());
        bukuDao.update(index, buku);
        javax.swing.JOptionPane.showMessageDialog(formBuku,
                "Update Ok");
    }
    
    public void deleteBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formBuku, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Buku> list = bukuDao.getAll();
        for(Buku buku : list){
            Object[] data = {
                buku.getkodebuku(),
                buku.getjudulbuku(),
                buku.getpengarang(),
                buku.getpenerbit(),
                buku.gettahunterbit()
        };
        tabelModel.addRow(data);
        }
    }
}
