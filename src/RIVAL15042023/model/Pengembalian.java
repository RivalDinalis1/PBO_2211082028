/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.model;

/**
 *
 * @author RIVAL DINALIS
 */
public class Pengembalian {
    private Peminjaman peminjaman;
    private String tglpengembalian;
    private int terlambat;
    private double denda;
    
    public Peminjaman getPeminjaman(){
        
        return peminjaman;
    }
    public void setPeminjaman(Peminjaman peminjaman){
        
        this.peminjaman = peminjaman;
    }

    public String getTglpengembalian() {
        return tglpengembalian;
    }
    public void setTglpengembalian(String tglpengembalian) {
        this.tglpengembalian = tglpengembalian;
    }
    
    public int getTerlambat() {
        return terlambat;
    }
    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public double getDenda() {
        return denda;
    }
     public void setDenda(double denda) {
        this.denda = denda;
    }
}
    
    
    

