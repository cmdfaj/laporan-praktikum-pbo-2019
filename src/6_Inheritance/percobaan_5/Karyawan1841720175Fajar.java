package percobaan_5;

public class Karyawan1841720175Fajar {

    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan1841720175Fajar() {
    }

    public Karyawan1841720175Fajar(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    public void tampilDataKaryawanFajar(){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Jenis Kelamin\t: " + jk);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Gaji\t\t: " + gaji);
    }
}
