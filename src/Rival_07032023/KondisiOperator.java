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
public class KondisiOperator {
    public static void main(String[] args){
        String status  = "";
        int grade = 80;
        
        //mendapatkan ststus pelajaran
        status = (grade >= 60)?"passed":"fail";
        
        //print status 
        System.out.println(status);
    }
    
}
