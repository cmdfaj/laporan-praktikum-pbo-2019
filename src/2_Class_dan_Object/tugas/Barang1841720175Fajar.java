package tugas;
import java.text.DecimalFormat;
public class Barang1841720175Fajar {

    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;
    
    private static DecimalFormat df = new DecimalFormat("#.##");

    public int hitungHargaJualFajar() {
        int hargaJual = (int) (hargaDasar - (hargaDasar * diskon/100));
        return hargaJual;
    }

    public void tampilDataFajar() {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Dasar\t: " + "Rp " + hargaDasar);
        System.out.println("Diskon\t\t: " + df.format(diskon) + "%");
        System.out.println("Harga Jual\t: " + "Rp " + hitungHargaJualFajar());
    }

    public static void main(String[] args) {
        Barang1841720175Fajar brg = new Barang1841720175Fajar();
        brg.kode="008795";
        brg.namaBarang="Penggaris";
        brg.hargaDasar=6500;
        brg.diskon=40;
        brg.tampilDataFajar();

    }
}
