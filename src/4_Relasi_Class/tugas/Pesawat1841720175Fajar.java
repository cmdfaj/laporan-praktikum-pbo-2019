package tugas;

public class Pesawat1841720175Fajar {

    private String mMaskapai;
    private String mKode;
    private Pegawai1841720175Fajar mPilot;
    private Pegawai1841720175Fajar mCoPilot;
    private Pegawai1841720175Fajar mPramugari;
    private Kursi1841720175Fajar arrayKursi[];

    public Pesawat1841720175Fajar(String mMaskapai, String mKode, Pegawai1841720175Fajar mPilot, Pegawai1841720175Fajar mCoPilot, Pegawai1841720175Fajar mPramugari, int jumlah) {
        this.mMaskapai = mMaskapai;
        this.mKode = mKode;
        this.mPilot = mPilot;
        this.mCoPilot = mCoPilot;
        this.mPramugari = mPramugari;
        this.arrayKursi = new Kursi1841720175Fajar[jumlah];
        this.initKursiFajar();
    }

    private void initKursiFajar() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi1841720175Fajar(String.valueOf(i + 1), "");
        }
    }

    public String getmMaskapai() {
        return mMaskapai;
    }

    public void setmMaskapai(String mMaskapai) {
        this.mMaskapai = mMaskapai;
    }

    public String getmKode() {
        return mKode;
    }

    public void setmKode(String mKode) {
        this.mKode = mKode;
    }

    public Pegawai1841720175Fajar getmPilot() {
        return mPilot;
    }

    public void setmPilot(Pegawai1841720175Fajar mPilot) {
        this.mPilot = mPilot;
    }

    public Pegawai1841720175Fajar getmCoPilot() {
        return mCoPilot;
    }

    public void setmCoPilot(Pegawai1841720175Fajar mCoPilot) {
        this.mCoPilot = mCoPilot;
    }

    public Pegawai1841720175Fajar getmPramugari() {
        return mPramugari;
    }

    public void setmPramugari(Pegawai1841720175Fajar mPramugari) {
        this.mPramugari = mPramugari;
    }

    public Kursi1841720175Fajar[] getArrayKursi() {
        return arrayKursi;
    }

    public void setArrayKursi(Kursi1841720175Fajar[] arrayKursi, int nomor) {
        this.arrayKursi[nomor] = arrayKursi[nomor];
    }

    public void setPenumpang(Penumpang1841720175Fajar penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }

    public String infoFajar() {
        String info = "";
        info += "Nama\t: " + this.mMaskapai + "\n";
        info += "No \t: " + this.mKode + "\n";
        info += "Pilot\t \n" + this.mPilot.infoPegawaiFajar();
        info += "Co-Pilot\t \n" + this.mCoPilot.infoPegawaiFajar();
        info += "Pramugari\t \n" + this.mPramugari.infoPegawaiFajar() +"\n";
        for (Kursi1841720175Fajar kursi : arrayKursi) {
            info += kursi.infoKursiFajar();
        }
        return info;
    }

}
