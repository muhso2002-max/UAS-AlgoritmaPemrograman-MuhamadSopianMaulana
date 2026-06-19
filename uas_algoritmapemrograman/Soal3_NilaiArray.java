package uas_algoritmapemrograman;

import java.util.Scanner;

public class Soal3_NilaiArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nilai = new int[10];
        int total = 0;

        System.out.println("Masukkan 10 nilai mahasiswa:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Nilai ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < 10; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        double rataRata = (double) total / 10;

        System.out.println("\nNilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);
        System.out.println("Rata-rata       : " + rataRata);

        System.out.println("\nNilai di atas rata-rata:");

        for (int i = 0; i < 10; i++) {
            if (nilai[i] > rataRata) {
                System.out.println(nilai[i]);
            }
        }

        input.close();
    }
}