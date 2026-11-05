/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

// Nama: Riyadh Rachmatullah
// NPM: 2410010510

public enum Kategori {

    ALAT_TULIS("Alat Tulis"),
    MAKANAN("Makanan"),
    MINUMAN("Minuman"),
    LAINNYA("Lainnya");

    private final String nama;

    Kategori(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nama;
    }
}
