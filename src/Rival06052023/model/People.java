/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival06052023.model;

/**
 *
 * @author RIVAL DINALIS
 */
public class People {
    protected String nama;
    protected String alamat;
    protected String statusnikah;
    
    public People(){
    }
    
    public People(String nama, String alamat, String statsnikah){
        this.nama = nama;
        this.alamat = alamat;
        this.statusnikah = statusnikah;
    }
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getalamat(){
        return alamat;
    }
    
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getstatusnikah(){
        return statusnikah;
    }
    
   public void setstatusnikah(String statusnikah){
        this.statusnikah = statusnikah;
    }
}
