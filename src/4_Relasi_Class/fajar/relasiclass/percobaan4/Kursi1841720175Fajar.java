
package fajar.relasiclass.percobaan4;

public class Kursi1841720175Fajar {
    private String mNomor;
    private Penumpang1841720175Fajar penumpang;

    public Kursi1841720175Fajar(String mNomor) {
        this.mNomor = mNomor;
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
    public String infoKursiFajar(){
        String info="";
        info+="Nomor\t: " + mNomor + "\n";
        if (this.penumpang!=null) {
            info+="Penumpang\n " + penumpang.infoPenumpangFajar() + "\n";
        }
        return info;
    }
    
}
