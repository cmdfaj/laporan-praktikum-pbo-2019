
package sepedademo;

public class SepedaGunung1841720175Fajar extends Sepeda1841720175Fajar {
    private String mTipeSuspensi;
    
    public void setTipeSuspensiFajar(String newValue){
        mTipeSuspensi=newValue;
    }
    
    public void cetakStatusFajar(){
        super.cetakStatusFajar();
        System.out.println("Tipe Suspensi\t: " + mTipeSuspensi);
    }
    
    public static void main(String[] args) {
       SepedaGunung1841720175Fajar spd3 = new SepedaGunung1841720175Fajar();
       
       spd3.setMerkFajar("Klince");
       spd3.tambahKecepatanFajar(5);
       spd3.gantiGearFajar(7);
       spd3.setTipeSuspensiFajar("Gas Suspension");
       spd3.cetakStatusFajar();
       
    }
}
