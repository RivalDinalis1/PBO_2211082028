/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.dao;
import RIVALDINALIS.model.Buku;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RIVAL DINALIS
 */
public class BukuDaoImpl implements AnggotaDao{
    private Connection connection;
    
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert (Buku buku) throws Exception{
       String sql = "insert into Buku values(?,?,?,?)";
       PreparedStatement ps = connection.prepareStatement(sql);
       ps.setString(1,buku.getKodebuku());
       ps.setString(2,buku.getJudulbuku());
       ps.setString(3,buku.getPengarang());
       ps.setString(4,buku.getPenerbit());
       ps.executeUpdate();
       ps.close();
    }
    public void update (Anggota anggota) throws Exception{
        String sql = "UPDATE anggota set namaanggota=?, alamat=?, jeniskelamin=? "
                    +"WHERE kodeanggota=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anggota.getNamaanggota());
        ps.setString(2, anggota.getAlamat());
        ps.setString(3, anggota.getJeniskelamin());
        ps.setString(4, anggota.getKodeanggota());
        ps.executeUpdate();
    }    
    public void delete(Anggota anggota) throws Exception{
            
        String sql = "DELETE FROM anggota WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,anggota.getKodeanggota());
        ps.executeUpdate();
    }
    public Anggota  getAnggota(String kodeanggota) throws Exception{
        String sql = "select * from anggota where kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        if(rs.next()){
            anggota = new Anggota();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJeniskelamin(rs.getString(4));
        }
        return anggota;
    } 
    
    public List<Anggota> getAll()throws Exception {
        String sql = "SELECT * FROM anggota";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Anggota anggota; 
        List <Anggota> list = new ArrayList<>();
        while(rs.next()){
            anggota = new Anggota();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJeniskelamin(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }
}
