package com.UTS;

public class Pemesanan {
    private Kamar kamar;
    private String namaPelanggan;

    public Pemesanan(String namaPelanggan, Kamar kamar) {
        this.namaPelanggan = namaPelanggan;
        this.kamar = kamar;
    }

    public String getDetailPesanan() {
        return "Pelanggan: " + namaPelanggan + ", " + kamar.getDetailKamar();
    }
}
