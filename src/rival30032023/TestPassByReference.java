/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rival30032023;

/**
 *
 * @author RIVAL DINALIS
 */
public class TestPassByReference {
    public static void main( String[] args ){ 
        //membuat array integer 
        int []ages = {10, 11, 12}; 
        //mencetak nilai array 
        for( int i=0; i<ages.length; i++ ){ 
        System.out.println( ages[i] ); 
        } 
        test( ages ); 
 
        for( int i=0; i<ages.length; i++ ){ 
            System.out.println( ages[i] ); 
        } 
    } 
    public static void test( int[] arr ){ 
        //merubah nilai array 
        for( int i=0; i<arr.length; i++ ){ 
            arr[i] = i + 50; 
        } 
    } 
}
