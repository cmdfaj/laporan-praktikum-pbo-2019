
package tugas;

public class Karyawan1841720175Fajar {
    public String idKaryawan,namaKaryawan,jenisKelamin,jabatan;
    public int gajiKaryawan;
    public void printDataFajar(){
        System.out.println("ID: " + idKaryawan);
        System.out.println("Nama: " + namaKaryawan);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gajiKaryawan);
    }
    public static void main(String[] args) {
        Karyawan1841720175Fajar kwn = new Karyawan1841720175Fajar();
        kwn.idKaryawan="18900256";
        kwn.namaKaryawan="Budi";
        kwn.jenisKelamin="L";
        kwn.jabatan="Manajer";
        kwn.gajiKaryawan=100000;
        kwn.printDataFajar();
        
    }
}
