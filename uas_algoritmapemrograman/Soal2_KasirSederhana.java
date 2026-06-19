package uas_algoritmapemrograman;

import java.util.Scanner;

public class Soal2_KasirSederhana {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama Barang : ");
        String namaBarang = input.nextLine();

        System.out.print("Harga Barang : ");
        double hargaBarang = input.nextDouble();

        System.out.print("Jumlah Beli : ");
        int jumlahBeli = input.nextInt();

        double totalBelanja = hargaBarang * jumlahBeli;

        double diskon;

        if (totalBelanja >= 500000) {
            diskon = totalBelanja * 0.15;
        } else if (totalBelanja >= 250000) {
            diskon = totalBelanja * 0.10;
        } else {
            diskon = 0;
        }

        double totalBayar = totalBelanja - diskon;

        System.out.println("\n===== STRUK PEMBELIAN =====");
      System.out.printf("Total Belanja : Rp%,.0f%n", totalBelanja);
System.out.printf("Diskon        : Rp%,.0f%n", diskon);
System.out.printf("Total Bayar   : Rp%,.0f%n", totalBayar);
        input.close();
    }
}