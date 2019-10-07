package percobaan_5;

public class StaffHarian1841720175Fajar extends Staff1841720175Fajar {

    public int jmlJamKerja;

    public StaffHarian1841720175Fajar() {
    }

    public StaffHarian1841720175Fajar(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jumlJamKerja) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.jmlJamKerja = jumlJamKerja;
    }

    public void tampilStaffHarianFajar() {
        System.out.println("==================Data Staff=================");
        super.tampilDataStaffFajar();
        System.out.println("Jam Kerja\t: " + jmlJamKerja);
        System.out.println("Gaji Bersih\t: " + (gaji + jmlJamKerja + lembur - potongan));
    }
}
