
package fajar.relasiclass.percobaan2;

public class Mobil1841720175Fajar {
    private String mMerk;
    private int mBiaya;

    public Mobil1841720175Fajar() {
    }

    public String getmMerkFajar() {
        return mMerk;
    }

    public void setmMerkFajar(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getmBiayaFajar() {
        return mBiaya;
    }

    public void setmBiayaFajar(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    public int hitungBiayaMobilFajar(int hari){
        return mBiaya*hari;
    }
}
