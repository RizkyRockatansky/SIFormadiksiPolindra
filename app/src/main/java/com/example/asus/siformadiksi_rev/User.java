package com.example.asus.siformadiksi_rev;

public class User {
    private  String name;
    private String email;
    private String phone;
    private String kelas;
    private String NIM;

    public User() {
    }

    public User(String name, String email, String phone, String kelas, String NIM) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.kelas = kelas;
        this.NIM = NIM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
}
