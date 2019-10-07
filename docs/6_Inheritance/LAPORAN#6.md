# Laporan Praktikum #6 - Inheritance

## Kompetensi

1. Memahami konsep dasar inheritance atau pewarisan.
2. Mampu membuat suatusublcass dari suatu superclass tertentu.
3. Mampu mengimplmentasikan konsep dan melakukan pengaksesan.
4. Mampu membuat ojek dari suatu subclass dan melakukan. pengaksesan terhadap atribut dan method baik yang dimiliki sendiri atau turunan dari superclassnya.

## Ringkasan Materi

Inheritance atau pewarisan adalah proses penciptaan kelas baru (subclass) dengan cara mewarisi karakteristik dari kelas yang telah ada (superclass) dengan tetap memiliki karakteristik khas dari kelas baru tersebut. Pada bahasa pemrograman java kata kunci yang digunakan untuk inheritance adalah extends dan super. Inheritance memiliki 3 bentuk pewarisan, yaitu single inheritance, multilevel inheritance, dan multiple inheritance.

Single Inheritance: satu subclass hanya mempunyai satu parent class.

Multilevel Inheritance: satu subclass bisa mempunyai beberapa parent class.

## Percobaan

### Percobaan 1

![contoh screenshot](img/percobaan_1_salah.png)

Link kode program ClassA: [Link ke kode program](../../src/6_Inheritance/percobaan/ClassA1841720175Fajar.java)

Link kode program ClassB: [Link ke kode program](../../src/6_Inheritance/percobaan/ClassB1841720175Fajar.java)

Link kode program Percobaan1: [Link ke kode program](../../src/6_Inheritance/percobaan/Percobaan11841720175Fajar.java)

### Percobaan 2 

![contoh screenshot](img/percobaan_2_salah.png)

Link kode program ClassA: [Link ke kode program](../../src/6_Inheritance/percobaan_2/ClassA1841720175Fajar.java)

Link kode program ClassB: [Link ke kode program](../../src/6_Inheritance/percobaan_2/ClassB1841720175Fajar.java)

Link kode program Percobaan2: [Link ke kode program](../../src/6_Inheritance/percobaan_2/Percobaan21841720175Fajar.java)

### Percobaan 3

![contoh screenshot](img/percobaan_3.png)

Link kode program Bangun: [Link ke kode program](../../src/6_Inheritance/percobaan_3/Bangun1841720175Fajar.java)

Link kode program Tabung: [Link ke kode program](../../src/6_Inheritance/percobaan_3/Tabung1841720175Fajar.java)

Link kode program Percobaan3: [Link ke kode program](../../src/6_Inheritance/percobaan_3/Percobaan31841720175.java)

### Percobaan 4

![contoh screenshot](img/percobaan_4.png)

Link kode program ClassA: [Link ke kode program](../../src/6_Inheritance/percobaan_4/ClassA1841720175Fajar.java)

Link kode program ClassB: [Link ke kode program](../../src/6_Inheritance/percobaan_4/ClassB1841720175Fajar.java)

Link kode program ClassC: [Link ke kode program](../../src/6_Inheritance/percobaan_4/ClassC1841720175Fajar.java)

Link kode program Percobaan4: [Link ke kode program](../../src/6_Inheritance/percobaan_4/Percobaan41841720175Fajar.java)



### Percobaan 5

![contoh screenshot](img/percobaan_5.png)

Link kode program Karyawan: [Link ke kode program](../../src/6_Inheritance/percobaan_5/Karyawan1841720175Fajar.java)

Link kode program Manager: [Link ke kode program](../../src/6_Inheritance/percobaan_5/Manager1841720175Fajar.java)

Link kode program Staff: [Link ke kode program](../../src/6_Inheritance/percobaan_5/Staff1841720175Fajar.java)

Link kode program Inheritance1: [Link ke kode program](../../src/6_Inheritance/percobaan_5/Inheritance11841720175Fajar.java)

### Percobaan 6

![contoh screenshot](img/percobaan_6.png)

Link kode program StaffTetep: [Link ke kode program](../../src/6_Inheritance/percobaan_6/StaffTetap1841720175Fajar.java)

Link kode program StaffHarian: [Link ke kode program](../../src/6_Inheritance/percobaan_6/StaffHarian1841720175Fajar.java)

Link kode program Inheritance2: [Link ke kode program](../../src/6_Inheritance/percobaan_6/Inheritance21841720175Fajar.java)

## Pertanyaan

### Percobaan 1

1. Pada percobaan 1 ditas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan!

![contoh screenshot](img/percobaan_1.png)

2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

    Error terjadi karena pada ClassB tidak mengenali variable x dan y yang terletak di ClassA dan pada objek hitung ClassB objek hitung tidak mengenali method getNilai() 

### Percobaan 2

1. Pada percobaan 2 di atas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

![contoh screenshot](img/percobaan_2.png)

2. Jelaskan apa penyebab program pada percobaan 2 ketika dijalankan terdapat error!

    Program error karena pada ClassB pada method getJumlah(), ClassB tidak mengenali variable x dan y karena kedua variable tersebut dalam ClassA memiliki access modifier private, sehingga hanya ClassA saja yang mengenali variable x dan y.

### Percobaan 3

1. Jelaskan fungsi "super" pada potongan program berikut di class Tabung!

    ![contoh screenshot](img/pertanyaan_3.png)

    Fungsi super pada potongan kode program di atas adalah sebagai representasi objek dari kelas induk (kelas Bangun) dan mengisi nilai varibale phi yang ada di kelas induk dengan nilai dari variable phi (sebagai parameter).

2. Jelaskan fungsi "super" dan "this" pada potongan program berikut di class Tabung!

    ![contoh screenshot](img/pertanyaan_3_2.png)

     Fungsi super pada potongan kode program di atas adalah sebagai representasi objek dari kelas induk (kelas Bangun) dan 
     memberi referensi pada kelas Tabung bahwa phi adalah variable phi yang ada di kelas Bangun.

     Fungsi this pada potongan kode program di atas adalah sebagai referensi dari class itu sendiri sehingga r pada method tersebut adalah variable r pada kelas Tabung.

3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut "phi" dan "r" tetepi class tersebut dapat mengakses atribut tersebut!

    Karena kelas Tabung merupakan turunan dari kelas Bangun yang memiliki variable phi dan r dengan access modifier protected.

### Percobaan 4

1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!

    Yang termasuk super class adalah ClassA karena memiliki turunan yaitu ClassB dan ClassB karena memiliki turunan yaitu ClassC.
    
    Yang termasuk subclass adalah ClassB karena merupakan turunan dari ClassA dan ClassC karena merupakan turunan dari ClassB.

2. Ubalah isi konstruktor default ClassC seperti berikut:

    Tambahkan kata super() di baris Pertaman dalam konstruktor defaultnya. Coba jalankan kembali class Percobaan 4 dan terlihat tidak ada perbedaan dari hasil outputnya!

3. Ubahlah isi konstruktor default ClassC seperti berikut:

    Ketika mengubah posisi super() dibaris kedua dalam konstruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang.

    Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil seperti berikut pada saat instansiasi objek test dari class ClassC.

    Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!

    Ketika objek test dari ClassC dibuat maka secara otomatis akan memanggil konstruktor dari ClassC dimana konstruktor ClassC akan memanggil konstruktor ClassB karena ClassC merupakan turunan dari ClassB dan seterusnya sampai ClassA.

4. Apakah fungsi super() pada potongan program dibawah ini di ClassC!

    super() digunakan untuk memanggil method pada parent class (ClassB).

### Percobaan 5

1. Sebutkan class mana yang termasuk super class dengan sub class dari percobaan 1 diatas!

    Yang termasuk super class adalah kelas Karyawan dan yang termasuk subclass adalah kelas Manager dan kelas Staff.

2. Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?

    Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain extends.

3. Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!

    Atribut yang dimiliki kelas Manager tunjangan dan memiliki semua atribut dari kelas Karyawan.

4. Jelaskan kata kunci super pada potongan program di bawah ini yang terdapat pada class Manager!

    Kata kunci super pada potongan kode program tersebut memiliki arti bahwa atribut gaji adalah atribut gaji pada kelas Karyawan.

5. Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya!

    Percobaan 1 diatas termasuk dalam jenis inheritance multiple inheritance karena satu superclass memiliki beberapa subclass. 

### Percobaan 6

1. Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?

    Kedua class diatas termasuk multilevel inheritance.

2. Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!

    Atribut StaffTetap adalah golongan dan gaji. Atribut yang diwarisi dari kellas Staff adalah lembur dan potongan.

3. Apakah fungsi potongan program berikut pada class StaffHarian?

    Memanggil atribut nama,alamat,jk,umur,gaji,lembur, dan potongan dari kelas superclass.

4. Apakah fungsi potongan program berikut pada class StaffHarian?

    Memanggil method tampilDataStaff() dari kelas Staff.

5. Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap

    Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagainama class StaffTetap memiliki atribut gaji lembur, dan potongan padahal dalam class tersebut tidak dideklakarsikan atribut gaji, lembur, dan potongan?

    Karena kelas StaffTetap merupakan kelas turunan dari kelas Staff sehingga ia bisa mengakses atribut dari kelas Staff dan superclassnya yang memiliki access modifier public atau protected.

## Tugas


![contoh screenshot](img/tugas_mac.png)

![contoh screenshot](img/tugas_windows.png)

![contoh screenshot](img/tugas_pc.png)

Link kode program Komputer: [Link ke kode program](../../src/6_Inheritance/tugas/Komputer1841720175Fajar.java)

Link kode program Leptop: [Link ke kode program](../../src/6_Inheritance/tugas/Leptop1841720175Fajar.java)

Link kode program PC: [Link ke kode program](../../src/6_Inheritance/tugas/PC1841720175Fajar.java)

Link kode program MAC: [Link ke kode program](../../src/6_Inheritance/tugas/MAC1841720175Fajar.java)

Link kode program Windows: [Link ke kode program](../../src/6_Inheritance/tugas/Windows1841720175Fajar.java)

Link kode program InheritanceTugas: [Link ke kode program](../../src/6_Inheritance/tugas/InheritanceTugas1851720175Fajar.java)

## Kesimpulan

Inheritance dapat digunakan untuk membuat class yang lebih spesifik dari class yang sudah ada yang masih bersifat general atau umum. Inheritance mempermudah programmer untuk membuat program dengan cara programmer tidak perlu menulis kode program yang sama untuk kelas yang berbeda namun memiliki karakteristik yang sama.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd, 

Fajar Pandu

