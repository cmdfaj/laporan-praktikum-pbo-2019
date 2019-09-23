
package fajar.relasiclass.percobaan3;

public class Pegawai1841720175Fajar {
    private String mNip;
    private String mNama;

    public Pegawai1841720175Fajar(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public String getmNip() {
        return mNip;
    }

    public void setmNip(String mNip) {
        this.mNip = mNip;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }
    public String infoFajar(){
       String infoFajar = "";
       infoFajar += "NIP\t: " + this.mNip + "\n";
       infoFajar += "Nama\t: " + this.mNama + "\n";
       return infoFajar;
    }
}
