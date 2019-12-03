/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Kategori1841720175Fajar;

/**
 *
 * @author farfaraway
 */
public class TestBackend1841720175Fajar {

    public static void main(String[] args) {
        Kategori1841720175Fajar kat1 = new Kategori1841720175Fajar("Novel", "Koleksi buku novel");
        Kategori1841720175Fajar kat2 = new Kategori1841720175Fajar("Referensi", "Buku referensi ilmiah");
        Kategori1841720175Fajar kat3 = new Kategori1841720175Fajar("Komik", "Komik anak-anak");
// test insert
        kat1.saveFajar();
        kat2.saveFajar();
        kat3.saveFajar();
// test update
        kat2.setmKeterangan("Koleksi buku referensi ilmiah");
        kat2.saveFajar();
// test delete
        kat3.delete();
// test select all
        for (Kategori1841720175Fajar k : new Kategori1841720175Fajar().getAll()) {
            System.out.println("Nama: " + k.getmNama()+ ", Ket: " + k.getmKeterangan());
        }
// test search
        for (Kategori1841720175Fajar k : new Kategori1841720175Fajar().searchFajar("ilmiah")) {
            System.out.println("Nama: " + k.getmNama()+ ", Ket: " + k.getmKeterangan());
        }
    }
}
