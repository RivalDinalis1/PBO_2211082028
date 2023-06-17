/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.controler;
import RIVALDINALIS.model.*;
import RIVALDINALIS.dao.*;
import RIVALDINALIS.db.DbHelper;
import RIVALDINALIS.view.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author RIVAL DINALIS
 */
public class AnggotaControler {
    formAnggota view;
    Anggota anggota;
    AnggotaDao dao;
    Connection connection;
    
    public AnggotaControler(formAnggota view){
        try {
            this.view =view;
            connection= DbHelper.getConnection();
            dao =new AnggotaDaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void clearForm(){
        view.getTxtkodeanggota().setText(" ");
        view.getTxtnamaanggota().setText(" ");
        view.getTxtalamat().setText(" ");
        view.getCbojeniskelamin().removeAllItems();
        view.getCbojeniskelamin().addItem("L");
        view.getCbojeniskelamin().addItem("P");      
    }
    public void tampil(){
        try {
            DefaultTableModel tableModel = (DefaultTableModel) view.getTabelanggota().getModel();
            tableModel.setRowCount(0);
            List<Anggota> list = dao.getAll();
            for(Anggota a: list){
                Object[] row ={
                    a.getKodeanggota(),
                    a.getNamaanggota(),
                    a.getAlamat(),
                    a.getJeniskelamin()
                };
                tableModel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        try {
            anggota =new Anggota();
            anggota.setKodeanggota(view.getTxtkodeanggota().getText());
            anggota.setNamaanggota(view.getTxtnamaanggota().getText());
            anggota.setAlamat(view.getTxtalamat().getText());
            anggota.setJeniskelamin(view.getCbojeniskelamin().getSelectedItem().toString());
            dao.insert(anggota);
            JOptionPane.showMessageDialog(view,"Entri Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view,ex.getMessage());
            Logger.getLogger(AnggotaControler.class.getName()).log(Level.SEVERE, null, ex);
        }           
        
    }
    
    public void update(){
        try {
            anggota.setKodeanggota(view.getTxtkodeanggota().getText());
            anggota.setNamaanggota(view.getTxtnamaanggota().getText());
            anggota.setAlamat(view.getTxtalamat().getText());
            anggota.setJeniskelamin(view.getCbojeniskelamin().getSelectedItem().toString());
            dao.update(anggota);
            JOptionPane.showMessageDialog(view,"Update Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view,ex.getMessage());
            Logger.getLogger(AnggotaControler.class.getName()).log(Level.SEVERE, null, ex);
        }           
        
    }
     
    public void delete(){
        try {
            dao.delete(anggota);
            JOptionPane.showMessageDialog(view,"Delete data ok");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
    public void tabelKlik(){
        try {
            String kodeanggota = view.getTabelanggota()
                    .getValueAt(view.getTabelanggota().getSelectedRow(), 0).toString();
            anggota = dao.getAnggota(kodeanggota);
            view.getTxtkodeanggota().setText(anggota.getKodeanggota());
            view.getTxtnamaanggota().setText(anggota.getNamaanggota());
            view.getTxtalamat().setText(anggota.getAlamat());
            view.getCbojeniskelamin().setSelectedItem(anggota.getJeniskelamin());
        } catch (Exception ex) {
            Logger.getLogger(AnggotaControler.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
    }
    
    
}
