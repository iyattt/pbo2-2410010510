# PRAKTIKUM 6 – VALIDASI INPUT DAN UMPAN BALIK PADA FORM

## 1. Identitas Mahasiswa

- Nama: Riyadh Rachmatullah
- NPM: 2410010510
- Program Studi: Teknik Informatika
- Mata Kuliah: Pemrograman Berorientasi Objek 2
- Praktikum: 6 – Validasi Input

## 2. Deskripsi Praktikum

Praktikum ini membahas cara membuat validasi input pada form anggota perpustakaan menggunakan bahasa pemrograman Java dan NetBeans.

Validasi digunakan untuk memastikan data yang dimasukkan pengguna sudah benar sebelum diproses oleh program.

## 3. Fitur yang Dibuat

Fitur yang terdapat dalam aplikasi ini adalah:

1. Validasi NPM harus terdiri dari 10 digit angka.
2. Validasi nama tidak boleh kosong dan tidak boleh mengandung angka.
3. Validasi program studi harus dipilih.
4. Validasi format email.
5. Validasi nomor HP.
6. Pesan kesalahan ditampilkan di bawah kolom isian.
7. Kolom yang salah diberi tanda garis merah.
8. Tombol Daftar aktif setelah persetujuan dicentang.
9. Tombol Batal dilengkapi konfirmasi.
10. Form dapat dikosongkan kembali setelah pendaftaran berhasil.

## 4. Screenshot Hasil Praktikum

### A. Tampilan Awal FormAnggota

![Tampilan awal form](screenshot.pbo.06/form-awal.png)

### B. Tampilan Form dengan Pesan Kesalahan

![Form validasi](screenshot.pbo.06/form-validasi.png)

### C. Hasil Pengujian UjiValidator

![Hasil UjiValidator](screenshot.pbo.06/uji-validator.png)

### D. Tampilan Komponen pada Navigator

![Navigator](screenshot.pbo.06/navigator.png)

### E. Tampilan Pendaftaran Berhasil

![Pendaftaran berhasil](screenshot.pbo.06/pendaftaran-berhasil.png)

## 5. Hasil Eksperimen Praktikum 4

**Eksperimen 1 – Mengetik huruf pada kolom NPM**

Hasil: Huruf tidak dapat dimasukkan karena kolom NPM hanya menerima angka.

**Eksperimen 2 – Mengisi email dengan format yang salah**

Hasil: Ketika kolom email ditinggalkan, pesan kesalahan muncul jika format email tidak benar.

**Eksperimen 3 – Membiarkan kolom Nama kosong**

Hasil: Tidak langsung muncul pesan kesalahan ketika pengguna berpindah kolom. Kesalahan diperiksa ketika tombol Daftar ditekan.

**Eksperimen 4 – Menekan tombol Daftar dengan data kosong**

Hasil: Program menampilkan pesan kesalahan pada kolom yang wajib diisi dan mengarahkan kursor ke kolom yang salah pertama.

**Eksperimen 5 – Menggunakan tombol Alt + N**

Hasil: Fokus berpindah ke kolom Nama melalui pengaturan mnemonic pada label.

**Eksperimen 6 – Menekan tombol Batal**

Hasil: Muncul konfirmasi penghapusan data. Jika memilih No, data tetap ada. Jika memilih Yes, seluruh isian dikosongkan.

## 6. Jawaban Refleksi

**1. Mengapa aturan validasi dipisahkan ke kelas Validator?**

Agar kode lebih rapi, mudah diperiksa, dan dapat digunakan kembali.

**2. Mengapa isian kosong tidak langsung ditandai merah ketika pengguna melewatinya?**

Agar pengguna tidak terganggu oleh pesan kesalahan sebelum mencoba mengisi data. Isian kosong diperiksa ketika tombol Daftar ditekan.

**3. Sebutkan tiga heuristik Nielsen yang diterapkan pada form.**

- Pencegahan kesalahan: NPM hanya menerima angka.
- Visibilitas status sistem: Menampilkan jumlah kesalahan.
- Membantu memperbaiki kesalahan: Menampilkan pesan kesalahan di bawah kolom.

**4. Mengapa pesan kesalahan tidak boleh hanya berupa warna merah?**

Karena tidak semua pengguna dapat membedakan warna dengan baik. Pesan kesalahan juga harus dijelaskan menggunakan tulisan.

**5. Temuan peer review mana yang paling bermanfaat dan mengapa?**

Temuan mengenai pesan kesalahan yang kurang jelas paling bermanfaat karena membantu pengguna mengetahui bagian yang harus diperbaiki.

## 7. Deklarasi Penggunaan AI

Saya menggunakan ChatGPT sebagai alat bantu pembelajaran untuk memahami langkah pembuatan program, mempelajari fungsi method, memahami event handler, dan membantu memeriksa kesalahan kode.

Seluruh program tetap diuji dan disesuaikan dengan kebutuhan praktikum.

## 8. Kesimpulan

Dari praktikum ini, saya belajar membuat validasi input pada form anggota perpustakaan menggunakan Java. Saya juga memahami penggunaan event handler, method, pesan kesalahan, dan cara memberikan umpan balik kepada pengguna.

Dengan adanya validasi, data yang dimasukkan menjadi lebih teratur dan kesalahan pengisian dapat diketahui sebelum pendaftaran diproses.
