/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.dao;
import RIVALDINALIS.model.Peminjaman;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author RIVAL DINALIS
 */
public interface PeminjamanDao {
    void insert (Peminjaman p) throws Exception;
    void update (Peminjaman p)throws Exception;
    void delete (Peminjaman p) throws Exception;
    Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    List <Peminjaman> getAll() throws Exception;;
    
}
