package tugas;

public class Pegawai1841720175Fajar {

    private String mId;
    private String mNama;

    public Pegawai1841720175Fajar(String Id, String mNama) {
        this.mId = Id;
        this.mNama = mNama;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String Id) {
        this.mId = Id;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String infoPegawaiFajar() {
        String infoFajar = "";
        infoFajar += "ID\t: " + this.mId + "\n";
        infoFajar += "Nama\t: " + this.mNama + "\n";
        return infoFajar;
    }
}
