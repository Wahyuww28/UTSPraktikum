package com.UTS;

public class Pelanggan implements Pengguna {
    private String nama;
    private Pemesanan pemesanan;

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

   
    public void pesanKamar(Kamar kamar) {
        if (kamar.isTersedia()) {
            pemesanan = new Pemesanan(this.nama, kamar);
            kamar.setTersedia(false);
            System.out.println("Kamar " + kamar.getNomorKamar() + " berhasil dipesan!");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    
    public void lihatDetailPesanan() {
        if (pemesanan == null) {
            System.out.println("Tidak ada pemesanan.");
        } else {
            System.out.println(pemesanan.getDetailPesanan());
        }
    }
}

