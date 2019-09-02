
package sepedademo;

public class Sepeda1841720175Fajar {
    private String mMerk;
    private int mKecepatan,mGear;
    public void setMerkFajar(String newVolume){
        mMerk=newVolume;
    }
    public void gantiGearFajar(int newValue){
        mGear=newValue;
    }
    public void tambahKecepatanFajar(int increment){
        mKecepatan=mKecepatan+increment;
    }
    public void remFajar(int decrement){
        mKecepatan=mKecepatan-decrement;
    }
    public void cetakStatusFajar(){
        System.out.println("Merk\t\t: " + mMerk);
        System.out.println("Kecepatan\t: " + mKecepatan);
        System.out.println("Gear\t\t: " + mGear);
    }
    public static void main(String[] args) {
        Sepeda1841720175Fajar spd1 = new Sepeda1841720175Fajar();
        Sepeda1841720175Fajar spd2 = new Sepeda1841720175Fajar();
        
        spd1.setMerkFajar("Polygon");
        spd1.tambahKecepatanFajar(10);
        spd1.gantiGearFajar(2);
        spd1.cetakStatusFajar();
        
        spd2.setMerkFajar("Wim Cycle");
        spd2.tambahKecepatanFajar(10);
        spd2.gantiGearFajar(2);
        spd2.tambahKecepatanFajar(10);
        spd2.gantiGearFajar(3);
        spd2.cetakStatusFajar();
        
     
    }
}
