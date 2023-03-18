/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rival_07032023;

/**
 *
 * @author LABSIKOMP03
 */
public class Latihan3 {
     public static void main(String[] args){
        String status  = "";
        int number1 = 10;
        int number2 = 23;
        int number3 = 5; 
        int max =(number1>number2)? ((number1>number3)?number1:number3):((number2>number3)?number2:number3);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println("nilai tertinggi adalah " + max);
    }
}
