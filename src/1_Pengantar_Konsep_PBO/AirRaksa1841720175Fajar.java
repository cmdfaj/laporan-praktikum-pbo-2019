package water;

public class AirRaksa1841720175Fajar extends Air1841720175Fajar {

    private String mBahaya,mKegunaan;

    public void setBahayaFajar(String newVolume) {
        mBahaya = newVolume;
    }
    public void setKegunaanFajar(String newVolume){
        mKegunaan = newVolume;
    }

    public void printDataFajar() {
        super.printDataFajar();
        System.out.println("Kegunaan\t: " + mKegunaan);
        System.out.println("Bahaya\t\t: " + mBahaya);
    }

    public static void main(String[] args) {
        AirRaksa1841720175Fajar data = new AirRaksa1841720175Fajar();
        data.setNamaFajar("Air Raksa");
        data.setRumusFajar("Hg");
        data.setVolumeFajar(700);
        data.tambahVolumeFajar(500);
        data.setTDFajar(356);
        data.setTBFajar(-39);
        data.setKegunaanFajar("Membuat termometer");
        data.setBahayaFajar("Beracun");
        
        data.printDataFajar();
    }
}
