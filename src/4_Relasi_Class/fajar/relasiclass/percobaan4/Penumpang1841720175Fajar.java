package fajar.relasiclass.percobaan4;

public class Penumpang1841720175Fajar {

    private String mKtp, mNama;

    public Penumpang1841720175Fajar(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public String getmKtp() {
        return mKtp;
    }

    public void setmKtp(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }
    public String infoPenumpangFajar(){
        String info="";
        info+="KTP\t: " + mKtp + "\n";
        info +="Nama\t: " + mNama + "\n";
        return info;
    }

}
