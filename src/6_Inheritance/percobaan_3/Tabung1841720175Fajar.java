package percobaan_3;

public class Tabung1841720175Fajar extends Bangun1841720175Fajar {

    protected int t;

    public void setSuperPhiFajar(double phi) {
        super.phi = phi;
    }
    public void setSuperRFajar(int r){
        super.r=r;
    }
    public void setTFajar(int t){
        this.t=t;
    }
    public void volumeFajar(){
        System.out.println("Volume Tabung Adalah: " + (super.phi*super.r*super.r*this.t));
    }
}
