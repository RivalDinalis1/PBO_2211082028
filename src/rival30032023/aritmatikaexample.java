/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rival30032023;

/**
 *
 * @author RIVAL DINALIS
 */
public class aritmatikaexample {
     public static void main(String[] args) {
        Aritmatika arit = new Aritmatika();
        int a = 1;
        int b = 2;
        System.out.println(arit.tambah(a,b));
        System.out.println(arit.cekganjil(a));
        
        int[] bilanganGanjil = arit.bilanganGanjilpertama();
        System.out.println("Lima bilangan ganjil pertama: ");
        for (int j = 0; j < bilanganGanjil.length; j++) {
        System.out.print(bilanganGanjil[j] + " ");
        }
    }
}
