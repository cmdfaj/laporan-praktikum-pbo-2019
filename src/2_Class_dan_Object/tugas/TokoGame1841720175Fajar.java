package tugas;

import java.text.DecimalFormat;

public class TokoGame1841720175Fajar {

    public String id, namaMember, namaGame;
    public float hargaGame, lamaSewa, poin, diskon;

    private static DecimalFormat df = new DecimalFormat("#.##");

    public float hitungPoinFajar() {
        //1 poin untuk setiap total belanja 10000
        poin = poin + (totalBayarFajar() / 10000);
        return poin;
    }

    public float hitungDiskonFajar(float point) {
        //1 poin = 1% diskon
        //maksimal konversi 50 poin (50% diskon)
        do {
            if (point > poin) {
                System.out.println("Maaf poin anda kurang!");
            } else {
                diskon = point / 100;
                poin = poin - point;
            }
        } while (point > 50);

        return diskon;
    }

    public float totalBayarFajar() {
        float harga = hargaGame * lamaSewa;
        float totalBayar = harga - (harga * diskon);
        return totalBayar;
    }

    public void printStrukFajar() {
        System.out.println("ID\t\t: " + id);
        System.out.println("Nama\t\t: " + namaMember);
        System.out.println("Poin\t\t: " + df.format(poin));
        System.out.println("Judul Game\t: " + namaGame);
        System.out.println("Lama pinjam\t: " + df.format(lamaSewa) + " hari");
        System.out.println("Biaya sewa\t: " + "Rp " + df.format(hargaGame));
        System.out.println("Diskon\t\t: " + df.format(diskon * 100) + "%");
        System.out.println("Total harga\t: " + "Rp " + df.format(totalBayarFajar()));
    }

    public static void main(String[] args) {
        TokoGame1841720175Fajar tkgame = new TokoGame1841720175Fajar();
        tkgame.id = "1841720175";
        tkgame.namaMember = "fajar";
        tkgame.namaGame = "FIFA 2019";
        tkgame.lamaSewa = 3;
        tkgame.hargaGame = 20000;
        tkgame.hitungPoinFajar();
        tkgame.hitungDiskonFajar(5);
        tkgame.printStrukFajar();
        System.out.println("");
        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
        

    }
}
