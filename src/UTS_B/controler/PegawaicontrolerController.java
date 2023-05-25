/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.controler;
import UTS_B.view.FormGji;
import UTS_B.model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author RIVAL DINALIS
 */
public class PegawaicontrolerController {
    protected FormGaji formGaji;
    protected PegawaiDao pegawaiDao;
    protected Pegawai pegawai;
    protected GajiDao gajiDao;
    
    public PegawaiController(FormGaji formGaji) {
        this.formGaji = formGaji;
        pegawaiDao = new PegawaiDaoImpl();
        gajiDao = new GajiDaoImpl();
    }
    
    public void bersihForm() {
        formGaji.getTxtNIP().setText("");
        formGaji.getTxtNama().setText("");
        formGaji.getTxtAlamat().setText("");
    }
    
    public void savePegawai() {
        pegawai = new Pegawai();
        pegawai.setNip(formGaji.getTxtNIP().getText());
        pegawai.setNama(formGaji.getTxtNama().getText());
        pegawai.setAlamat(formGaji.getTxtAlamat().getText());
        pegawaiDao.save(pegawai);
        javax.swing.JOptionPane.showMessageDialog(formGaji, "Entri Ok");
    }
    
    public void getPegawai() {
        int index = formGaji.getTblPegawai().getSelectedRow();
        pegawai = pegawaiDao.getPegawai(index);
        if (pegawai != null) {
            formGaji.getTxtNIP().setText(pegawai.getnip());
            formGaji.getTxtNama().setText(pegawai.getNama());
            formGaji.getTxtAlamat().setText(pegawai.getAlamat());
        }
    }
    
    public void updatePegawai() {
        int index = formGaji.getTblPegawai().getSelectedRow();
        pegawai.setNip(formGaji.getTxtNIP().getText());
        pegawai.setNama(formGaji.getTxtNama().getText());
        pegawai.setAlamat(formGaji.getTxtAlamat().getText());
        pegawaiDao.update(index, pegawai);
        javax.swing.JOptionPane.showMessageDialog(formGaji, "Update Ok");
    }
    
    public void deletePegawai() {
        int index = formGaji.getTblPegawai().getSelectedRow();
        pegawaiDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formGaji, "Delete");
    }
    
    public void tampilData() {
        DefaultTableModel tabelModel = (DefaultTableModel) formGaji.getTblPegawai().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pegawai> list = pegawaiDao.getAll();
        for (Pegawai pegawai : list) {
            Object[] data = {
                pegawai.getnip(),
                pegawai.getNama(),
                pegawai.getAlamat()
            };
            tabelModel.addRow(data);
        }
    }
}
