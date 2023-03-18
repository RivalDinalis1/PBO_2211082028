/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival18032023;
import javax.swing.JOptionPane;
public class Latahian6_2_1 {
    //Latihan module 6 (6.5.1Nilai) dengan joptionpane
    public static void main(String[] args){
        int n1,n2,n3;
        float rata;

        //JOption
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 3: "));
        
        rata = (n1+n2+n3)/3;
        /*JOptionPane.showMessageDialog(null,"Nilai rata-rata"+ rata);*/
        if(rata>=60)
            JOptionPane.showMessageDialog(null,rata+"\n:)");
        else
            JOptionPane.showMessageDialog(null,rata+"\n:-(");
    }
}
