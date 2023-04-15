/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival13042024;

/**
 *
 * @author RIVAL DINALIS
 */
public class InterfaceExample {
    public static void main(String[] args){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        
        System.out.println("10 dan 11"+ myInteger.isEqual(10,11));
        System.out.println("10.4 dan 10.6"+ myDouble.isEqual(10.4,10.6));
    }
}
