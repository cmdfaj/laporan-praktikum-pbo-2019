package tugas;

import java.util.Scanner;

public class KoperasiTest1841720175Fajar {

    public static void main(String[] args) {
//        Anggota1841720175Fajar donny = new Anggota1841720175Fajar("111333444", "Donny", 5000000);
//        System.out.println("Nama\t\t\t: " + donny.getNama());
//        System.out.println("Limit Pinjaman\t\t: Rp " + donny.getLimitPinjaman());
//        System.out.println("");
//
//        System.out.println("Meminjam uang\t\t: Rp 10.000.000");
//        donny.setPinjam(10000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//        System.out.println("");
//
//        System.out.println("Meminjam uang\t\t: Rp 4.000.000");
//        donny.setPinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjaman());
//        System.out.println("");

        //tugas 4
//        System.out.println("Membayar angsuran\t: Rp 1.000.000");
//        donny.setAngsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjaman());
//        System.out.println("");
//
//        System.out.println("Membayar angsuran\t: Rp 3.000.000");
//        donny.setAngsur(3000000);
//        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjaman());
//        System.out.println("");
        //tugas 5
//        System.out.println("Membayar angsuran\t: Rp 200.000");
//        donny.setAngsur(200000);
//        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjaman());
//        System.out.println("");
//
//        System.out.println("Membayar angsuran\t: Rp 1.000.000");
//        donny.setAngsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjaman());
//        System.out.println("");

        //tugas no 6 
        Anggota1841720175Fajar anggota = new Anggota1841720175Fajar();
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.print("Nama\t\t\t: ");
        String nama = sc.nextLine();
        anggota.setNama(nama);

        System.out.print("Limit Pinjaman\t\t: ");
        int limitPinjaman = s.nextInt();
        anggota.setLimitPinjaman(limitPinjaman);
        System.out.println("");

        System.out.print("Meminjam uang\t\t: ");
        int pinjam = s.nextInt();
        anggota.setPinjam(pinjam);
        System.out.print("Jumlah pinjaman saat ini: Rp " + anggota.getJumlahPinjaman());
        System.out.println("\n");

        int angsur;
        do {
            System.out.print("Membayar angsuran\t: ");
            angsur = s.nextInt();
            anggota.setAngsur(angsur);
        } while (angsur<anggota.getJumlahPinjaman()/10);

//        System.out.print("Membayar angsuran\t: ");
//        int angsur = s.nextInt();
//        anggota.setAngsur(angsur);

        System.out.println("Jumlah pinjaman saat ini: Rp " + anggota.getJumlahPinjaman());
        System.out.println("");
    }
}
