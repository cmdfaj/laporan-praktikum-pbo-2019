package tugas;

public class Komputer1841720175Fajar {

    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer1841720175Fajar() {
    }

    public Komputer1841720175Fajar(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }

    public void tampilDataFajar() {
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Prosesor\t: " + jnsProsesor);
        System.out.println("Kec Prosesor\t: " + kecProsesor + " Ghz");
        System.out.println("Memory\t\t: " + sizeMemory + " GB");
    }
}
