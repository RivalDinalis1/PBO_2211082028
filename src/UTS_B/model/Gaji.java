/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.model;
import java.util.Date;
/**
 *
 * @author RIVAL DINALIS
 */
public class Gaji {
    private Pegawai pegawai;
    private String golongan;
    private Date tanggal;
    private double gapok;
    private double tunjanganAnak;
    private double tunjanganIstri;

    public Gaji(Pegawai pegawai, String golongan, Date tanggal, double gapok, double tunjanganAnak, double tunjanganIstri) {
        this.pegawai = pegawai;
        this.golongan = golongan;
        this.tanggal = tanggal;
        this.gapok = gapok;
        this.tunjanganAnak = tunjanganAnak;
        this.tunjanganIstri = tunjanganIstri;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public double getGapok() {
        return gapok;
    }

    public void setGapok(double gapok) {
        this.gapok = gapok;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public void setTunjanganAnak(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public double getTunjanganIstri() {
        return tunjanganIstri;
    }

    public void setTunjanganIstri(double tunjanganIstri) {
        this.tunjanganIstri = tunjanganIstri;
    }
}
