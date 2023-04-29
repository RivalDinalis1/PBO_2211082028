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
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){
    }
    
    public Peminjaman(Anggota anggota, String kodebuku, String tglpinjam, String tglkembali ){
        this.anggota = anggota;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public Anggota getanggota(){
        return anggota;
    }
    
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
    
    public String getkodebuku(){
        return kodebuku;
    }
    
    public void setkodebuku(String kodebuku){
        this.kodebuku = kodebuku;
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
