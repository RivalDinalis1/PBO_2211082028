/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival01042023;

import java.util.Scanner;
public class BukuAlamatMain {
    
    private static final int KAPASITAS_BUKU = 100;
    private static BukuAlamat[] bukuAlamat = new BukuAlamat[KAPASITAS_BUKU];
    private static int jumlahData = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan = 0;
        do {
            System.out.println("==== BUKU ALAMAT ====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Update Data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    hapusData();
                    break;
                case 3:
                    tampilkanData();
                    break;
                case 4:
                    updateData();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
        } while (pilihan != 0);
    }

    private static void tambahData() {
        Scanner input = new Scanner(System.in);

        if (jumlahData < KAPASITAS_BUKU) {
            System.out.println("Masukkan data baru:");

            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("Alamat : ");
            String alamat = input.nextLine();

            System.out.print("Telepon : ");
            String telepon = input.nextLine();

            System.out.print("Email : ");
            String email = input.nextLine();

            bukuAlamat[jumlahData] = new BukuAlamat(nama, alamat, telepon, email);
            jumlahData++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Buku alamat sudah penuh.");
        }
    }

    private static void hapusData() {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nomor urut data yang akan dihapus : ");
    int nomor = input.nextInt();

    if (nomor >= 1 && nomor <= jumlahData) {
        for (int i = nomor-1; i < jumlahData-1; i++) {
            bukuAlamat[i] = bukuAlamat[i+1];
        }
        jumlahData--;
        System.out.println("Data berhasil dihapus.");
    } else {
        System.out.println("Data tidak ditemukan.");
    }
}

private static void tampilkanData() {
    System.out.println("==== DAFTAR DATA ====");
    for (int i = 0; i < jumlahData; i++) {
        System.out.println("Data ke-" + (i+1));
        System.out.println("Nama : " + bukuAlamat[i].getNama());
        System.out.println("Alamat : " + bukuAlamat[i].getAlamat());
        System.out.println("Telepon : " + bukuAlamat[i].getTelepon());
        System.out.println("Email : " + bukuAlamat[i].getEmail());
        System.out.println();
    }
}

private static void updateData() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nomor urut data yang akan diupdate : ");
    int nomor = input.nextInt();
    input.nextLine();
    if (nomor >= 1 && nomor <= jumlahData) {
    System.out.print("Nama : ");
    String nama = input.nextLine();

    System.out.print("Alamat : ");
    String alamat = input.nextLine();

    System.out.print("Telepon : ");
    String telepon = input.nextLine();

    System.out.print("Email : ");
    String email = input.nextLine();

    bukuAlamat[nomor-1].setNama(nama);
    bukuAlamat[nomor-1].setAlamat(alamat);
    bukuAlamat[nomor-1].setTelepon(telepon);
    bukuAlamat[nomor-1].setEmail(email);
    System.out.println("Data berhasil diupdate.");
    }
    else   
    {
    System.out.println("Data tidak ditemukan.");
    }
    }
}

