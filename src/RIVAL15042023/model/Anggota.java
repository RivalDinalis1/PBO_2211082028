/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVAL15042023.model;

/**
 *
 * @author RIVAL DINALIS
 */
public class Anggota {
    private String nobp;
    private String nama;
    private String alamat;
    
    public Anggota(){
    }
    
    public Anggota(String nobp, String nama, String alamat){
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNobp(){
        return nobp;
    }
    
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
   public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
