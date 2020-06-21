package com.O6926_yogi_ta.project.Object;

/**
 *
 * @author DFA-Agent02
 */
public class Pegawai_06926 {
 private String Nama_pegawai,User_name,Password, Alamat_pegawai, Jenis_kelamin_pegawai, Status_karyawan, NIK, No_telp;
 private int kode_cabang;

    public Pegawai_06926(String nama_pegawai,String nik,String no_telp,String user_name,String password,String alamat_pegawai,String gender,int kode_cabang,String status_karyawan) {
        setAlamat_pegawai(alamat_pegawai);
        setJenis_kelamin_pegawai(gender);
        setNIK(nik);
        setNama_pegawai(nama_pegawai);
        setNo_telp(no_telp);
        setKode_cabang(kode_cabang);
        setPassword(password);
        setStatus_karyawan(status_karyawan);
        setUser_name(user_name);
    }

    public Pegawai_06926(){
        getPassword();
        getUser_name();
    }

    public int getKode_cabang() {
        return kode_cabang;
    }

    private void setKode_cabang(int kode_cabang) {
        this.kode_cabang = kode_cabang;
    }
    
    
    
    public String getAlamat_pegawai() {
        return Alamat_pegawai;
    }

    public String getJenis_kelamin_pegawai() {
        return Jenis_kelamin_pegawai;
    }

    public String getNIK() {
        return NIK;
    }

    public String getNama_pegawai() {
        return Nama_pegawai;
    }

    public String getPassword() {
        return Password;
    }

    public String getNo_telp() {
        return No_telp;
    }

    public String getStatus_karyawan() {
        return Status_karyawan;
    }

    public String getUser_name() {
        return User_name;
    }

    private void setAlamat_pegawai(String Alamat_pegawai) {
        this.Alamat_pegawai = Alamat_pegawai;
    }

    private void setJenis_kelamin_pegawai(String Jenis_kelamin_pegawai) {
        this.Jenis_kelamin_pegawai = Jenis_kelamin_pegawai;
    }

    private void setNIK(String NIK) {
        this.NIK = NIK;
    }

    private void setNama_pegawai(String Nama_pegawai) {
        this.Nama_pegawai = Nama_pegawai;
    }

    private void setNo_telp(String No_telp) {
        this.No_telp = No_telp;
    }

    private void setPassword(String Password) {
        this.Password = Password;
    }

    private void setStatus_karyawan(String Status_karyawan) {
        this.Status_karyawan = Status_karyawan;
    }

    private void setUser_name(String User_name) {
        this.User_name = User_name;
    }
 
 
}
