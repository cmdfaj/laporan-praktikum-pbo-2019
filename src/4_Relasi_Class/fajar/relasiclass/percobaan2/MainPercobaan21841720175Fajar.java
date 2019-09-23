
package fajar.relasiclass.percobaan2;

public class MainPercobaan21841720175Fajar {
    public static void main(String[] args) {
        Mobil1841720175Fajar m = new Mobil1841720175Fajar();
        m.setmMerkFajar("Avanza");
        m.setmBiayaFajar(350000);
        Sopir1841720175Fajar s = new Sopir1841720175Fajar();
        s.setmNamaFajar("Jane Doe");
        s.setmBiayaFajar(200000);
        Pelanggan1841720175Fajar p = new Pelanggan1841720175Fajar();
        p.setmNamaFajar("Jane Doe");
        p.setmMobilFajar(m);
        p.setmSopirFajar(s);
        p.setmHariFajar(2);
        System.out.println("Biaya Total: " + p.hitungBiayaTotalFajar());
        System.out.println(p.getmMobilFajar().getmMerkFajar()); 
    }
}
