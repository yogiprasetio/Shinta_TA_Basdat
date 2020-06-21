package com.O6926_yogi_ta.project.Object;

/**
 *
 * @author DFA-Agent02
 */
public class Unit_06926 {
   private String Merk, Tipe, Warna, Golongan, Plat_nomer;
   private int Tahun, Cc;

    public Unit_06926(String Merk, String Tipe, String Warna, String Golongan, String Plat_nomer, int Tahun, int Cc) {
        setCc(Cc);
        setGolongan(Golongan);
        setMerk(Merk);
        setPlat_nomer(Plat_nomer);
        setTipe(Tipe);
        setWarna(Warna);
        setTahun(Tahun);
    }

    public int getCc() {
        return Cc;
    }

    public String getGolongan() {
        return Golongan;
    }

    public String getMerk() {
        return Merk;
    }

    public String getPlat_nomer() {
        return Plat_nomer;
    }

    public int getTahun() {
        return Tahun;
    }

    public String getTipe() {
        return Tipe;
    }

    public String getWarna() {
        return Warna;
    }

    private void setCc(int Cc) {
        this.Cc = Cc;
    }

    private void setGolongan(String Golongan) {
        this.Golongan = Golongan;
    }

    private void setMerk(String Merk) {
        this.Merk = Merk;
    }

    private void setPlat_nomer(String Plat_nomer) {
        this.Plat_nomer = Plat_nomer;
    }

    private void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }

    private void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }

    private void setWarna(String Warna) {
        this.Warna = Warna;
    }
   
}
