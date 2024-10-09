package com.UTS;

public class Kamar {
    private int nomorKamar;
    private String tipeKamar;
    private double harga;
    

    public Kamar(int nomorKamar, String tipeKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.harga = harga;
      
    }



    public int getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public double getHarga() {
        return harga;
    }

    public String getDetailKamar() {
        return "Nomor Kamar: " + nomorKamar + ", Tipe: " + tipeKamar + ", Harga: Rp" + harga;
    }
}

