package tugas;

public class MainManusia1841720175Fajar {

    public static void main(String[] args) {
        Manusia1841720175Fajar dosen = new Dosen1841720175Fajar();
        Dosen1841720175Fajar dosen1 = new Dosen1841720175Fajar();
        Manusia1841720175Fajar mahasiswa = new Mahasiswa1841720175Fajar();
        Mahasiswa1841720175Fajar mahasiswa1 = new Mahasiswa1841720175Fajar();
        System.out.println("Stereotype Dosen: ");
        dosen.makanFajar();
        dosen1.lemburFajar();
        System.out.println("============================");
        System.out.println("Stereotype Mahasiswa: ");
        mahasiswa.makanFajar();
        mahasiswa1.tidurFajar();

    }
}
