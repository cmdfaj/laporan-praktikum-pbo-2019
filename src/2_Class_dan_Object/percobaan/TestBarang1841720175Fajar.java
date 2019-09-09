package praktikum;

public class TestBarang1841720175Fajar {

    public static void main(String[] args) {
        Barang1841720175Fajar brg1 = new Barang1841720175Fajar();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangFajar();
        System.out.println("Stok Baru\t: " + brg1.tambahStokFajar(20));
    }
}
