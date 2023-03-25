/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival25032023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan721 {
     public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];

        // Minta input dari user untuk 10 nomor dan simpan ke dalam array
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nomor ke-" + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        // Temukan nomor terbesar dalam array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Tampilkan nomor terbesar yang diberikan oleh user
        System.out.println("Nomor terbesar yang diberikan oleh user adalah: " + max);
    }
    
}
