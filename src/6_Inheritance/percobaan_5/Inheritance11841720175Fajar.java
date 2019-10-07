package percobaan_5;

public class Inheritance11841720175Fajar {

    public static void main(String[] args) {
        Manager1841720175Fajar M = new Manager1841720175Fajar();
        M.nama="Vivin";
        M.alamat="Jl. Vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManagerFajar();
        Staff1841720175Fajar S = new Staff1841720175Fajar();
        S.nama="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaffFajar();
    }
}
