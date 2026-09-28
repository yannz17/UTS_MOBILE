package com.RIAN_HIDAYAT_F52124081aplikasi.utsmobile;

import java.io.Serializable;

// implements Serializable agar objek bisa dikirim antar Activity
public class AlatCamping implements Serializable {
    private String nama;
    private String harga;
    private String deskripsi;
    private int fotoResId;

    public AlatCamping(String nama, String harga, String deskripsi, int fotoResId) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.fotoResId = fotoResId;
    }

    public String getNama() { return nama; }
    public String getHarga() { return harga; }
    public String getDeskripsi() { return deskripsi; }
    public int getFotoResId() { return fotoResId; }
}
