package com.RIAN_HIDAYAT_F52124081aplikasi.utsmobile;

import java.io.Serializable;

public class PlayerEsport implements Serializable {
    private String nama;
    private String role;
    private String deskripsi;
    private int fotoResId;

    public PlayerEsport(String nama, String role, String deskripsi, int fotoResId) {
        this.nama = nama;
        this.role = role;
        this.deskripsi = deskripsi;
        this.fotoResId = fotoResId;
    }

    public String getNama() { return nama; }
    public String getRole() { return role; }
    public String getDeskripsi() { return deskripsi; }
    public int getFotoResId() { return fotoResId; }
}
