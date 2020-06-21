package com.O6926_yogi_ta.project.Object;

/**
 *
 * @author DFA-Agent02
 */
public class Jabatan {
    private String Nama_jabatan,nik;
    private int Job_grade;

    public Jabatan(String Nama_jabatan, int Job_grade,String nik) {
        setJob_grade(Job_grade);
        setNama_jabatan(Nama_jabatan);
        setNik(nik);
    }

    private void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }
    
    public String getNama_jabatan() {
        return Nama_jabatan;
    }

    private void setNama_jabatan(String Nama_jabatan) {
        this.Nama_jabatan = Nama_jabatan;
    }

    public int getJob_grade() {
        return Job_grade;
    }

    private void setJob_grade(int Job_grade) {
        this.Job_grade = Job_grade;
    }
    
    
    
}
