
package percobaan_5;

public class Manager1841720175Fajar extends Karyawan1841720175Fajar{
    public int tunjangan;

    public Manager1841720175Fajar() {
    }
    public void tampilDataManagerFajar(){
        super.tampilDataKaryawanFajar();
        System.out.println("Tujangan\t: " +tunjangan);
        System.out.println("Total gaji\t: " + (super.gaji+tunjangan));
    }
}
