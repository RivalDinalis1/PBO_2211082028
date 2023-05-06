/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.model;

/**
 *
 * @author RIVAL DINALIS
 */
public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){
    }
    
    public Peminjaman(Anggota anggota, Buku buku, String tglpinjam, String tglkembali ){
        this.anggota = anggota;
        this.buku = buku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public Anggota getanggota(){
        return anggota;
    }
    
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
    
    public Buku getbuku(){
        return buku;
    }
    
    public void setbuku(Buku buku){
        this.buku = buku;
    }
    
    public String gettglpinjam(){
        return tglpinjam;
    }
    
   public void settglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
   public String gettglkembali(){
        return tglkembali;
    }
    
   public void settglkembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
}
