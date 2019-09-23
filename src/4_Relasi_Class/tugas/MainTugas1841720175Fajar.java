package tugas;

public class MainTugas1841720175Fajar {

    public static void main(String[] args) {
        Pegawai1841720175Fajar pilot = new Pegawai1841720175Fajar("007", "James Bond");
        Pegawai1841720175Fajar copilot = new Pegawai1841720175Fajar("001", "Ethan Hunt");
        Pegawai1841720175Fajar pramugari = new Pegawai1841720175Fajar("000", "M");
        Penumpang1841720175Fajar penumpang = new Penumpang1841720175Fajar("John Wick", "009");
        Pesawat1841720175Fajar pesawat = new Pesawat1841720175Fajar("Sriwijaya Air","1101", pilot, copilot, pramugari, 10);
        pesawat.setPenumpang(penumpang, 1);
        System.out.println(pesawat.infoFajar());
                
    }

}
