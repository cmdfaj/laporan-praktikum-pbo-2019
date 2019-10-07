
package percobaan_5;

public class Staff1841720175Fajar extends Karyawan1841720175Fajar {
    public int lembur, potongan;

    public Staff1841720175Fajar() {
    }

    public Staff1841720175Fajar(int lembur, int potongan) {
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public Staff1841720175Fajar(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    public void tampilDataStaffFajar(){
        super.tampilDataKaryawanFajar();
        System.out.println("Lembur\t\t: " + lembur);
        System.out.println("Potongan\t: " + potongan);
        System.out.println("Total Gaji\t: " + (gaji+lembur-potongan));
    }
}
