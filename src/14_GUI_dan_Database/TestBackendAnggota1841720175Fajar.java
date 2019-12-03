package frontend;

import backend.Anggota1841720175Fajar;

public class TestBackendAnggota1841720175Fajar {

    public static void main(String[] args) {
        Anggota1841720175Fajar ang1 = new Anggota1841720175Fajar("Tini", "Malang", "08123456789");
        Anggota1841720175Fajar ang2 = new Anggota1841720175Fajar("Tono", "Malang", "08123456788");
        Anggota1841720175Fajar ang3 = new Anggota1841720175Fajar("Budi", "Malang", "08123456787");
// test insert
        ang1.saveFajar();
        ang2.saveFajar();
        ang3.saveFajar();
// test update
        ang2.setmAlamat("Surabaya");
        ang2.saveFajar();
// test delete
        ang3.delete();
// test select all
        for (Anggota1841720175Fajar a : new Anggota1841720175Fajar().getAll()) {
            System.out.println("Nama: " + a.getmNama() + ", Alamat: " + a.getmAlamat() + ", Telepon: " + a.getmTelepon());
        }
// test search
        for (Anggota1841720175Fajar a : new Anggota1841720175Fajar().searchFajar("Tono")) {
            System.out.println("Nama: " + a.getmNama() + ", Alamat: " + a.getmAlamat() + ", Telepon: " + a.getmTelepon());
        }
    }
}
