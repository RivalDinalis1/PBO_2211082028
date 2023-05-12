/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival06052023.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RIVAL DINALIS
 */
public class KaryawanDaoImpl implements KaryawanDao {
    List<Karyawan> data = new ArrayList<>();
    
    public KaryawanDaoImpl() {
        data.add(new Karyawan("ali", "padang", "nikah","111","I","manager"));
        data.add(new Karyawan("ani", "bukit tinggi", "nikah","112","II","Karyawan"));
        data.add(new Karyawan("al", "pasaman", "belim menikah","113","II","Karyawan"));
    }
    
    public void save(Karyawan karyawan){
        data.add(karyawan);
    }
    public void update(int index, Karyawan karyawan){
        data.set(index, karyawan);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Karyawan getKaryawan(int index){
        return data.get(index);
    }
    
    public List<Karyawan> getAll(){
        return data;
    }
}
