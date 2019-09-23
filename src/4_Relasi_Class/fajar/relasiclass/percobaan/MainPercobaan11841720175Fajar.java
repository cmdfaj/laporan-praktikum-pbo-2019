package fajar.relasiclass.percobaan;

public class MainPercobaan11841720175Fajar {

    public static void main(String[] args) {
        Processor1841720175Fajar p = new Processor1841720175Fajar("Intel i5", 3);
        Laptop1841720175Fajar L = new Laptop1841720175Fajar("Thinkpad", p);
        L.infoFajar();
        Processor1841720175Fajar p1 = new Processor1841720175Fajar();
        p1.setmMerkFajar("Intel i5");
        p1.setmCacheFajar(4);
        Laptop1841720175Fajar L1 = new Laptop1841720175Fajar();
        L1.setmMerkFajar("Thinkpad");
        L1.setProcFajar(p1);
        L1.infoFajar();
    }
}
