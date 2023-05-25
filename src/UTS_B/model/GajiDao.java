/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.model;
import java.util.List;
/**
 *
 * @author RIVAL DINALIS
 */
public interface GajiDao {
    void save(Gaji gaji);
    void update(int index, Gaji gaji);
    void delete(int index);
    Gaji getGaji(int index);
    List<Gaji> getAll();
}
