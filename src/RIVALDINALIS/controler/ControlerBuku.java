/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.controler;

import RIVALDINALIS.dao.BukuDao;
import RIVALDINALIS.dao.BukuDaoImpl;
import RIVALDINALIS.db.DbHelper;
import RIVALDINALIS.model.Buku;
import RIVALDINALIS.view.Formbuku;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.View;
/**
 *
 * @author RIVAL DINALIS
 */
public class ControlerBuku {
    Formbuku buku;
    Connection cn;
    Buku bu;
    BukuDao dao;

    public ControlerBuku(Formbuku buku){
        try {
            this.buku = buku;
            cn = DbHelper.getConnection();
            dao = new BukuDaoImpl(cn);
        } catch (SQLException ex) {
            Logger.getLogger(ControlerBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void clearForm(){
        buku.getTxtkodebuku().setText(" ");
        buku.getTxtjudulbuku().setText(" ");
        buku.getTxtpengarang().setText(" ");
        buku.getTxtpenerbit().setText(" ");
    }
    
    public void tampil(){
        try {
            DefaultTableModel tablemodel = (DefaultTableModel) buku.getTblbuku().getModel();
            tablemodel.setRowCount(0);
            List<Buku> list = dao.getAll();
            for(Buku a: list){
               Object[] row = {
                   a.getKodebuku(),
                   a.getJudulbuku(),
                   a.getPengarang(),
                   a.getPenerbit()
               };
                tablemodel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ControlerBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insert(){
        try {
            bu =new Buku();
            bu.setKodebuku(buku.getTxtkodebuku().getText());
            bu.setJudulbuku(buku.getTxtjudulbuku().getText());
            bu.setPengarang(buku.getTxtpengarang().getText());
            bu.setPenerbit(buku.getTxtpenerbit().getText());
            dao.insert(bu);
            JOptionPane.showMessageDialog(buku, "Entri Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(buku, "Entri Data OK");
            Logger.getLogger(ControlerBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void udate(){
        try {
            
            bu.setKodebuku(buku.getTxtkodebuku().getText());
            bu.setJudulbuku(buku.getTxtjudulbuku().getText());
            bu.setPengarang(buku.getTxtpengarang().getText());
            bu.setPenerbit(buku.getTxtpenerbit().getText());
            dao.update(bu);
            JOptionPane.showMessageDialog(buku, "Update Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(buku, "Update Data OK");
            Logger.getLogger(ControlerBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
           
            dao.delete(bu);
            JOptionPane.showMessageDialog(buku, "Delete Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(buku, "Delete Data OK");
            Logger.getLogger(ControlerBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void tabelklik(){
        try {
            String kodebuku =buku.getTblbuku().getValueAt(buku.getTblbuku()
                    .getSelectedRow(), 0).toString();
            bu = dao.getBuku(kodebuku);
            buku.getTxtkodebuku().setText(bu.getKodebuku());
            buku.getTxtjudulbuku().setText(bu.getJudulbuku());
            buku.getTxtpengarang().setText(bu.getPengarang());
            buku.getTxtpenerbit().setText(bu.getPenerbit());
            
        } catch (Exception ex) {
            Logger.getLogger(ControlerBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}