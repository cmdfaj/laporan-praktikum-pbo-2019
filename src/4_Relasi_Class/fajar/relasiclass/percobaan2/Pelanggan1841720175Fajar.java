package fajar.relasiclass.percobaan2;

public class Pelanggan1841720175Fajar {

    public Pelanggan1841720175Fajar() {
    }
    private String mNama;
    private int mHari;
    private Mobil1841720175Fajar mMobil;
    private Sopir1841720175Fajar mSopir;

    public String getmNamaFajar() {
        return mNama;
    }

    public void setmNamaFajar(String mNama) {
        this.mNama = mNama;
    }

    public int getmHariFajar() {
        return mHari;
    }

    public void setmHariFajar(int mHari) {
        this.mHari = mHari;
    }

    public Mobil1841720175Fajar getmMobilFajar() {
        return mMobil;
    }

    public void setmMobilFajar(Mobil1841720175Fajar mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720175Fajar getmSopirFajar() {
        return mSopir;
    }

    public void setmSopirFajar(Sopir1841720175Fajar mSopir) {
        this.mSopir = mSopir;
    }
    public int hitungBiayaTotalFajar(){
        return mMobil.hitungBiayaMobilFajar(mHari) + mSopir.hitungBiyaSopir(mHari);
    }

}
