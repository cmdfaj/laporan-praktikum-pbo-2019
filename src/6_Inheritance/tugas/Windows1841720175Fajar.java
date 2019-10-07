package tugas;

public class Windows1841720175Fajar extends Leptop1841720175Fajar {

    public String fitur;

    public Windows1841720175Fajar() {
    }

    public Windows1841720175Fajar(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindowsFajar() {
        super.tampilLeptopFajar();
        System.out.println("Fitur\t\t: " + fitur);
    }

}
