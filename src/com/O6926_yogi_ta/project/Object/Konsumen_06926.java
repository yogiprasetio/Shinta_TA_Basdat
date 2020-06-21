package com.O6926_yogi_ta.project.Object;

/**
 *
 * @author DFA-Agent02
 */
public class Konsumen_06926 {
    private String penagih, Nama_konsumen, Alamat_konsumen, Jenis_kelamin, Status_menikah, No_kontrak, No_telp;
    private int Umur;

    public Konsumen_06926(String Nama_konsumen,String Alamat_konsumen, String Jenis_kelamin, String Status_menikah, int Umur,String No_kontrak,String No_telp, String penagih) {
        setAlamat_konsumen(Alamat_konsumen);
        setJenis_kelamin(Jenis_kelamin);
        setNama_konsumen(Nama_konsumen);
        setStatus_menikah(Status_menikah);
        setUmur(Umur);
        setNo_kontrak(No_kontrak);
        setPenagih(penagih);
        setNo_telp(No_telp);
    }

    private void setPenagih(String penagih) {
        this.penagih = penagih;
    }

    public String getPenagih() {
        return penagih;
    }
    
    public String getAlamat_konsumen() {
        return Alamat_konsumen;
    }

    public String getJenis_kelamin() {
        return Jenis_kelamin;
    }

    public String getNama_konsumen() {
        return Nama_konsumen;
    }

    public String getNo_kontrak() {
        return No_kontrak;
    }

    public String getNo_telp() {
        return No_telp;
    }

    public String getStatus_menikah() {
        return Status_menikah;
    }

    public int getUmur() {
        return Umur;
    }

    private void setAlamat_konsumen(String Alamat_konsumen) {
        this.Alamat_konsumen = Alamat_konsumen;
    }

    private void setJenis_kelamin(String Jenis_kelamin) {
        this.Jenis_kelamin = Jenis_kelamin;
    }

    private void setNama_konsumen(String Nama_konsumen) {
        this.Nama_konsumen = Nama_konsumen;
    }

    private void setNo_kontrak(String No_kontrak) {
        this.No_kontrak = No_kontrak;
    }

    private void setNo_telp(String No_telp) {
        this.No_telp = No_telp;
    }

    private void setStatus_menikah(String Status_menikah) {
        this.Status_menikah = Status_menikah;
    }

    private void setUmur(int Umur) {
        this.Umur = Umur;
    }
    
    
}
