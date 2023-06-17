/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.model;

/**
 *
 * @author RIVAL DINALIS
 */
public class Buku {
    private String kodebuku;
    private String judulbuku;
    private String pengarang;
    private String penerbit;
    

    public Buku() {}
    public Buku(String kodebuku, String judulbuku, String pengarang, String penerbit) {
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }
    
    public String getKodebuku() {
        return kodebuku;
    }

    public String getJudulbuku() {
        return judulbuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public void setJudulbuku(String judulbuku) {
        this.judulbuku = judulbuku;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    
}
