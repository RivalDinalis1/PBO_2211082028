/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival01042023;

import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampilkan data");
            System.out.println("3. Update data");
            System.out.println("4. Hapus data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            
            int pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan) {
                case 0:
                    System.out.println("Terima kasih.");
                    System.exit(0);
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamat = input.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String telepon = input.nextLine();
                    System.out.print("Masukkan email: ");
                    String email = input.nextLine();
                    BukuAlamat.tambahData(new BukuAlamat(nama, alamat, telepon, email));
                    break;
                case 2:
                    BukuAlamat.tampilkanData();
                    break;
                case 3:
                    System.out.print("Masukkan nomor urut data yang ingin diupdate: ");
                    int indexUpdate = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan nama: ");
                    String namaUpdate = input.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamatUpdate = input.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String teleponUpdate = input.nextLine();
                    System.out.print("Masukkan email: ");
                    String emailUpdate = input.nextLine();
                    BukuAlamat.updateData(indexUpdate - 1, new BukuAlamat(namaUpdate, alamatUpdate, teleponUpdate, emailUpdate));
                    break;
                case 4:
                    System.out.print("Masukkan nomor urut data yang ingin dihapus: ");
                    int indexHapus = input.nextInt();
                    BukuAlamat.hapusData(indexHapus - 1);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
            System.out.println();
        }
    }
}
