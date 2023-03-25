/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival25032023;

import javax.swing.JOptionPane;
public class latihan722 {
     public static void main(String[] args) {
        int[] numbers = new int[10];

        // Minta input dari user untuk 10 nomor dan simpan ke dalam array
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1));
            numbers[i] = Integer.parseInt(input);
        }

        // Temukan nomor terbesar dalam array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Tampilkan nomor terbesar yang diberikan oleh user
        JOptionPane.showMessageDialog(null, "Nomor terbesar yang di inputkan oleh user adalah: " + max);
    }
}
