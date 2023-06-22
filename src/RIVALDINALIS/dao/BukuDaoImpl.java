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
public class BukuDaoImpl implements BukuDao{
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
    public void update (Buku buku) throws Exception{
        String sql = "UPDATE buku set judulbuku=?, pengarang=?, penerbit=? "
                    +"WHERE kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(4, buku.getKodebuku());
        ps.setString(1, buku.getJudulbuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getPenerbit());
        ps.executeUpdate();
    }    
    public void delete(Buku buku) throws Exception{
            
        String sql = "DELETE FROM buku WHERE kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,buku.getKodebuku());
        ps.executeUpdate();
    }
    public Buku getBuku(String kodebuku) throws Exception{
        String sql = "select * from buku where kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodebuku);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
        }
        return buku;
    } 
    
//    public List<Buku> getAl() throws Exception{
//        String sql = "Select * from Buku";
//        PreparedStatement ps = connection.prepareStatement(sql);
//        ResultSet rs = ps.executeQuery();
//        Buku buku;
//        List<Buku> list = new ArrayList<>();
//        while(rs.next()){
//            buku = new Buku();
//            buku.setKodebuku(sql);
//        }
//        return list;
//    }
   public List<Buku> getAll()throws Exception {
        String sql = "SELECT * FROM buku";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Buku buku; 
        List <Buku> list = new ArrayList<>();
        while(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            list.add(buku);
        }
        return list;
    }  
}
