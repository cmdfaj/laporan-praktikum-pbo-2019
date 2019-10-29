package pbominggu9.abstractclass;

public class Orang1841720175Fajar {

    private String nama;
    private Hewan1841720175Fajar hewanPeliharaan;

    public Orang1841720175Fajar(String nama) {
        this.nama = nama;
    }

    public void peliharaHewanFajar(Hewan1841720175Fajar hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalanFajar() {
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakFajar();
        System.out.println("-----------------------------------------");
    }
}
