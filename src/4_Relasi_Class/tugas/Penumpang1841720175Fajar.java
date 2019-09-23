
package tugas;

public class Penumpang1841720175Fajar {
    private String mNama;
    private String mKtp;

    public Penumpang1841720175Fajar(String mNama, String mKtp) {
        this.mNama = mNama;
        this.mKtp = mKtp;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKtp() {
        return mKtp;
    }

    public void setmKtp(String mKtp) {
        this.mKtp = mKtp;
    }
    
    public String infoPenumpangFajar(){
        String info="";
        info+="KTP\t :" + mKtp + "\n";
        info+="Nama\t :" + mNama + "\n";
        return info;
    }
}
