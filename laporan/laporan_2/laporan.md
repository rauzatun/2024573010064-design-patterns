#  Laporan Lab 01: Review Dasar Pemrograman Java

**Mata Kuliah:** Praktikum Design Pattern
**Nama:** Rauzatun Jannah
**NIM:** 2024573010064
**Kelas:** TI / 2A

---

# 1. Abstrak

Pada praktikum ini dilakukan pembelajaran mengenai dasar-dasar pemrograman berorientasi objek (Object-Oriented Programming/OOP) menggunakan Java. Materi yang dipelajari meliputi konsep Class dan Object, Encapsulation, Inheritance, Composition, Polymorphism, serta Abstraction. Praktikum ini bertujuan agar mahasiswa mampu memahami konsep OOP dan mengimplementasikannya dalam program sederhana. Dengan adanya praktikum ini, diharapkan mahasiswa dapat membangun program yang lebih terstruktur, modular, dan mudah dikembangkan.

---

# 2. Praktikum

##  Praktikum 1 – Class & Object

### Dasar Teori

Class merupakan blueprint atau cetakan untuk membuat object. Sedangkan object adalah instance dari class yang memiliki atribut dan method.

### Langkah Praktikum

* Membuat package `bagian_1`
* Membuat class Mahasiswa
* Membuat class Main untuk menjalankan program
* Membuat latihan class Buku
* Menampilkan data object

### Screenshoot Hasil

(Tambahkan screenshot output program di sini)

### Analisa dan Pembahasan

Pada praktikum ini, class digunakan sebagai template untuk membuat object. Object dari class Buku berhasil dibuat dan dapat menampilkan atribut seperti judul, penulis, dan tahun terbit. Hal ini menunjukkan bahwa konsep dasar OOP sudah berjalan dengan baik.

---

##  Praktikum 2 – Encapsulation

### Dasar Teori

Encapsulation adalah teknik menyembunyikan data dengan menggunakan access modifier seperti private, serta menyediakan akses melalui method getter dan setter.

### Langkah Praktikum

* Membuat package `bagian_2`
* Membuat class Mahasiswa dengan atribut private
* Membuat getter dan setter
* Membuat latihan class Motor

### Screenshoot Hasil

(Tambahkan screenshot hasil output program di sini)

### Analisa dan Pembahasan

Encapsulation meningkatkan keamanan data karena atribut tidak dapat diakses langsung dari luar class. Penggunaan getter dan setter memberikan kontrol terhadap data yang dimasukkan.

---

##  Praktikum 3 – Inheritance & Composition

### Dasar Teori

Inheritance adalah pewarisan sifat dari class induk ke class anak (is-a). Sedangkan composition adalah hubungan kepemilikan antar class (has-a).

### Langkah Praktikum

* Membuat package `bagian_3`
* Membuat class Kendaraan dan Mobil (inheritance)
* Membuat class Mesin dan Mobil (composition)
* Membuat latihan Laptop dengan Processor dan RAM

### Screenshoot Hasil

(Tambahkan screenshot hasil output di sini)

### Analisa dan Pembahasan

Inheritance mempermudah penggunaan kembali kode, sedangkan composition memberikan fleksibilitas dalam membangun object kompleks. Pada latihan, Laptop berhasil menggunakan Processor dan RAM sebagai komponennya.

---

##  Praktikum 4 – Polymorphism

### Dasar Teori

Polymorphism adalah kemampuan object untuk memiliki banyak bentuk, yang dapat dilakukan dengan method overriding dan overloading.

### Langkah Praktikum

* Membuat package `bagian_4`
* Implementasi overriding (Hewan, Kucing, Anjing)
* Implementasi overloading (Kalkulator)
* Latihan BangunDatar dan Matematika

### Screenshoot Hasil

(Tambahkan screenshot hasil program di sini)

### Analisa dan Pembahasan

Overriding memungkinkan perubahan perilaku method pada subclass, sedangkan overloading memberikan fleksibilitas dalam penggunaan method. Kedua konsep ini membuat program lebih dinamis.

---

##  Praktikum 5 – Abstraction

### Dasar Teori

Abstraction adalah proses menyembunyikan detail implementasi dan hanya menampilkan fungsi penting. Dapat menggunakan abstract class dan interface.

### Langkah Praktikum

* Membuat package `bagian_5`
* Membuat abstract class Hewan
* Membuat interface Bergerak
* Membuat class turunan dan implementasi
* Latihan HewanAir dan Ikan

### Screenshoot Hasil

(Tambahkan screenshot hasil program di sini)

### Analisa dan Pembahasan

Abstraction membantu menyederhanakan kompleksitas program. Dengan abstract class dan interface, program menjadi lebih terstruktur dan mudah dikembangkan.

---

##  Praktikum 6 – Aplikasi Tiket

### Dasar Teori

Aplikasi ini menggabungkan semua konsep OOP seperti encapsulation, inheritance, polymorphism, dan abstraction dalam satu program.

### Langkah Praktikum

* Membuat package `bagian_6`
* Membuat class Tiket (abstract)
* Membuat subclass TiketReguler dan TiketVIP
* Membuat class Pesanan
* Membuat aplikasi utama KonferensiApp

### Screenshoot Hasil

(Tambahkan screenshot hasil output program di sini)

### Analisa dan Pembahasan

Aplikasi ini menunjukkan implementasi nyata OOP dalam program. Setiap konsep digunakan untuk membangun sistem yang modular dan fleksibel.

---

# 3. Kesimpulan

Dari praktikum ini dapat disimpulkan bahwa:

* OOP sangat penting dalam pengembangan software
* Class dan Object adalah dasar dari OOP
* Encapsulation melindungi data
* Inheritance dan Composition meningkatkan reuse code
* Polymorphism membuat program fleksibel
* Abstraction menyederhanakan kompleksitas

Dengan memahami konsep ini, mahasiswa dapat membuat program yang lebih baik dan terstruktur.

---

# 5. Referensi

* Modul Praktikum Design Pattern – Politeknik Negeri Lhokseumawe
* Dokumentasi Java Oracle
* Buku Pemrograman Berorientasi Objek (OOP)
