/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.model;

/**
 *
 * @author RIVAL DINALIS
 */
public class Pengembalian {
   
    private String kodeAgg;
    private String namaAnggota;
    private String kodeBuku;
    private String judul;
    private String tglpPjm;
    private String tglkmbl;
    private String tglDikembalikan;
    private int terlambat;
    private double denda;

    public Pengembalian() {
    }

    public Pengembalian(String kodeAgg, String namaAnggota, String kodeBuku, String judul, String tglpPjm,
            String tglkmbl, String tglDikembalikan, int terlambat, double denda) {
        this.kodeAgg = kodeAgg;
        this.namaAnggota = namaAnggota;
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tglpPjm = tglpPjm;
        this.tglkmbl = tglkmbl;
        this.tglDikembalikan = tglDikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }

    public String getKodeAgg() {
        return kodeAgg;
    }

    public void setKodeAgg(String kodeAgg) {
        this.kodeAgg = kodeAgg;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTglpPjm() {
        return tglpPjm;
    }

    public void setTglpPjm(String tglpPjm) {
        this.tglpPjm = tglpPjm;
    }

    public String getTglkmbl() {
        return tglkmbl;
    }

    public void setTglkmbl(String tglkmbl) {
        this.tglkmbl = tglkmbl;
    }

    public String getTglDikembalikan() {
        // SimpleDateFormat format = new SimpleDateFormy
        return tglDikembalikan;
    }

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public double getDenda() {
        denda = terlambat * 1000;
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
}
