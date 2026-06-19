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

Program digunakan untuk menghitung nilai akhir mahasiswa berdasarkan nilai Tugas, Kuis, UTS, dan UAS. Setelah nilai akhir diperoleh, program akan menentukan grade mahasiswa berdasarkan rentang nilai yang telah ditentukan.

---

## Import Library

```java
import java.util.Scanner;
```

### Penjelasan

Library `Scanner` digunakan untuk menerima input dari keyboard sehingga pengguna dapat memasukkan data yang dibutuhkan oleh program.

---

## Input Data

```java
String nama = input.nextLine();
double tugas = input.nextDouble();
double kuis = input.nextDouble();
double uts = input.nextDouble();
double uas = input.nextDouble();
```

### Penjelasan

Bagian ini digunakan untuk menerima dan menyimpan data yang dimasukkan pengguna.

Variabel yang digunakan:

| Variabel | Tipe Data | Fungsi |
|-----------|-----------|---------|
| nama | String | Menyimpan nama mahasiswa |
| tugas | double | Menyimpan nilai tugas |
| kuis | double | Menyimpan nilai kuis |
| uts | double | Menyimpan nilai UTS |
| uas | double | Menyimpan nilai UAS |

---

## Perhitungan Nilai Akhir

```java
double nilaiAkhir = (tugas * 0.20) +
                    (kuis * 0.15) +
                    (uts * 0.30) +
                    (uas * 0.35);
```

### Penjelasan

Nilai akhir dihitung menggunakan bobot penilaian sebagai berikut:

| Komponen | Bobot |
|-----------|--------|
| Tugas | 20% |
| Kuis | 15% |
| UTS | 30% |
| UAS | 35% |

Rumus perhitungan:

```text
Nilai Akhir =
(Tugas × 20%)
+ (Kuis × 15%)
+ (UTS × 30%)
+ (UAS × 35%)
```

---

## Penentuan Grade

```java
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
```

### Penjelasan

Program menggunakan percabangan `if-else` untuk menentukan grade berdasarkan nilai akhir yang diperoleh mahasiswa.

| Nilai Akhir | Grade |
|------------|--------|
| ≥ 85 | A |
| 70 – 84 | B |
| 55 – 69 | C |
| 40 – 54 | D |
| < 40 | E |

---

## Menampilkan Hasil

```java
System.out.println("Nama Mahasiswa : " + nama);
System.out.println("Nilai Akhir    : " + nilaiAkhir);
System.out.println("Grade          : " + grade);
```

### Penjelasan

Bagian ini digunakan untuk menampilkan hasil pengolahan data berupa:

- Nama Mahasiswa
- Nilai Akhir
- Grade

---

## Kesimpulan

Program berhasil menghitung nilai akhir mahasiswa menggunakan operasi aritmatika dan menentukan grade menggunakan percabangan `if-else`. Program ini menerapkan konsep dasar Java seperti input-output, variabel, tipe data, operator matematika, dan percabangan.
# Soal 2 - Kasir Sederhana

## Tujuan

Program digunakan untuk menghitung total belanja, diskon yang diperoleh pelanggan, serta total pembayaran yang harus dibayarkan setelah mendapatkan potongan harga.

---

## Input Data

```java
String namaBarang = input.nextLine();
double hargaBarang = input.nextDouble();
int jumlahBeli = input.nextInt();
```

### Penjelasan

Bagian ini digunakan untuk menerima data barang yang dibeli oleh pelanggan.

Variabel yang digunakan:

| Variabel | Tipe Data | Fungsi |
|-----------|-----------|---------|
| namaBarang | String | Menyimpan nama barang |
| hargaBarang | double | Menyimpan harga barang |
| jumlahBeli | int | Menyimpan jumlah barang yang dibeli |

---

## Menghitung Total Belanja

```java
double totalBelanja = hargaBarang * jumlahBeli;
```

### Penjelasan

Total belanja dihitung dengan mengalikan harga barang dengan jumlah barang yang dibeli.

Rumus:

```text
Total Belanja = Harga Barang × Jumlah Beli
```

Contoh:

```text
Harga Barang = Rp50.000
Jumlah Beli = 10
```

Maka:

```text
Total Belanja = Rp500.000
```

---

## Menentukan Diskon

```java
if (totalBelanja >= 500000) {
    diskon = totalBelanja * 0.15;
} else if (totalBelanja >= 250000) {
    diskon = totalBelanja * 0.10;
} else {
    diskon = 0;
}
```

### Penjelasan

Program menggunakan percabangan `if-else` untuk menentukan besarnya diskon berdasarkan total belanja.

Ketentuan diskon:

| Total Belanja | Diskon |
|--------------|---------|
| ≥ Rp500.000 | 15% |
| ≥ Rp250.000 | 10% |
| < Rp250.000 | 0% |

Contoh:

```text
Total Belanja = Rp600.000
```

Maka:

```text
Diskon = 15% × Rp600.000
       = Rp90.000
```

---

## Menghitung Total Bayar

```java
double totalBayar = totalBelanja - diskon;
```

### Penjelasan

Total pembayaran diperoleh dari total belanja yang telah dikurangi diskon.

Rumus:

```text
Total Bayar = Total Belanja - Diskon
```

Contoh:

```text
Total Belanja = Rp600.000
Diskon = Rp90.000
```

Maka:

```text
Total Bayar = Rp510.000
```

---

## Menampilkan Hasil

```java
System.out.printf("Total Belanja : Rp%,.0f%n", totalBelanja);
System.out.printf("Diskon        : Rp%,.0f%n", diskon);
System.out.printf("Total Bayar   : Rp%,.0f%n", totalBayar);
```

### Penjelasan

Bagian ini digunakan untuk menampilkan:

- Total Belanja
- Diskon
- Total Bayar

Fungsi `printf()` digunakan agar angka ditampilkan dengan format yang lebih rapi dan mudah dibaca.

Contoh output:

```text
Total Belanja : Rp600,000
Diskon        : Rp90,000
Total Bayar   : Rp510,000
```

---

## Kesimpulan

Program kasir sederhana berhasil menghitung total belanja, menentukan diskon berdasarkan ketentuan yang berlaku, serta menghitung total pembayaran akhir. Program ini menerapkan konsep input-output, variabel, operasi aritmatika, dan percabangan `if-else`.

# Soal 3 - Nilai Array

## Tujuan

Program digunakan untuk mengolah 10 nilai mahasiswa menggunakan array. Program dapat menentukan nilai tertinggi, nilai terendah, menghitung rata-rata, serta menampilkan nilai yang berada di atas rata-rata.

---

## Membuat Array

```java
int[] nilai = new int[10];
```

### Penjelasan

Array digunakan untuk menyimpan 10 nilai mahasiswa dalam satu variabel.

Pada program ini, array `nilai` memiliki kapasitas sebanyak 10 elemen dengan indeks 0 sampai 9.

Contoh:

```text
nilai[0]
nilai[1]
nilai[2]
...
nilai[9]
```

---

## Variabel Total

```java
int total = 0;
```

### Penjelasan

Variabel `total` digunakan untuk menyimpan jumlah seluruh nilai yang dimasukkan oleh pengguna.

Nilai ini nantinya digunakan untuk menghitung rata-rata.

---

## Input Nilai Menggunakan Perulangan

```java
for (int i = 0; i < 10; i++) {
    System.out.print("Nilai ke-" + (i + 1) + " : ");
    nilai[i] = input.nextInt();
    total += nilai[i];
}
```

### Penjelasan

Perulangan `for` digunakan untuk menginput 10 nilai mahasiswa secara berulang.

Fungsi setiap bagian:

```java
int i = 0
```

Memulai perulangan dari indeks pertama.

```java
i < 10
```

Perulangan akan berjalan selama indeks masih kurang dari 10.

```java
i++
```

Menambah nilai indeks setiap perulangan.

---

### Menyimpan Nilai ke Array

```java
nilai[i] = input.nextInt();
```

Digunakan untuk menyimpan nilai yang dimasukkan pengguna ke dalam array.

Contoh:

```text
Input pertama → nilai[0]
Input kedua   → nilai[1]
Input ketiga  → nilai[2]
```

---

### Menjumlahkan Nilai

```java
total += nilai[i];
```

Sama dengan:

```java
total = total + nilai[i];
```

Digunakan untuk menghitung total seluruh nilai mahasiswa.

---

## Menentukan Nilai Tertinggi dan Terendah

```java
int tertinggi = nilai[0];
int terendah = nilai[0];
```

### Penjelasan

Nilai pertama pada array dijadikan nilai awal untuk dibandingkan dengan nilai lainnya.

---

## Mencari Nilai Tertinggi

```java
if (nilai[i] > tertinggi) {
    tertinggi = nilai[i];
}
```

### Penjelasan

Program membandingkan setiap nilai dengan nilai tertinggi yang tersimpan.

Jika ditemukan nilai yang lebih besar, maka variabel `tertinggi` diperbarui.

Contoh:

```text
Data:
70 80 90 75

Awal:
tertinggi = 70

80 > 70 → tertinggi = 80
90 > 80 → tertinggi = 90
75 > 90 → salah
```

Hasil:

```text
Nilai Tertinggi = 90
```

---

## Mencari Nilai Terendah

```java
if (nilai[i] < terendah) {
    terendah = nilai[i];
}
```

### Penjelasan

Program membandingkan setiap nilai dengan nilai terendah yang tersimpan.

Jika ditemukan nilai yang lebih kecil, maka variabel `terendah` diperbarui.

Contoh:

```text
Data:
70 80 90 60

Awal:
terendah = 70

80 < 70 → salah
90 < 70 → salah
60 < 70 → benar
```

Hasil:

```text
Nilai Terendah = 60
```

---

## Menghitung Rata-rata

```java
double rataRata = (double) total / 10;
```

### Penjelasan

Rata-rata dihitung dengan membagi total nilai dengan jumlah data.

Rumus:

```text
Rata-rata = Total Nilai / Jumlah Data
```

Contoh:

```text
Total Nilai = 800
Jumlah Data = 10
```

Maka:

```text
Rata-rata = 800 / 10
          = 80
```

---

## Menampilkan Hasil

```java
System.out.println("Nilai Tertinggi : " + tertinggi);
System.out.println("Nilai Terendah  : " + terendah);
System.out.println("Rata-rata       : " + rataRata);
```

### Penjelasan

Bagian ini digunakan untuk menampilkan:

- Nilai Tertinggi
- Nilai Terendah
- Nilai Rata-rata

---

## Menampilkan Nilai di Atas Rata-rata

```java
for (int i = 0; i < 10; i++) {
    if (nilai[i] > rataRata) {
        System.out.println(nilai[i]);
    }
}
```

### Penjelasan

Program melakukan pengecekan terhadap setiap nilai dalam array.

Jika nilai lebih besar dari rata-rata, maka nilai tersebut akan ditampilkan.

Contoh:

```text
Rata-rata = 80

Data:
70 85 90 75 88
```

Output:

```text
85
90
88
```

Karena nilai tersebut berada di atas rata-rata.

---

## Kesimpulan

Program berhasil mengolah data nilai mahasiswa menggunakan array dan perulangan. Program dapat mencari nilai tertinggi, nilai terendah, menghitung rata-rata, serta menampilkan nilai yang berada di atas rata-rata. Konsep yang digunakan meliputi array, perulangan `for`, percabangan `if`, dan operasi aritmatika.


---
# Soal 4 - Menu Mahasiswa

## Tujuan

Program digunakan untuk mengelola data mahasiswa melalui menu interaktif. Pengguna dapat memasukkan data mahasiswa, menampilkan data yang telah disimpan, mencari data berdasarkan NIM, dan keluar dari program.

---

## Deklarasi Variabel

```java
String nim = "";
String nama = "";
String prodi = "";
```

### Penjelasan

Variabel digunakan untuk menyimpan data mahasiswa yang diinput oleh pengguna.

| Variabel | Tipe Data | Fungsi |
|-----------|-----------|---------|
| nim | String | Menyimpan Nomor Induk Mahasiswa |
| nama | String | Menyimpan nama mahasiswa |
| prodi | String | Menyimpan program studi mahasiswa |

Nilai awal diberikan string kosong (`""`) agar variabel sudah memiliki nilai sebelum digunakan.

---

## Variabel Pilihan Menu

```java
int pilihan;
```

### Penjelasan

Variabel `pilihan` digunakan untuk menyimpan menu yang dipilih oleh pengguna.

Contoh:

```text
1 = Input Data
2 = Tampilkan Data
3 = Cari Data
4 = Keluar
```

---

## Perulangan Menu

```java
do {
    
} while (pilihan != 4);
```

### Penjelasan

Perulangan `do-while` digunakan agar menu selalu ditampilkan minimal satu kali.

Program akan terus berjalan selama pengguna tidak memilih menu 4 (Keluar).

Alur kerja:

```text
Tampilkan Menu
↓
Pilih Menu
↓
Jalankan Menu
↓
Kembali ke Menu
↓
Berhenti jika memilih 4
```

---

## Menampilkan Menu

```java
System.out.println("\n===== MENU =====");
System.out.println("1. Input Data Mahasiswa");
System.out.println("2. Tampilkan Data Mahasiswa");
System.out.println("3. Cari Data Mahasiswa Berdasarkan NIM");
System.out.println("4. Keluar");
```

### Penjelasan

Bagian ini digunakan untuk menampilkan daftar menu yang dapat dipilih oleh pengguna.

---

## Input Pilihan Menu

```java
pilihan = input.nextInt();
input.nextLine();
```

### Penjelasan

Digunakan untuk membaca pilihan menu yang dimasukkan pengguna.

Baris:

```java
input.nextLine();
```

digunakan untuk membersihkan karakter Enter yang tersisa setelah penggunaan `nextInt()`.

---

## Switch Case

```java
switch (pilihan)
```

### Penjelasan

Struktur `switch-case` digunakan untuk menjalankan perintah berdasarkan pilihan menu yang dipilih pengguna.

Setiap menu memiliki fungsi yang berbeda.

---

## Menu 1 - Input Data Mahasiswa

```java
case 1:
```

### Kode

```java
System.out.print("Masukkan NIM : ");
nim = input.nextLine();

System.out.print("Masukkan Nama Mahasiswa : ");
nama = input.nextLine();

System.out.print("Masukkan Program Studi : ");
prodi = input.nextLine();
```

### Penjelasan

Menu ini digunakan untuk memasukkan data mahasiswa.

Data yang disimpan:

- NIM
- Nama Mahasiswa
- Program Studi

Setelah data berhasil disimpan, program menampilkan pesan:

```java
System.out.println("Data berhasil disimpan!");
```

---

## Menu 2 - Tampilkan Data Mahasiswa

```java
case 2:
```

### Kode

```java
System.out.println("NIM            : " + nim);
System.out.println("Nama Mahasiswa : " + nama);
System.out.println("Program Studi  : " + prodi);
```

### Penjelasan

Menu ini digunakan untuk menampilkan data mahasiswa yang telah disimpan sebelumnya.

Output yang ditampilkan:

- NIM
- Nama Mahasiswa
- Program Studi

---

## Menu 3 - Cari Data Berdasarkan NIM

```java
case 3:
```

### Kode

```java
String cariNim = input.nextLine();
```

### Penjelasan

Digunakan untuk menerima NIM yang ingin dicari oleh pengguna.

---

### Membandingkan NIM

```java
if (cariNim.equals(nim))
```

### Penjelasan

Method `equals()` digunakan untuk membandingkan isi dua string.

Jika NIM yang dicari sama dengan NIM yang tersimpan, maka data mahasiswa akan ditampilkan.

Contoh:

```text
NIM Tersimpan : 231011
NIM Dicari    : 231011
```

Hasil:

```text
Data Ditemukan
```

Jika berbeda:

```text
Data tidak ditemukan!
```

---

## Menu 4 - Keluar

```java
case 4:
```

### Kode

```java
System.out.println("Program selesai.");
```

### Penjelasan

Menu ini digunakan untuk mengakhiri program.

Ketika pengguna memilih menu 4, kondisi:

```java
while (pilihan != 4)
```

akan bernilai salah sehingga perulangan berhenti.

---

## Default

```java
default:
```

### Kode

```java
System.out.println("Pilihan tidak valid!");
```

### Penjelasan

Digunakan untuk menangani input menu yang tidak tersedia.

Contoh:

```text
Pilih Menu: 7
```

Output:

```text
Pilihan tidak valid!
```

---

## Menutup Scanner

```java
input.close();
```

### Penjelasan

Digunakan untuk menutup objek Scanner setelah program selesai dijalankan.

Hal ini membantu menghemat penggunaan resource sistem.

---

## Kesimpulan

Program Menu Mahasiswa berhasil menerapkan konsep perulangan `do-while`, percabangan `switch-case`, penggunaan variabel, input-output, dan pencarian data sederhana berdasarkan NIM. Program memungkinkan pengguna untuk mengelola data mahasiswa melalui menu interaktif yang mudah digunakan.

# Soal 5 - Reservasi Hotel

## Tujuan

Program digunakan untuk menghitung biaya reservasi hotel berdasarkan tipe kamar yang dipilih dan lama menginap pelanggan. Program juga dapat menghitung diskon yang diperoleh serta total pembayaran yang harus dibayarkan.

---

## Input Data

```java
namaPelanggan = input.nextLine();
tipeKamar = input.nextLine();
lamaMenginap = input.nextInt();
```

### Penjelasan

Bagian ini digunakan untuk menerima data reservasi dari pelanggan.

Data yang dimasukkan meliputi:

| Variabel | Tipe Data | Fungsi |
|-----------|-----------|---------|
| namaPelanggan | String | Menyimpan nama pelanggan |
| tipeKamar | String | Menyimpan jenis kamar yang dipilih |
| lamaMenginap | int | Menyimpan jumlah malam menginap |

---

## Menentukan Harga Kamar

```java
if (tipeKamar.equalsIgnoreCase("Standard")) {
    hargaPerMalam = 300000;
} else if (tipeKamar.equalsIgnoreCase("Deluxe")) {
    hargaPerMalam = 500000;
} else if (tipeKamar.equalsIgnoreCase("Suite")) {
    hargaPerMalam = 800000;
}
```

### Penjelasan

Program menggunakan percabangan `if-else` untuk menentukan harga kamar berdasarkan tipe kamar yang dipilih.

Method:

```java
equalsIgnoreCase()
```

digunakan agar program tetap mengenali input meskipun pengguna menggunakan huruf besar atau kecil.

Contoh:

```text
Standard
STANDARD
standard
```

Semuanya akan dianggap sama.

---

### Daftar Harga Kamar

| Tipe Kamar | Harga per Malam |
|------------|----------------|
| Standard | Rp300.000 |
| Deluxe | Rp500.000 |
| Suite | Rp800.000 |

---

## Validasi Tipe Kamar

```java
else {
    System.out.println("Tipe kamar tidak valid!");
    return;
}
```

### Penjelasan

Jika pengguna memasukkan tipe kamar selain Standard, Deluxe, atau Suite, program akan menampilkan pesan kesalahan dan langsung menghentikan proses menggunakan perintah:

```java
return;
```

---

## Menghitung Total Biaya

```java
totalBiaya = hargaPerMalam * lamaMenginap;
```

### Penjelasan

Total biaya dihitung berdasarkan harga kamar per malam dikalikan lama menginap.

Rumus:

```text
Total Biaya = Harga per Malam × Lama Menginap
```

Contoh:

```text
Tipe Kamar = Deluxe
Harga = Rp500.000
Lama Menginap = 4 malam
```

Maka:

```text
Total Biaya = Rp500.000 × 4
            = Rp2.000.000
```

---

## Menentukan Diskon

```java
if (lamaMenginap > 5) {
    diskon = totalBiaya * 0.20;
} else if (lamaMenginap >= 3) {
    diskon = totalBiaya * 0.10;
} else {
    diskon = 0;
}
```

### Penjelasan

Program memberikan diskon berdasarkan lama menginap pelanggan.

### Ketentuan Diskon

| Lama Menginap | Diskon |
|--------------|---------|
| > 5 malam | 20% |
| 3 – 5 malam | 10% |
| < 3 malam | 0% |

Contoh:

```text
Total Biaya = Rp2.000.000
Lama Menginap = 4 malam
```

Maka:

```text
Diskon = 10% × Rp2.000.000
       = Rp200.000
```

---

## Menghitung Total Bayar

```java
totalBayar = totalBiaya - diskon;
```

### Penjelasan

Total pembayaran diperoleh dari total biaya yang telah dikurangi diskon.

Rumus:

```text
Total Bayar = Total Biaya - Diskon
```

Contoh:

```text
Total Biaya = Rp2.000.000
Diskon = Rp200.000
```

Maka:

```text
Total Bayar = Rp1.800.000
```

---

## Menampilkan Struk Reservasi

```java
System.out.println("Nama Pelanggan : " + namaPelanggan);
System.out.println("Tipe Kamar     : " + tipeKamar);
System.out.println("Lama Menginap  : " + lamaMenginap + " malam");

System.out.printf("Total Biaya    : Rp%,.0f%n", totalBiaya);
System.out.printf("Diskon         : Rp%,.0f%n", diskon);
System.out.printf("Total Bayar    : Rp%,.0f%n", totalBayar);
```

### Penjelasan

Bagian ini digunakan untuk menampilkan hasil reservasi hotel, meliputi:

- Nama Pelanggan
- Tipe Kamar
- Lama Menginap
- Total Biaya
- Diskon
- Total Bayar

Fungsi `printf()` digunakan agar angka ditampilkan lebih rapi dengan format rupiah.

Contoh output:

```text
===== STRUK RESERVASI =====
Nama Pelanggan : Sopian
Tipe Kamar     : Deluxe
Lama Menginap  : 4 malam
Total Biaya    : Rp2,000,000
Diskon         : Rp200,000
Total Bayar    : Rp1,800,000
```

---

## Menutup Scanner

```java
input.close();
```

### Penjelasan

Digunakan untuk menutup objek Scanner setelah program selesai dijalankan sehingga penggunaan resource menjadi lebih efisien.

---

# Kesimpulan

Project UAS Algoritma Pemrograman ini berhasil menerapkan berbagai konsep dasar pemrograman Java, antara lain:

- Input dan Output
- Variabel dan Tipe Data
- Operator Aritmatika
- Percabangan (If-Else)
- Perulangan (For dan Do-While)
- Array
- Switch Case
- Pencarian Data Sederhana
- Pengolahan Data dan Perhitungan Otomatis

Melalui lima soal yang dikerjakan, program mampu menyelesaikan berbagai permasalahan seperti pengolahan nilai mahasiswa, sistem kasir sederhana, pengelolaan array, menu data mahasiswa, dan reservasi hotel menggunakan bahasa pemrograman Java.