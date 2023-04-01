/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival01042023;

/**
 *
 * @author RIVAL DINALIS
 */
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
        
        //menampilkan
        System.out.println("Data Objek Nama");
        System.out.println("Nama    :"  +anna.getName());
        System.out.println("Alamat  :"  +anna.getAddress());
        System.out.println("Umur    :"  +anna.getAge());
        //memanggil method print
        System.out.println("Data Objek criss");
        criss.print("");
        criss.print(70, 80, 90);
        
        System.out.println("Data Objek ali");
        ali.print("");
        
        //menampilkan jumlah siswa
        System.out.println("count="+StudentRecord.getStudentCount());
    }
}
