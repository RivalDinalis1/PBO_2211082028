/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.model;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RIVAL DINALIS
 */
public class GajiDaoImpl implements GajiDao {
   List<Gaji> data = new ArrayList<>();
    
    public GajiDaoImpl() {
        PegawaiDao pegawaiDao = new PegawaiDaoImpl();
        data.add(new Gaji(pegawaiDao.getPegawai(0), "Golongan IIIA", new Date(), 1000000, 1000000, 2300000));
    }
    
    public void save(Gaji gaji){
        data.add(gaji);
    }
    
    public void update(int index, Gaji gaji){
        data.set(index, gaji);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Gaji getGaji(int index){
        return data.get(index);
    }
    
    public List<Gaji> getAll(){
        return data;
    }
}
