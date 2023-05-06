/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RIVAL DINALIS
 */
public class PengembalianDaoImpl implements PengembalianDao {
    List<Pengembalian> data = new ArrayList<>();
    
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    
    public void update(int index, Pengembalian pengembalian){
        data.set(index, pengembalian );
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

