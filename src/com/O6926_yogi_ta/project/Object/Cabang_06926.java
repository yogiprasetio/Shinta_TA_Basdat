/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.O6926_yogi_ta.project.Object;

/**
 *
 * @author DFA-Agent02
 */
public class Cabang_06926 {
    private String Nama_cabang, Alamat_cabang, No_telp;
    private Integer  Kode_cabang;

    public Cabang_06926(String Nama_cabang,String Alamat_cabang,String No_telp,int Kode_cabang) {
        setAlamat_cabang(Alamat_cabang);
        setKode_cabang(Kode_cabang);
        setNo_telp(No_telp);
        setNama_cabang(Nama_cabang);
    }


    
    
    private void setAlamat_cabang(String Alamat_cabang) {
        this.Alamat_cabang = Alamat_cabang;
    }

    public String getAlamat_cabang() {
        return Alamat_cabang;
    }

    private void setKode_cabang(int Kode_cabang) {
        this.Kode_cabang = Kode_cabang;
    }

    public int getKode_cabang() {
        return Kode_cabang;
    }

    private void setNama_cabang(String Nama_cabang) {
        this.Nama_cabang = Nama_cabang;
    }

    public String getNama_cabang() {
        return Nama_cabang;
    }

    private void setNo_telp(String No_telp) {
        this.No_telp = No_telp;
    }

    public String getNo_telp() {
        return No_telp;
    }
    
}
