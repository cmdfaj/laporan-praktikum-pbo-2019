package tugas;

public class PC1841720175Fajar extends Komputer1841720175Fajar {

    int ukuranMonitor;

    public PC1841720175Fajar() {
    }

    public PC1841720175Fajar(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampiPCFajar() {
        super.tampilDataFajar();
        System.out.println("Ukuran Monitor\t: " + ukuranMonitor + " inci");
    }

}
