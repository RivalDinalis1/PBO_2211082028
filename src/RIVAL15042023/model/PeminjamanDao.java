/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.model;

import java.util.List;

/**
 *
 * @author RIVAL DINALIS
 */
public interface PeminjamanDao {
    void save(Peminjaman  peminjaman);
    void update(int index, Peminjaman peminjaman);
    void delete(int index);
    Peminjaman getPeminjaman (int index);
    List<Peminjaman> getAll();
}
