/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RIVALDINALIS.dao;
import RIVALDINALIS.model.Anggota;
import java.util.List;
/**
 *
 * @author RIVAL DINALIS
 */
public interface AnggotaDao {
   void insert (Anggota anggota) throws Exception;
   void update(Anggota anggota)throws Exception;
   void delete(Anggota anggota)throws Exception ;
   Anggota getAnggota(String kodeanggota)throws Exception;
   List<Anggota> getAll()throws Exception;
}
