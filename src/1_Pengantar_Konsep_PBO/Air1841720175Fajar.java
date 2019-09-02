package water;

public class Air1841720175Fajar {

    private String mRumus, mNama;
    private int mTitikDidih, mTitikBeku,mVolume;

    public void setNamaFajar(String newVolume) {
        mNama = newVolume;
    }

    public void setRumusFajar(String newVolume) {
        mRumus = newVolume;
    }

    public void setTDFajar(int newVolume) {
        mTitikDidih = newVolume;
    }
    public void setVolumeFajar(int newVolume){
        mVolume=newVolume;
    }
    public void tambahVolumeFajar(int increment){
        mVolume=mVolume+increment;
    }
    public void kurangiVolumeFajar(int decrement){
        mVolume=mVolume-decrement;
    }

    public void setTBFajar(int newVolume) {
        mTitikBeku = newVolume;
    }

    public void printDataFajar() {
        System.out.println("Nama\t\t: " + mNama);
        System.out.println("Rumus\t\t: " + mRumus);
        System.out.println("Volume (mL)\t: " + mVolume);
        System.out.println("Titik Didih (C)\t: " + mTitikDidih);
        System.out.println("Titik Beku (C)\t: " + mTitikBeku);
    }

    public static void main(String[] args) {
        Air1841720175Fajar data = new Air1841720175Fajar();
        data.setNamaFajar("Air");
        data.setRumusFajar("H2O");
        data.setVolumeFajar(1000);
        data.kurangiVolumeFajar(200);
        data.setTDFajar(100);
        data.setTBFajar(0);
        data.printDataFajar();

    }
}
