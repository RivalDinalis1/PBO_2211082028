/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rival30032023;

/**
 *
 * @author RIVAL DINALIS
 */
public class casting_explisit {
    public static void main( String[] args ){
    char valChar = 'A'; 
    int valInt = valChar; 
    double valDouble = 10.12; 
    valInt = (int)valDouble; //men-convert valDouble ke tipe int 
    double x = 10.2; 
    int y = 2; 
    int result = (int)(x/y); //hasil typecast operasi ke int
    System.out.println(valInt); 
    System.out.println(result);
    }
}