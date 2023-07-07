/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.controler;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import RIVALDINALIS.db.DbHelper;
import RIVALDINALIS.dao.*;
import RIVALDINALIS.model.*;
import RIVALDINALIS.view.FormPengembalian;
/**
 *
 * @author RIVAL DINALIS
 */
public class PengembalianControler {
     private FormPengembalian form;
    private AnggotaDao daoAgg;
    private BukuDao daoBuku;
    private PengembalianDao dao;
    private Pengembalian pg;
    private Connection cn;

    public PengembalianControler(FormPengembalian form) throws Exception {
        this.form = form;
        cn = DbHelper.getConnection();
        daoAgg = new AnggotaDaoImpl(cn);
        daoBuku = new BukuDaoImpl(cn);
        dao = new PengembalianDaoImpl(cn);
        pg = new Pengembalian();
    }

    public void Clear() {
        try {
            form.getTxtDenda().setEditable(false);
            form.getTxtTerlambat().setEditable(false);
            form.getBtnKembalikan().setEnabled(false);
            List<Buku> bukuD = daoBuku.getAll();
            List<Anggota> aggD = daoAgg.getAll();
            form.getTxtDenda().setText("");
            form.getCboKodeAgg().removeAllItems();
            form.getCboKodeBuku().removeAllItems();
            form.getTxtTanggalDikembalikan().setText("");
            form.getTxtTerlambat().setText("");
            form.getTxtCari().setText("");
            form.getTxtTanggalPinjam().setText("");
            for (Anggota agg : aggD) {
                form.getCboKodeAgg().addItem(agg.getKodeanggota());
            }
            for (Buku buku : bukuD) {
                form.getCboKodeBuku().addItem(buku.getKodebuku());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void getPengemballian() {
        try {
            form.getBtnKembalikan().setEnabled(true);
            String tanggalPinjam = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 4)
                    .toString();
            String tanggalkembali = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 5)
                    .toString();
            form.getCboKodeAgg()
                    .setSelectedItem(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 0)
                            .toString());
            form.getCboKodeBuku()
                    .setSelectedItem(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 2)
                            .toString());
            form.getTxtTanggalPinjam()
                    .setText(tanggalPinjam);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tglDikembalikan = format.format(new java.util.Date());
            form.getTxtTanggalDikembalikan().setText(tglDikembalikan);
            int terlambat = dao.terlmbat(tglDikembalikan, tanggalkembali);
            pg.setTerlambat(terlambat);
            form.getTxtTerlambat().setText("" + terlambat);
            form.getTxtDenda().setText((String.valueOf(pg.getDenda())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e, null, 0);
        }
    }

    public void Showdata() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> List = dao.getAll();
            for (Pengembalian pm : List) {
                Object[] data = {
                        pm.getKodeAgg(),
                        pm.getNamaAnggota(),
                        pm.getKodeBuku(),
                        pm.getJudul(),
                        pm.getTglpPjm(),
                        pm.getTglkmbl(),
                        pm.getTglDikembalikan(),
                        pm.getTerlambat(),
                        pm.getDenda()
                };
                tableModel.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(form, e);
        }
    }

    public void Cari() {
        try {
            String kode = form.getCbocari().getSelectedItem().toString();
            String cari = form.getTxtCari().getText();
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            if (kode == "Kode Anggota") {
                kode = "anggota.kodeAnggota";
            } else if (kode == "Kode Buku") {
                kode = "daftarBuku.kodeBuku";
            } else {
                kode = "anggota.namaAnggota";
            }
            List<Pengembalian> List = dao.cari(kode, cari);
            if (List.isEmpty()) {
                if (kode == "anggota.kodeAnggota") {
                    JOptionPane.showMessageDialog(form, "Kode Anggota '" + cari + "' Tidak dapat ditemukan");
                } else if (kode == "daftarBuku.kodeBuku") {
                    JOptionPane.showMessageDialog(form, "Kode Buku '" + cari + "' Tidak dapat ditemukan");
                } else {
                    JOptionPane.showMessageDialog(form, "Nama '" + cari + "' Tidak dapat ditemukan");
                }
            } else {
                for (Pengembalian pm : List) {
                    Object[] data = {
                            pm.getKodeAgg(),
                            pm.getNamaAnggota(),
                            pm.getKodeBuku(),
                            pm.getJudul(),
                            pm.getTglpPjm(),
                            pm.getTglkmbl(),
                            pm.getTglDikembalikan(),
                            pm.getTerlambat(),
                            pm.getDenda()
                    };
                    tableModel.addRow(data);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e, null, 0);
        }
    }

    public void insert() {
        try {
            pg.setKodeAgg(form.getCboKodeAgg().getSelectedItem().toString());
            pg.setKodeBuku(form.getCboKodeBuku().getSelectedItem().toString());
            pg.setTglpPjm(form.getTxtTanggalPinjam().getText());
            pg.setTglDikembalikan(form.getTxtTanggalDikembalikan().getText());
            pg.setTerlambat(Integer.parseInt(form.getTxtTerlambat().getText()));
            pg.setDenda(Double.parseDouble(form.getTxtDenda().getText()));
            dao.Insert(pg);
            JOptionPane.showMessageDialog(form, "Berhasil Mengembalikan Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, "Buku telah dikembalikan!", null, 0);
        }
    }

    public void delete() {
        try {
            pg.setKodeAgg(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 0)
                    .toString());
            pg.setKodeBuku(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 2)
                    .toString());
            pg.setTglpPjm(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 4)
                    .toString());
            dao.Delete(pg);
            JOptionPane.showMessageDialog(form, "Data pada pengembalian berhasil dihapus!", null, 2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public int tanggalDikembalikan() throws Exception {
        String tglDikembalikan = form.getTxtTanggalDikembalikan().getText();
        String tanggalkembali = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 5)
                .toString();
        int terlambat = dao.terlmbat(tglDikembalikan, tanggalkembali);
        if (terlambat <= 0) {
            terlambat = 0;
        }
        form.getTxtTerlambat().setText("" + terlambat);
        form.getTxtTanggalDikembalikan().setText(tglDikembalikan);
        form.getTxtDenda().setText((String.valueOf(terlambat * 1000)));
        return terlambat;
    }

    public void Ubah() {
        try {
            pg.setKodeAgg(form.getCboKodeAgg().getSelectedItem().toString());
            pg.setKodeBuku(form.getCboKodeBuku().getSelectedItem().toString());
            pg.setTglpPjm(form.getTxtTanggalPinjam().getText());
            pg.setTglDikembalikan(form.getTxtTanggalDikembalikan().getText());
            pg.setTerlambat(Integer.parseInt(form.getTxtTerlambat().getText()));
            pg.setDenda(Double.parseDouble(form.getTxtDenda().getText()));
            dao.Update(pg);
            JOptionPane.showMessageDialog(form, "Data Pengembalian telah dirubah!", null, 2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
