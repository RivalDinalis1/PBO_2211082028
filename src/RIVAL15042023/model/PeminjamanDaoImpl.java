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
public class PeminjamanDaoImpl implements PeminjamanDao {
    List<Peminjaman> data = new ArrayList<>();
    
    public PeminjamanDaoImpl() {
        AnggotaDao AnggotaDao= new AnggotaDaoImpl();
        BukuDao bukuDao= new BukuDaoImpl();
        data.add(new Peminjaman(AnggotaDao.getAnggota(0),bukuDao.getBuku(1),"27-08-2022","29-08-2022"));
    }
    
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman  getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman> getAll(){
        return data;
    }
}
