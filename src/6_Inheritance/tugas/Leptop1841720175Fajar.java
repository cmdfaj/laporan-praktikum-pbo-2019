package tugas;

public class Leptop1841720175Fajar extends Komputer1841720175Fajar {

    public String jnsBaterai;

    public Leptop1841720175Fajar() {
    }

    public Leptop1841720175Fajar(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLeptopFajar() {
        super.tampilDataFajar();
        System.out.println("Baterai\t\t: " + jnsBaterai);
    }
}
