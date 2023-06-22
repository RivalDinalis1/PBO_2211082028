/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.controler;


import UTS_B.view.Formpegawai;
import UTS_B.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RIVAL DINALIS
 */
public class PegawaiControler {
    private Formpegawai view;
    private PegawaiDao dao;
    private Pegawai p;
    
    public PegawaiControler(Formpegawai view){
        this.view = view;
        dao = new  PegawaiDaoImpl();
    }
    
    public void clear(){
        view.getTxtnip().setText("");
        view.getTxtnama().setText("");
        view.getTxtalamat().setText("");
        
    }
    
    public void save(){
        p = new Pegawai();
        p.setnip(view.getTxtnip().getText());
        p.setNama(view.getTxtnama().getText());
        p.setAlamat(view.getTxtalamat().getText());
        dao.save(p);
        javax.swing.JOptionPane.showMessageDialog(view, "Entri Data Ok");           
    }
    
     public void get(){
        int index = view.getTblkaryawan().getSelectedRow();
        p = dao.getPegawai(index);
        if(p != null){
            view.getTxtnip().setText(p.getnip());
           view.getTxtnama().setText(p.getNama());
           view.getTxtalamat().setText(p.getAlamat());
        }
    }
     public void update(){
        int index = view.getTblkaryawan().getSelectedRow();
        p.setnip(view.getTxtnip().getText());
        p.setNama(view.getTxtnama().getText());
        p.setAlamat(view.getTxtalamat().getText());
        dao.update(index, p);
        javax.swing.JOptionPane.showMessageDialog(view, "Update Data Ok");
    }
    
    public void delete(){
        int index = view.getTblkaryawan().getSelectedRow();
        dao.delete(index);
        
        javax.swing.JOptionPane.showMessageDialog(view, "Delete Data OK");
    }
    
    public void tampilData(){
      
        DefaultTableModel tabelModel =
                (DefaultTableModel) view.getTblkaryawan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pegawai> list = dao.getAll();
        for(Pegawai p : list){
            Object[] data = {
                p.getnip(),
                p.getNama(),
                p.getAlamat()
        };
        tabelModel.addRow(data);
        }
    }
}
