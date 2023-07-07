/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.dao;

import RIVALDINALIS.model.Pengembalian;
import java.util.List;

/**
 *
 * @author RIVAL DINALIS
 */
public interface PengembalianDao {
    void Insert(Pengembalian pg) throws Exception;

    void Update(Pengembalian pg) throws Exception;

    void Delete(Pengembalian pg) throws Exception;

    Pengembalian getPm(String kodeBuku, String kodeanggota, String tglpinjam) throws Exception;

    List<Pengembalian> getAll() throws Exception;

    int terlmbat(String tgl1, String tgl2) throws Exception;

    List<Pengembalian> cari(String kode, String cari) throws Exception;
}
