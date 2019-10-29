package interfacelatihan;

public class Program1841720175Fajar {

    public static void main(String[] args) {
        Rektor1841720175Fajar pakRektor = new Rektor1841720175Fajar();

        Mahasiswa1841720175Fajar mahasiswaBiasa = new Mahasiswa1841720175Fajar("Charlie");
        Sarjana1841720175Fajar sarjanaCumlaude = new Sarjana1841720175Fajar("Dini");
        PascaSarjana1841720175Fajar masterCumlaude = new PascaSarjana1841720175Fajar("Elok");

//        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaude(masterCumlaude);

       pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
       pakRektor.beriSertifikatMawapres(masterCumlaude);
        
//        sarjanaCumlaude.kuliahDiKampus();
    }
}
