/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival01042023;


public class BukuAlamat {
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
  
    public BukuAlamat() {
        nama = "";
        alamat = "";
        telepon = "";
        email = "";
    }
    
    public BukuAlamat(String nama, String alamat, String telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getTelepon() {
        return telepon;
    }
    
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
