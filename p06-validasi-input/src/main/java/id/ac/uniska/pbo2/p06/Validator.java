/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p06;

/**
 * Aturan validasi isian form tanpa GUI.
 */
public final class Validator {

    private Validator() {
        // Kelas utilitas, tidak perlu dibuat object-nya
    }

    // METHOD 1: Memeriksa isian kosong
    public static String wajibDiisi(String nilai, String namaIsian) {
        if (nilai == null || nilai.isBlank()) {
            return namaIsian + " wajib diisi";
        }
        return null;
    }

    // METHOD 2: Memeriksa NPM
    public static String npm(String npm) {
        String kosong = wajibDiisi(npm, "NPM");

        if (kosong != null) {
            return kosong;
        }

        if (!npm.trim().matches("\\d{10}")) {
            return "NPM harus berisi 10 digit angka";
        }

        return null;
    }

    // METHOD 3: Memeriksa Nama
    public static String nama(String nama) {
        String kosong = wajibDiisi(nama, "Nama");

        if (kosong != null) {
            return kosong;
        }

        if (nama.trim().length() < 3) {
            return "Nama minimal 3 huruf";
        }
        
        if (nama.trim().matches(".*\\d.*")) {
            return "Nama tidak boleh mengandung angka";
        }

        return null;
    }

    // METHOD 4: Memeriksa Email
    public static String email(String email) {
        String kosong = wajibDiisi(email, "Email");

        if (kosong != null) {
            return kosong;
        }

        if (!email.trim().matches(
                "[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+")) {
            return "Format email belum benar, contoh: nama@contoh.com";
        }

        return null;
    }

    // METHOD 5: Memeriksa Nomor HP
    public static String nomorHp(String hp) {
        String kosong = wajibDiisi(hp, "Nomor HP");

        if (kosong != null) {
            return kosong;
        }

        if (!hp.trim().matches("08\\d{8,11}")) {
            return "Nomor HP diawali 08 dan berisi 10 sampai 13 digit";
        }

        return null;
    }
}
