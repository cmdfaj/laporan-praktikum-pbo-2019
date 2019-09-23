package tugas;

public class Kursi1841720175Fajar {

    private String mNomor;
    private String mKode;
    private Penumpang1841720175Fajar penumpang;

    public Kursi1841720175Fajar(String mNomor, String mKode) {
        this.mNomor = mNomor;
        this.mKode = mKode;
    }


    public String getmKode() {
        return mKode;
    }

    public void setmKode(String mKode) {
        this.mKode = mKode;
    }

    public String getmNomor() {
        return mNomor;
    }

    public void setmNomor(String mNomor) {
        this.mNomor = mNomor;
    }

    public Penumpang1841720175Fajar getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang1841720175Fajar penumpang) {
        this.penumpang = penumpang;
    }

    public String infoKursiFajar() {
        String info = "";
        //info+="Kode\t: " + mKode + "\n";
        info+="Nomor\t: " + mNomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang\n " + penumpang.infoPenumpangFajar() + "\n";
        }
        return info;
    }

}
