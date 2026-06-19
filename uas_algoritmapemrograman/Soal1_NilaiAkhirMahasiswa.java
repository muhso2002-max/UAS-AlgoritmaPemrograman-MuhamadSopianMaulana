package uas_algoritmapemrograman;

import java.util.Scanner;
public class Soal1_NilaiAkhirMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nilai Tugas : ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis : ");
        double kuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS : ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS : ");
        double uas = input.nextDouble();

        double nilaiAkhir = (tugas * 0.20) +
                            (kuis * 0.15) +
                            (uts * 0.30) +
                            (uas * 0.35);

        char grade;

        if (nilaiAkhir >= 85) {
            grade = 'A';
        } else if (nilaiAkhir >= 70) {
            grade = 'B';
        } else if (nilaiAkhir >= 55) {
            grade = 'C';
        } else if (nilaiAkhir >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("\n===== HASIL =====");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println("Grade          : " + grade);

        input.close();
    }
}