package com.O6926_yogi_ta.project.Object;

import java.sql.Date;


public class Riwayat {
    private int Denda, Angsuran, Terlambat, Pokok_utang, Tgl_jatuh_tempo, Tenor, Tgl_akhir_tenor;
    private int Bunga = 25; 
    private String Nama_kolektor;
    private Date Tgl_bayar_angsuran;

    public Riwayat(int Denda, int Angsuran, int Terlambat, int Pokok_utang, int Tgl_jatuh_tempo, int Tenor, int Tgl_akhir_tenor) {
        setAngsuran(Angsuran);
        setDenda(Denda);
        setPokok_utang(Pokok_utang);
        setTenor(Tenor);
        setTerlambat(Terlambat);
        setTgl_akhir_tenor(Tgl_akhir_tenor);
        setTgl_jatuh_tempo(Tgl_jatuh_tempo);
    }

    public Riwayat(String Nama_kolektor, Date Tgl_bayar_angsuran) {
        setNama_kolektor(Nama_kolektor);
        setTgl_bayar_angsuran(Tgl_bayar_angsuran);
    }

    public String getNama_kolektor() {
        return Nama_kolektor;
    }

    public Date getTgl_bayar_angsuran() {
        return Tgl_bayar_angsuran;
    }

    private void setNama_kolektor(String Nama_kolektor) {
        this.Nama_kolektor = Nama_kolektor;
    }

    private void setTgl_bayar_angsuran(Date Tgl_bayar_angsuran) {
        this.Tgl_bayar_angsuran = Tgl_bayar_angsuran;
    }

    
    public int getTgl_akhir_tenor() {
        return Tgl_akhir_tenor;
    }

    public int getTgl_jatuh_tempo() {
        return Tgl_jatuh_tempo;
    }

    public int getTenor() {
        return Tenor;
    }

    private void setTenor(int Tenor) {
        this.Tenor = Tenor;
    }

    private void setTgl_akhir_tenor(int Tgl_akhir_tenor) {
        this.Tgl_akhir_tenor = Tgl_akhir_tenor;
    }

    private void setTgl_jatuh_tempo(int Tgl_jatuh_tempo) {
        this.Tgl_jatuh_tempo = Tgl_jatuh_tempo;
    }

    public int getAngsuran() {
        return Angsuran;
    }

    public int getBunga() {
        return Bunga;
    }

    public int getDenda() {
        return Denda;
    }

    public int getPokok_utang() {
        return Pokok_utang;
    }

    public int getTerlambat() {
        return Terlambat;
    }

    private void setAngsuran(int Angsuran) {
        this.Angsuran = Angsuran;
    }

    private void setDenda(int Denda) {
        this.Denda = Denda;
    }

    private void setPokok_utang(int Pokok_utang) {
        this.Pokok_utang = Pokok_utang;
    }

    private void setTerlambat(int Terlambat) {
        this.Terlambat = Terlambat;
    }
    
}
