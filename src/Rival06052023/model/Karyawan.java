/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival06052023.model;

/**
 *
 * @author RIVAL DINALIS
 */
public class Karyawan extends People {
    private String nip;
    private String golongan;
    private String jabatan;
    
    public Karyawan(){
    }
    
    public Karyawan(String nama, String alamat, String statsnikah, String nip, String golongan, String jabatan){
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
    }
    
    public String getnip(){
        return nip;
    }
    
    public void setnip(String nip){
        this.nip = nip;
    }
    
    public String getgolongan(){
        return golongan;
    }
    
    public void setgolongan(String golongan){
        this.golongan = golongan;
    }
    
    public String getjabatan(){
        return jabatan;
    }
    
   public void setjabatan(String jabatan){
        this.jabatan = jabatan;
    }
}
