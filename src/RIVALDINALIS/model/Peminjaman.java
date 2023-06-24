/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.model;

/**
 *
 * @author RIVAL DINALIS
 */
public class Peminjaman {
    
    private Anggota a;
    private Buku b;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){
    
    }

    public Peminjaman( Anggota a, Buku b, String tglpinjam, String tglkembali) {
        this.a = a;
        this.b = b;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }

    public Anggota getA() {
        return a;
    }

    public Buku getB() {
        return b;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setA(Anggota a) {
        this.a = a;
    }

    public void setB(Buku b) {
        this.b = b;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }
    
   
}
