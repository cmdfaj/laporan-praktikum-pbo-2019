
package percobaan_5;

public class StaffTetap1841720175Fajar extends Staff1841720175Fajar {
    public String golongan;
    public int asuransi;

    public StaffTetap1841720175Fajar() {
    }

    public StaffTetap1841720175Fajar(String nama, String alamat, String jk, int umur, int gaji,int lembur, int potongan, String golongan, int asuransi) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    public void tampilStaffTetapFajar(){
        System.out.println("==================Data Staff=================");
        super.tampilDataStaffFajar();
        System.out.println("Golongan\t: " + golongan);
        System.out.println("Asuransi\t: " + asuransi);
        System.out.println("Gaji bersih: " + (gaji+lembur-potongan));
    }
}
