/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.dao;

import RIVALDINALIS.model.Anggota;
import RIVALDINALIS.model.Peminjaman;
import RIVALDINALIS.model.Pengembalian;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RIVAL DINALIS
 */
public class PengembaliandaoImpl implements Pengembaliandao{
    
    private Connection con;
    
    public  PengembaliandaoImpl(Connection con){
        this.con = con;
    }
    
    public void insert (Pengembalian p) throws Exception{
       String sql = "insert into Peminjaman values(?,?,?,?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql);
       ps.setString(1,p.getP().getA().getKodeanggota());
       ps.setString(2,p.getP().getB().getKodebuku());
       ps.setString(3,p.getP().getTglpinjam());
       ps.setString(4,p.getTgldikembalikan());
       ps.setString(5,p.getTerlambat());
       ps.setDouble(6,p.getDenda());
       ps.executeUpdate();
       ps.close();
    }
    public void update (Pengembalian p) throws Exception{
        String sql = "UPDATE pengembalian set Tgldikembalikan=?, terlambat=?, denda=? "
                    +"WHERE kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(4,p.getP().getA().getKodeanggota());
        ps.setString(5,p.getP().getB().getKodebuku());
        ps.setString(6,p.getP().getTglpinjam());
        ps.setString(1,p.getTgldikembalikan());
        ps.setString(2,p.getTerlambat());
        ps.setDouble(3,p.getDenda());
        ps.executeUpdate();
    }    
    public void delete(Pengembalian p) throws Exception{
            
        String sql = "DELETE FROM pengembalian WHERE kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,p.getP().getA().getKodeanggota());
        ps.setString(2,p.getP().getB().getKodebuku());
        ps.setString(3,p.getP().getTglpinjam());
        ps.executeUpdate();
    }
    public Pengembalian getPengembalian(String kodeanggota, String kodebuku, String tglpinjam) throws Exception{
        String sql = "select * from peminjaman WHERE kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Pengembalian p = null;
        if(rs.next()){
            p = new Pengembalian();
            PeminjamanDao peminjamanDao = new PeminjamanDaoImpl(con);
            Peminjaman peminjaman = peminjamanDao.getPeminjaman( rs.getString(1), 
                    rs.getString(2), rs.getString(3));
            p.setP(peminjaman);  
            p.setTgldikembalikan(rs.getString(3));
            p.setTerlambat(rs.getString(4));
            p.setDenda(rs.getDouble(5));
        }
        return p;
    } 
    

   public List<Pengembalian> getAll()throws Exception {
        String sql = "SELECT * FROM pengembalian";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Pengembalian p; 
        List <Pengembalian> list = new ArrayList<>();
        while(rs.next()){
             p = new Pengembalian();
            PeminjamanDao peminjamanDao = new PeminjamanDaoImpl(con);
            Peminjaman peminjaman = peminjamanDao.getPeminjaman( rs.getString(1), 
                    rs.getString(2), rs.getString(3));
            p.setP(peminjaman);  
            p.setTgldikembalikan(rs.getString(3));
            p.setTerlambat(rs.getString(4));
            p.setDenda(rs.getDouble(5));
            list.add(p);
        }
        return list;
    } 
}
