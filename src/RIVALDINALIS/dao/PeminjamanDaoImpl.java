/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.dao;
import RIVALDINALIS.model.*;
import RIVALDINALIS.model.Peminjaman;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RIVAL DINALIS
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
    private Connection con;
    
   
    public PeminjamanDaoImpl(Connection con){
        this.con = con;
        
    }
    public void insert (Peminjaman p) throws Exception{
       String sql = "insert into Peminjaman values(?,?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql);
       ps.setString(1,p.getA().getKodeanggota());
       ps.setString(2,p.getB().getKodebuku());
       ps.setString(3,p.getTglpinjam());
       ps.setString(4,p.getTglkembali());
       ps.executeUpdate();
       ps.close();
    }
    public void update (Peminjaman p) throws Exception{
        String sql = "UPDATE peminjaman set tglkembali=? "
                    +"WHERE kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getTglkembali());
        ps.setString(2, p.getA().getKodeanggota());
        ps.setString(3, p.getB().getKodebuku());
        ps.setString(4, p.getTglpinjam());
        ps.executeUpdate();
    }    
    public void delete(Peminjaman p) throws Exception{
            
        String sql = "DELETE FROM Peminjaman WHERE kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,p.getA().getKodeanggota());
        ps.setString(2,p.getB().getKodebuku());
        ps.setString(3,p.getTglpinjam());
        ps.executeUpdate();
    }
    public Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws Exception{
        String sql = "select * from peminjaman WHERE kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman p = null;
        if(rs.next()){
            p = new Peminjaman();
            AnggotaDao anggotadao = new AnggotaDaoImpl(con);
            Anggota anggota = anggotadao.getAnggota(kodeanggota);
            p.setA(anggota);
            BukuDao bukuDao = new BukuDaoImpl(con);
            Buku buku = bukuDao.getBuku(kodebuku);
            p.setB(buku);
           
            p.setTglpinjam(rs.getString(3));
            p.setTglkembali(rs.getString(4));
        }
        return p;
    } 
    

   public List<Peminjaman> getAll()throws Exception {
        String sql = "SELECT * FROM Peminjaman";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Peminjaman p; 
        List <Peminjaman> list = new ArrayList<>();
        while(rs.next()){
            p = new Peminjaman();
            AnggotaDao anggotadao = new AnggotaDaoImpl(con);
            Anggota anggota = anggotadao.getAnggota(rs.getString(1));
            p.setA(anggota);
            BukuDao bukuDao = new BukuDaoImpl(con);
            Buku buku = bukuDao.getBuku(rs.getString(2));
            p.setB(buku);
            p.setTglpinjam(rs.getString(3));
            p.setTglkembali(rs.getString(4));
            list.add(p);
        }
        return list;
    } 
}

