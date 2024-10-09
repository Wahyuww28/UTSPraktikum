package com.UTS;
import java.util.Scanner;

public class SistemReservasiHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        Admin admin = new Admin("Budi", "admin123");

        
        System.out.print("Masukkan nama admin: ");
        String namaInput = input.nextLine();

        System.out.print("Masukkan ID admin: ");
        String idInput = input.nextLine();

        if (admin.login(namaInput, idInput)) {
            System.out.println("Login berhasil. Sistem dimulai...");

           
            Kamar kamar1 = new Kamar(101, "Single", 100000.0);
            Kamar kamar2 = new Kamar(102, "Double", 150000.0);
            Kamar kamar3 = new Kamar(103, "Suite", 200000.0);

            System.out.println("\n--- Menu Utama ---");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Cek Ketersediaan Kamar");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                   
                    System.out.print("Masukkan nama pelanggan: ");
                    String namaPelanggan = input.nextLine();
                    Pelanggan pelanggan = new Pelanggan(namaPelanggan);

                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    int nomorKamar = input.nextInt();
                    input.nextLine(); 

                    if (nomorKamar == kamar1.getNomorKamar()) {
                        pelanggan.pesanKamar(kamar1);
                    } else if (nomorKamar == kamar2.getNomorKamar()) {
                        pelanggan.pesanKamar(kamar2);
                    } else if (nomorKamar == kamar3.getNomorKamar()) {
                        pelanggan.pesanKamar(kamar3);
                    } else {
                        System.out.println("Nomor kamar tidak valid.");
                    }

                    pelanggan.lihatDetailPesanan();
                    break;

                case 2:
                   
                    System.out.print("Masukkan nomor kamar yang ingin dicek: ");
                    nomorKamar = input.nextInt();
                    input.nextLine(); 

                    if (nomorKamar == kamar1.getNomorKamar()) {
                        admin.cekKetersediaanKamar(kamar1);
                    } else if (nomorKamar == kamar2.getNomorKamar()) {
                        admin.cekKetersediaanKamar(kamar2);
                    } else if (nomorKamar == kamar3.getNomorKamar()) {
                        admin.cekKetersediaanKamar(kamar3);
                    } else {
                        System.out.println("Nomor kamar tidak valid.");
                    }
                    break;

                case 3:
                    
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        } else {
            System.out.println("Login gagal. Sistem tidak dapat dijalankan.");
        }

        input.close();
    }
}
