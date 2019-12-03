package frontend;

import backend.Buku1841720175Fajar;

public class TestBackendBuku1841720175Fajar {

    public static void main(String[] args) {
        Buku1841720175Fajar buk1 = new Buku1841720175Fajar(1,"Dasar Pemrograman Java", "Pustaka Media", "Siti");
        Buku1841720175Fajar buk2 = new Buku1841720175Fajar(2,"Dasar Pemrograman C++", "Pustaka Media", "Tono");
        Buku1841720175Fajar buk3 = new Buku1841720175Fajar(3,"Dasar Pemrograman Python", "Pustaka Media", "Budi");
// test insert
        buk1.saveFajar();
        buk2.saveFajar();
        buk3.saveFajar();
// test update
        buk2.setPenulis("Tini");
        buk2.saveFajar();
// test delete
        buk3.delete();
// test select all
        for (Buku1841720175Fajar b : new Buku1841720175Fajar().getAll()) {
            System.out.println("Judul: " + b.getJudul() + ", Penulis: " + b.getPenulis() + ", Penerbit: " + b.getPenerbit());
        }
// test search
        for (Buku1841720175Fajar b : new Buku1841720175Fajar().searchFajar("Budi")) {
            System.out.println("Judul: " + b.getJudul() + ", Penulis: " + b.getPenulis() + ", Penerbit: " + b.getPenerbit());
        }
    }
}
