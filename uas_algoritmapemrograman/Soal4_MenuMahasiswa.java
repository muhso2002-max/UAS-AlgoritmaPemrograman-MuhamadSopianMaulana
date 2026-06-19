package uas_algoritmapemrograman;

import java.util.Scanner;

public class Soal4_MenuMahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nim = "";
        String nama = "";
        String prodi = "";

        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Cari Data Mahasiswa Berdasarkan NIM");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan NIM : ");
                    nim = input.nextLine();

                    System.out.print("Masukkan Nama Mahasiswa : ");
                    nama = input.nextLine();

                    System.out.print("Masukkan Program Studi : ");
                    prodi = input.nextLine();

                    System.out.println("Data berhasil disimpan!");
                    break;

                case 2:
                    System.out.println("\n===== DATA MAHASISWA =====");
                    System.out.println("NIM            : " + nim);
                    System.out.println("Nama Mahasiswa : " + nama);
                    System.out.println("Program Studi  : " + prodi);
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String cariNim = input.nextLine();

                    if (cariNim.equals(nim)) {
                        System.out.println("\nData Ditemukan");
                        System.out.println("NIM            : " + nim);
                        System.out.println("Nama Mahasiswa : " + nama);
                        System.out.println("Program Studi  : " + prodi);
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close();
    }
}