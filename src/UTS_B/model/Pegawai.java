/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.model;

/**
 *
 * @author RIVAL DINALIS
 */
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    
    public Pegawai(){
    }
    
    public Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getnip(){
        return nip;
    }
    
    public void setnip(String nip){
        this.nip = nip;
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
