/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival06052023.model;
import java.util.List;
/**
 *
 * @author RIVAL DINALIS
 */
public interface KaryawanDao {
    void save(Karyawan karyawan);
    void update(int index, Karyawan karyawan);
    void delete(int index);
    Karyawan getKaryawan(int index);
    List<Karyawan> getAll();
}
