/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rival30032023;

/**
 *
 * @author RIVAL DINALIS
 */
public class Aritmatika {
    public int tambah(int a, int b) {
        return a + b;
    }

    public boolean cekganjil(int a) {
        return (a % 2!= 0); 
    }
    public int []bilanganGanjilpertama() {
        int[] bilanganGanjil = new int[5];
        int i = 0;
        int j = 1;
        while (i < 5) {
            if (cekganjil(j)) {
                bilanganGanjil[i] = j;
                i++;
            }
            j++;
        }
        return bilanganGanjil;
    }
     public boolean cekPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] bilanganPrimaPertama() {
        int[] bilanganPrima = new int[5];
        int i = 0;
        int j = 2;
        while (i < 5) {
            if (cekPrima(j)) {
                bilanganPrima[i] = j;
                i++;
            }
            j++;
        }
        return bilanganPrima;
    }
}
