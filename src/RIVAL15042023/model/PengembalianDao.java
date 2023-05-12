/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RIVAL15042023.model;

import java.util.List;

/**
 *
 * @author Hp
 */
public interface PengembalianDao {
    void save(Pengembalian pengembalian);
    void update(int idx, Pengembalian pengembalian);
    void delete(int idx);
    Pengembalian getPengembalian(int idx);
    List<Pengembalian> getAll();
}
