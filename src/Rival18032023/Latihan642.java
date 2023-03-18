/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival18032023;

import java.util.Scanner;
public class Latihan642 {
    // latihan module 6 (6.5.4Perpangkatan) do while 
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Bilangan yang ingin dipangkatkan: ");
    int a = in.nextInt();
        System.out.print("Pangkat bilangan: ");
        int b = in.nextInt();
        //proses
        int i = 1;
        int hasil = a;
        do{
            hasil *= a;
            i++;
        }while(i<b);
        System.out.println("Hasil dati "+a+"^"+b+" = "+hasil);
    }
}
