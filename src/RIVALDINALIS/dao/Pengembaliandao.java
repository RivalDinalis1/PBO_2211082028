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
public interface Pengembaliandao {
    void insert(Pengembalian p) throws Exception;
    void update(Pengembalian p) throws Exception;
    void delete(Pengembalian p) throws Exception;
    Pengembalian getPengembalian(String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    List<Pengembalian>getAll() throws Exception;
}
