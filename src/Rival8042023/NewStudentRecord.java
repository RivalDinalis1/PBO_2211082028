/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival8042023;

import Rival8042023.StudentRecord;
public class NewStudentRecord extends StudentRecord {
    //latihan 1
    private double CompGrade;
    public NewStudentRecord(){
        super("ali","padang");
        System.out.println("inside NewStudentRecord constructor");
    }
    
     public double getCompGrade(){
        return CompGrade;
    }
    public void setCompGrade(double Grade){
        this.CompGrade = Grade;
    }
    public double getAverage(){
        return (getMathGrade() + getEnglishGrade() + getScienceGrade() + getCompGrade())/4;
    }
    public static void main(String[] args){
        NewStudentRecord stu = new NewStudentRecord();
        stu.setName("kairul");
        stu.setCompGrade(90);
        stu.setEnglishGrade(90);
        stu.setMathGrade(70);
        stu.setScienceGrade(80);
        System.out.println("Nama            :"+stu.getName());
        System.out.println("Rata-Rata       :"+stu.getAverage());
        System.out.println("Nilai           :"+stu.nilaihuruf());
    }
}

