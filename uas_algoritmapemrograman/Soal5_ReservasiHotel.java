package uas_algoritmapemrograman;

import java.util.Scanner;

public class Soal5_ReservasiHotel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String namaPelanggan;
        String tipeKamar;
        int lamaMenginap;

        double hargaPerMalam = 0;
        double totalBiaya;
        double diskon;
        double totalBayar;

        System.out.print("Nama Pelanggan : ");
        namaPelanggan = input.nextLine();

        System.out.print("Tipe Kamar (Standard/Deluxe/Suite) : ");
        tipeKamar = input.nextLine();

        System.out.print("Lama Menginap (malam) : ");
        lamaMenginap = input.nextInt();

        if (tipeKamar.equalsIgnoreCase("Standard")) {
            hargaPerMalam = 300000;
        } else if (tipeKamar.equalsIgnoreCase("Deluxe")) {
            hargaPerMalam = 500000;
        } else if (tipeKamar.equalsIgnoreCase("Suite")) {
            hargaPerMalam = 800000;
        } else {
            System.out.println("Tipe kamar tidak valid!");
            return;
        }

        totalBiaya = hargaPerMalam * lamaMenginap;

        if (lamaMenginap > 5) {
            diskon = totalBiaya * 0.20;
        } else if (lamaMenginap >= 3) {
            diskon = totalBiaya * 0.10;
        } else {
            diskon = 0;
        }

        totalBayar = totalBiaya - diskon;

        System.out.println("\n===== STRUK RESERVASI =====");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Tipe Kamar     : " + tipeKamar);
        System.out.println("Lama Menginap  : " + lamaMenginap + " malam");
        System.out.printf("Total Biaya    : Rp%,.0f%n", totalBiaya);
        System.out.printf("Diskon         : Rp%,.0f%n", diskon);
        System.out.printf("Total Bayar    : Rp%,.0f%n", totalBayar);

        input.close();
    }
}