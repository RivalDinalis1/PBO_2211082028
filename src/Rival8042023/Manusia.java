/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival8042023;

/**
 *
 * @author RIVAL DINALIS
 */
public class Manusia extends LivingThing {
    public void Berjalan(){
    System.out.println("Manusia berjalan");
    }
    
    public static void main(String[] args){
        Manusia m = new Manusia();
        m.Bernapas();
        m.Makan();
        m.Berjalan();
    }
}
