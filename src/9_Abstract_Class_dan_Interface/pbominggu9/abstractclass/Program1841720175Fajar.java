package pbominggu9.abstractclass;

public class Program1841720175Fajar {

    public static void main(String[] args) {
        Kucing1841720175Fajar kucingKampung = new Kucing1841720175Fajar();
        Ikan1841720175Fajar lumbalumba = new Ikan1841720175Fajar();

        Orang1841720175Fajar ani = new Orang1841720175Fajar("Ani");
        Orang1841720175Fajar budi = new Orang1841720175Fajar("Budi");

        ani.peliharaHewanFajar(kucingKampung);
        budi.peliharaHewanFajar(lumbalumba);

        ani.ajakPeliharaanJalanJalanFajar();
        budi.ajakPeliharaanJalanJalanFajar();

    }
}
