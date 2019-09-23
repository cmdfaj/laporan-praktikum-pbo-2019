package fajar.relasiclass.percobaan2;

public class Sopir1841720175Fajar {

    private String mNama;
    private int mBiaya;

    public String getmNamaFajar() {
        return mNama;
    }

    public void setmNamaFajar(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiayaFajar() {
        return mBiaya;
    }

    public void setmBiayaFajar(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public Sopir1841720175Fajar() {
    }

    public int hitungBiyaSopir(int hari) {
        return mBiaya * hari;
    }
}
