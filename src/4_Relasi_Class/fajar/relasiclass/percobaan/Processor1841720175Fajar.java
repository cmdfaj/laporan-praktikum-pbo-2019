
package fajar.relasiclass.percobaan;

public class Processor1841720175Fajar {
    private String mMerk;
    private double mCache;

    public Processor1841720175Fajar() {
    }

    public Processor1841720175Fajar(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }

    public String getmMerkFajar() {
        return mMerk;
    }

    public void setmMerkFajar(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getmCacheFajar() {
        return mCache;
    }

    public void setmCacheFajar(double mCache) {
        this.mCache = mCache;
    }
    public void infoFajar(){
        System.out.printf("Merk Processor\t: %s\n", mMerk);
        System.out.printf("Cache Memory\t: %.2f\n", mCache);
    }
}
