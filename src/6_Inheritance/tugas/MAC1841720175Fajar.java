package tugas;

public class MAC1841720175Fajar extends Leptop1841720175Fajar {

    public String security;

    public MAC1841720175Fajar() {
    }

    public MAC1841720175Fajar(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

    public void tampilMACFajar() {
        super.tampilLeptopFajar();
        System.out.println("Security\t: " + security);
    }

}
