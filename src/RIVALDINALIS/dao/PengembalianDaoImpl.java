/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.dao;

import RIVALDINALIS.model.Pengembalian;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RIVAL DINALIS
 */
public class PengembalianDaoImpl implements PengembalianDao{
    private Connection cn;
    private Pengembalian pg;

    public PengembalianDaoImpl(Connection cn) {
        this.cn = cn;

    }

    @Override
    public void Insert(Pengembalian pg) throws Exception {
        String insert = "INSERT INTO pengembalian VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = cn.prepareStatement(insert);
        ps.setString(1, pg.getKodeAgg());
        ps.setString(2, pg.getKodeBuku());
        ps.setString(3, pg.getTglpPjm());
        ps.setString(4, pg.getTglDikembalikan());
        ps.setInt(5, pg.getTerlambat());
        ps.setDouble(6, pg.getDenda());
        ps.executeUpdate();
    }

    @Override
    public void Update(Pengembalian pg) throws Exception {
        String update = "UPDATE `pengembalian` SET `tanggalKembalikan` = ?, `terlambat` = ?, `denda` = ? WHERE `pengembalian`.`kodeAnggota` = ? AND `pengembalian`.`kodeBuku` = ? AND `pengembalian`.`tanggalPinjam` = ?";
        PreparedStatement ps = cn.prepareStatement(update);
        ps.setString(1, pg.getTglDikembalikan());
        ps.setInt(2, pg.getTerlambat());
        ps.setDouble(3, pg.getDenda());
        ps.setString(4, pg.getKodeAgg());
        ps.setString(5, pg.getKodeBuku());
        ps.setString(6, pg.getTglpPjm());
        ps.executeUpdate();
    }

    @Override
    public void Delete(Pengembalian pg) throws Exception {
        String delete = "DELETE FROM `pengembalian` WHERE `pengembalian`.`kodeAnggota` = ? AND `pengembalian`.`kodeBuku` = ? AND `pengembalian`.`tglpinjam` = ?";
        PreparedStatement ps = cn.prepareStatement(delete);
        ps.setString(1, pg.getKodeAgg());
        ps.setString(2, pg.getKodeBuku());
        ps.setString(3, pg.getTglpPjm());
        ps.executeUpdate();
    }

    @Override
    public Pengembalian getPm(String kodeBuku, String kodeanggota, String tglpinjam) throws Exception {
        String all = "select * from pengembalian where kodeAnggota = '?' && kodeBuku = '?' && tanggalPinjam = '?'";
        PreparedStatement ps = cn.prepareStatement(all);
        ps.setString(1, kodeBuku);
        ps.setString(2, kodeanggota);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            pg = new Pengembalian();
            pg.setKodeAgg(rs.getString(1));
            pg.setKodeBuku(rs.getString(2));
            pg.setTglpPjm(rs.getString(3));
            pg.setTglDikembalikan(rs.getString(4));
        }
        return pg;
    }

    @Override
    public List<Pengembalian> getAll() throws Exception {
        String getall = "SELECT anggota.kodeAnggota, anggota.namaAnggota, buku.kodeBuku, buku.judulBuku, peminjaman.tglpinjam, peminjaman.tglkembali, pengembalian.TglDikembalikan, pengembalian.terlambat, pengembalian.denda FROM peminjaman JOIN anggota ON peminjaman.kodeAnggota = anggota.kodeAnggota JOIN buku ON peminjaman.kodeBuku = buku.kodeBuku LEFT JOIN pengembalian ON (peminjaman.kodeAnggota = pengembalian.KodeAnggota AND peminjaman.kodeBuku = pengembalian.kodeBuku AND CAST(peminjaman.tglpinjam AS DATE) = CAST(pengembalian.tglpinjam AS DATE))";
        PreparedStatement ps = cn.prepareStatement(getall);
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> data = new ArrayList<>();
        while (rs.next()) {
            // String tanggaldikembalikan = rs.getString(7);
            // if (tanggaldikembalikan == null) {
            pg = new Pengembalian();
            pg.setKodeAgg(rs.getString(1));
            pg.setNamaAnggota(rs.getString(2));
            pg.setKodeBuku(rs.getString(3));
            pg.setJudul(rs.getString(4));
            pg.setTglpPjm(rs.getString(5));
            pg.setTglkmbl(rs.getString(6));
            pg.setTglDikembalikan(rs.getString(7));
            pg.setTerlambat(rs.getInt(8));
            pg.setDenda(rs.getDouble(9));
            data.add(pg);
            // } // perhatian : hilangkan kode program dibawah
            // String tanggaldikembalikan = rs.getString(7);
            // if (tanggaldikembalikan == null) { }
            // jika ingin program menampilkan data, semua data yang ada.
        }
        return data;
    }

    public int terlmbat(String tgl1, String tgl2) throws Exception {
        int selisih = 0;
        String terlambat = "SELECT DATEDIFF(?, ?) AS selisih";
        PreparedStatement ps = cn.prepareStatement(terlambat);
        ps.setString(1, tgl1);
        ps.setString(2, tgl2);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            selisih = rs.getInt(1);
        }
        return selisih;
    }

    @Override
    public List<Pengembalian> cari(String kode, String cari) throws Exception {
        String search = "SELECT anggota.kodeAnggota, anggota.namaAnggota, buku.kodeBuku, buku.judulBuku, peminjaman.tglpinjam, peminjaman.tglkembali, pengembalian.TglDikembalikan, pengembalian.terlambat, pengembalian.denda FROM peminjaman JOIN anggota ON peminjaman.kodeAnggota = anggota.kodeAnggota JOIN buku ON peminjaman.kodeBuku = buku.kodeBuku LEFT JOIN pengembalian ON (peminjaman.kodeAnggota = pengembalian.KodeAnggota AND peminjaman.kodeBuku = pengembalian.kodeBuku AND CAST(peminjaman.tglpinjam AS DATE) = CAST(pengembalian.tglpinjam AS DATE)) WHERE "+kode+" LIKE '%"+cari+"%'";
        PreparedStatement ps = cn.prepareStatement(search);
        // ps.setString(1, kode);
        // ps.setString(2, cari);
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> data = new ArrayList<>();
        while (rs.next()) {
            pg = new Pengembalian();
            pg.setKodeAgg(rs.getString(1));
            pg.setNamaAnggota(rs.getString(2));
            pg.setKodeBuku(rs.getString(3));
            pg.setJudul(rs.getString(4));
            pg.setTglpPjm(rs.getString(5));
            pg.setTglkmbl(rs.getString(6));
            pg.setTglDikembalikan(rs.getString(7));
            pg.setTerlambat(rs.getInt(8));
            pg.setDenda(rs.getDouble(9));
            data.add(pg);
        }
        return data;
    }
}
