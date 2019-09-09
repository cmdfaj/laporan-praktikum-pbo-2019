package praktikum;

public class Barang1841720175Fajar {

    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarangFajar() {
        System.out.println("Nama Barang\t: " + namaBrg);
        System.out.println("Jenis Barang\t: " + jenisBrg);
        System.out.println("Stok\t\t: " + stok);
        
    }
    //method dengan argumen return
    public int tambahStokFajar(int brgMasuk){
        int stokBaru=brgMasuk+stok;
        return stokBaru;
    }
}
