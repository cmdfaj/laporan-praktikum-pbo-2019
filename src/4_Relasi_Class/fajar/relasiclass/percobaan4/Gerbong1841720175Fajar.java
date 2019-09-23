
package fajar.relasiclass.percobaan4;

public class Gerbong1841720175Fajar {
    private String mKode;
    Kursi1841720175Fajar arrayKursi[];

    public Gerbong1841720175Fajar(String mKode,int jumlah) {
        this.mKode = mKode;
        this.arrayKursi = new Kursi1841720175Fajar[jumlah];
        this.initKursiFajar();
    }
    private void initKursiFajar(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i]=new Kursi1841720175Fajar(String.valueOf(i+1));
        }
    }

    public String getmKode() {
        return mKode;
    }

    public void setmKode(String mKode) {
        this.mKode = mKode;
    }

    public Kursi1841720175Fajar[] getArrayKursi() {
        return arrayKursi;
    }

    public void setArrayKursi(Kursi1841720175Fajar[] arrayKursi,int nomor) {
        this.arrayKursi[nomor] = arrayKursi[nomor];
    }
    public String infoGerbongFajar(){
        String info="";
        info+="Kode\t: " + mKode + "\n";
        for (Kursi1841720175Fajar kursi: arrayKursi) {
            info+=kursi.infoKursiFajar();
        }
        return info;
    }
    public void setPenumpang(Penumpang1841720175Fajar penumpang, int nomor){
        if (arrayKursi[nomor-1].getPenumpang()==null) {
            this.arrayKursi[nomor-1].setPenumpang(penumpang);
        }else{
            System.out.println("Kursi Sudah Dipesan!");
        }
        
    }
    
}
