package com.UTS;

public class Admin {
    private String nama;
    private String idAdmin;

    public Admin(String nama, String idAdmin) {
        this.nama = nama;
        this.idAdmin = idAdmin;
    }

    public boolean login(String namaInput, String idInput) {
        return this.nama.equals(namaInput) && this.idAdmin.equals(idInput);
    }

    public void cekKetersediaanKamar(Kamar kamar) {
        if (kamar.isTersedia()) {
            System.out.println("Kamar " + kamar.getNomorKamar() + " tersedia.");
        } else {
            System.out.println("Kamar " + kamar.getNomorKamar() + " tidak tersedia.");
        }
    }

    public void tambahKamar(Kamar kamarBaru) {
        System.out.println("Kamar berhasil ditambahkan: " + kamarBaru.getDetailKamar());
    }
}

