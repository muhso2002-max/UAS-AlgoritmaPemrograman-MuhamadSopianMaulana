# UAS Algoritma Pemrograman

## Deskripsi
Project berisi 5 soal Java:
1. Nilai Akhir Mahasiswa
2. Kasir Sederhana
3. Nilai Array
4. Menu Mahasiswa
5. Reservasi Hotel

---

# Soal 1 - Nilai Akhir Mahasiswa

## Tujuan
Menghitung nilai akhir mahasiswa dan menentukan grade.

## Import Library
```java
import java.util.Scanner;
```
Scanner digunakan untuk menerima input dari keyboard.

## Input Data
```java
String nama = input.nextLine();
double tugas = input.nextDouble();
double kuis = input.nextDouble();
double uts = input.nextDouble();
double uas = input.nextDouble();
```
Digunakan untuk menyimpan data mahasiswa dan nilai.

## Perhitungan Nilai Akhir
```java
double nilaiAkhir = (tugas * 0.20) +
                    (kuis * 0.15) +
                    (uts * 0.30) +
                    (uas * 0.35);
```
Menghitung nilai akhir berdasarkan bobot.

## Penentuan Grade
Menggunakan if-else untuk menentukan grade A-E.

---

# Soal 2 - Kasir Sederhana

## Tujuan
Menghitung total belanja, diskon, dan total bayar.

## Input Data
```java
String namaBarang = input.nextLine();
double hargaBarang = input.nextDouble();
int jumlahBeli = input.nextInt();
```
Menerima data barang dan jumlah pembelian.

## Total Belanja
```java
double totalBelanja = hargaBarang * jumlahBeli;
```
Menghitung total harga barang.

## Diskon
Diskon 15% jika ≥ 500.000 dan 10% jika ≥ 250.000.

## Total Bayar
```java
double totalBayar = totalBelanja - diskon;
```

---

# Soal 3 - Nilai Array

## Tujuan
Mengolah 10 nilai mahasiswa menggunakan array.

## Array
```java
int[] nilai = new int[10];
```
Menyimpan 10 data nilai.

## Perulangan Input
```java
for (int i = 0; i < 10; i++)
```
Digunakan untuk menginput seluruh nilai.

## Nilai Tertinggi dan Terendah
Menggunakan percabangan if untuk membandingkan setiap elemen array.

## Rata-rata
```java
double rataRata = (double) total / 10;
```

---

# Soal 4 - Menu Mahasiswa

## Tujuan
Membuat menu input, tampil, cari, dan keluar.

## Variabel
```java
String nim = "";
String nama = "";
String prodi = "";
```

## Perulangan Menu
```java
do {
} while (pilihan != 4);
```
Menu terus berjalan sampai memilih keluar.

## Switch Case
```java
switch (pilihan)
```
Menjalankan menu sesuai pilihan pengguna.

---

# Soal 5 - Reservasi Hotel

## Tujuan
Menghitung biaya reservasi hotel.

## Input Data
```java
namaPelanggan = input.nextLine();
tipeKamar = input.nextLine();
lamaMenginap = input.nextInt();
```

## Penentuan Harga Kamar
- Standard = Rp300.000
- Deluxe = Rp500.000
- Suite = Rp800.000

## Total Biaya
```java
totalBiaya = hargaPerMalam * lamaMenginap;
```

## Diskon
- > 5 malam = 20%
- 3–5 malam = 10%
- < 3 malam = 0%

## Total Bayar
```java
totalBayar = totalBiaya - diskon;
```

---

# Kesimpulan

Project ini menerapkan:
- Input Output
- Variabel dan Tipe Data
- Percabangan If-Else
- Perulangan For dan Do-While
- Array
- Switch Case
