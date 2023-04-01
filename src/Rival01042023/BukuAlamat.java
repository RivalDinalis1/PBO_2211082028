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
    private static final int KAPASITAS_BUKU = 100;
    private static BukuAlamat[] bukuAlamat = new BukuAlamat[KAPASITAS_BUKU];
    private static int jumlahData = 0;
    
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
    
    public static void tambahData(BukuAlamat data) {
        if (jumlahData < KAPASITAS_BUKU) {
            bukuAlamat[jumlahData] = data;
            jumlahData++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Buku alamat sudah penuh.");
        }
    }
    
    public static void hapusData(int index) {
        if (index < jumlahData) {
            for (int i = index; i < jumlahData - 1; i++) {
                bukuAlamat[i] = bukuAlamat[i + 1];
            }
            jumlahData--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
    
    public static void tampilkanData() {
        if (jumlahData > 0) {
            System.out.println("Data pada buku alamat:");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i+1) + ". " + bukuAlamat[i].getNama() + ", " + bukuAlamat[i].getAlamat() + ", " + bukuAlamat[i].getTelepon() + ", " + bukuAlamat[i].getEmail());
            }
        } else {
            System.out.println("Buku alamat kosong.");
        }
    }
    
    public static void updateData(int index, BukuAlamat data) {
        if (index < jumlahData) {
            bukuAlamat[index] = data;
            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

}
