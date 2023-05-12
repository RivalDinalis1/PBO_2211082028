/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class PengembalianDaoImpl implements PengembalianDao{
    List<Pengembalian> data = new ArrayList<>();
    PeminjamanDao dataP;
    public PengembalianDaoImpl(){
        dataP = new PeminjamanDaoImpl();
        data.add(new Pengembalian(dataP.getPeminjaman(0).gettglkembali(),"29/04/2023"));
      
    }
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    public void update(int idx, Pengembalian pengembalian){
        data.set(idx, pengembalian);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Pengembalian getPengembalian(int index){
        return data.get(index);
    }
    public List<Pengembalian> getAll(){
        return data;
    }
}
