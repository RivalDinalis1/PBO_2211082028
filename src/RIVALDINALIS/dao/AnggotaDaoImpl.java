/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.dao;
import RIVALDINALIS.model.Anggota;
import java.sql.*;
/**
 *
 * @author RIVAL DINALIS
 */
public class AnggotaDaoImpl implements AnggotaDao{
    private Connection connection;
    
    public AnggotaDaoImpl(Connection connection){
         
        this.connection = connection;
    }
    public void insert (Anggota anggota) throws Exception{
       String sql = "insert into Anggota values(?,?,?,?)";
       PreparedStatement ps = connection.prepareStatement(sql);
       ps.setString(1,anggota.getKodeanggota());
       ps.setString(2,anggota.getNamaanggota());
       ps.setString(3,anggota.getAlamat());
       ps.setString(4,anggota.getJeniskelamin());
       ps.executeUpdate();
       ps.close();
    }
}
