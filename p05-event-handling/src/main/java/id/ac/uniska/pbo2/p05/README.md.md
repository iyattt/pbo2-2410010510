# PBO 2 – Praktikum Pertemuan 5
## Latihan Dasar: Menghidupkan Form Anggota Perpustakaan

### 1. Deskripsi
Latihan ini merupakan pengembangan FormAnggotaPerpustakaan dari Praktikum Pertemuan 4. Pada latihan ini ditambahkan beberapa event agar form dapat digunakan dengan baik.

### 2. Peta Event

| No. | Komponen | Event | Fungsi |
|---|---|---|---|
| 1 | Kotak centang Setuju | itemStateChanged | Tombol Daftar hanya aktif jika kotak dicentang. |
| 2 | Tombol Batal | actionPerformed | Mengosongkan semua isian dan mengembalikan kursor ke NPM. |
| 3 | Tombol Daftar | actionPerformed | Menampilkan ringkasan data anggota menggunakan JOptionPane. |
| 4 | Isian NPM | keyReleased | Menampilkan jumlah digit NPM, misalnya 8 dari 10 digit. |
| 5 | Form Anggota Perpustakaan | windowClosing | Menampilkan konfirmasi sebelum aplikasi ditutup. |

### 3. Pengaturan Form
- defaultCloseOperation diubah menjadi DO_NOTHING_ON_CLOSE.
- Tombol Daftar dibuat tidak aktif saat form pertama kali dibuka.
- Event dibuat melalui menu Events pada GUI Builder NetBeans.

### 4. Dokumentasi Screenshot

#### A. Properties Event Tombol Daftar
Tempelkan screenshot bagian Properties → Events pada tombol Daftar di sini.

#### B. Dialog Ringkasan Data Anggota
Tempelkan screenshot hasil ketika tombol Daftar diklik di sini.

#### C. Dialog Konfirmasi Keluar
Tempelkan screenshot ketika tombol X ditekan dan muncul konfirmasi keluar di sini.

### 5. Pernyataan Penggunaan AI
Alat AI yang digunakan: ChatGPT.

Keperluan penggunaan AI: Membantu memahami langkah pengerjaan praktikum, menjelaskan penempatan kode program, dan membantu mengatasi kesalahan saat membuat event pada Java NetBeans.

![Properties Event Daftar](screenshots.pbo.05/event-daftar.png)

![Dialog Ringkasan](screenshots.pbo.05/dialog-ringkasan.png)

![Dialog Konfirmasi](screenshots.pbo.05/dialog-konfirmasi.png)