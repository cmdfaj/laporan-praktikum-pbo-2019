package fajar.relasiclass.percobaan3;

public class KeretaApi1841720175Fajar {

    private String mNama;
    private String mKelas;
    private Pegawai1841720175Fajar mMasinis;
    private Pegawai1841720175Fajar mAsisten;

    public KeretaApi1841720175Fajar(String mNama, String mKelas, Pegawai1841720175Fajar mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720175Fajar(String mNama, String mKelas, Pegawai1841720175Fajar mMasinis, Pegawai1841720175Fajar mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelas() {
        return mKelas;
    }

    public void setmKelas(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720175Fajar getmMasinis() {
        return mMasinis;
    }

    public void setmMasinis(Pegawai1841720175Fajar mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720175Fajar getmAsisten() {
        return mAsisten;
    }

    public void setmAsisten(Pegawai1841720175Fajar mAsisten) {
        this.mAsisten = mAsisten;
    }

    public String infoFajar() {
        String infoFajar = "";
        infoFajar += "Nama\t: " + this.mNama + "\n";
        infoFajar += "Kelas\t: " + this.mKelas + "\n";
        infoFajar += "Masisnis\t \n" + this.mMasinis.infoFajar();
        //infoFajar += "Asisten\t \n" + this.mAsisten.infoFajar();
        return infoFajar;
    }
}
