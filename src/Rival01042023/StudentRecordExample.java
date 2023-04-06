/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival01042023;

import java.util.Scanner;


public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord anna = new StudentRecord();
        StudentRecord criss = new StudentRecord();
        StudentRecord ali = new StudentRecord("ali");
        
        anna.setName("anna");
        anna.setAddress("Padang");
        anna.setAge(18);
        
        criss.setName("criss");
        criss.setAddress("Bukittinggi");
        criss.setAge(20);
        
        
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Pilihan Menu: ");
            System.out.println("1. Tampilkan nilai Anna");
            System.out.println("2. Tampilkan nilai Criss");
            System.out.println("3. Tampilkan nilai Ali");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Data Objek Anna");
                    anna.print("");
                    anna.print(80, 90, 100);
                    break;
                case 2:
                    System.out.println("Data Objek Criss");
                    criss.print("");
                    criss.print(70, 80, 90);
                    break;
                case 3:
                    System.out.println("Data Objek Ali");
                    ali.print("");
                    ali.print(70, 90, 90);
                    break;
                case 4:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (choice != 4);
       
    }
}
