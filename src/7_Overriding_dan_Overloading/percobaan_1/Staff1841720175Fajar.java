
package percobaan_1;

public class Staff1841720175Fajar extends Karyawan1841720175Fajar{
    private int mLembur;
    private double mGajiLembur;

    public int getmLembur() {
        return mLembur;
    }

    public void setmLembur(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getGajiLembur() {
        return mGajiLembur;
    }

    public void setGajiLembur(double gajiLmbur) {
        this.mGajiLembur = gajiLmbur;
    }
    public double getmGaji(int lembur,double gajiLembur){
        return super.getmGaji()+lembur*gajiLembur;
    }
    public double getmGaji(){
        return super.getmGaji()+mLembur*mGajiLembur;
    }
    
    public void lihatInfo(){
        System.out.println("NIP\t\t: "+this.getmNip());
        System.out.println("Nama\t\t: " +this.getmNama());
        System.out.println("Golongan\t: " + this.getmGolongan());
        System.out.println("Jml Lembur\t: " + this.getmLembur());
        System.out.printf("Gaji Lembur\t: %.0f\n",this.getGajiLembur());
        System.out.printf("Gaji\t\t: %.0f\n",this.getmGaji());
    }
    
}
