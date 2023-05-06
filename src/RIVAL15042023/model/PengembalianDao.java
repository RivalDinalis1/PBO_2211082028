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
public interface PengembalianDao {
    void save(Pengembalian  pengembalian);
    void update(int index, Pengembalian pengembalian );
    void delete(int index);
    Pengembalian getPengembalian (int index);
    List<Pengembalian> getAll();
}
