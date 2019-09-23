package fajar.relasiclass.percobaan4;

public class MainPercobaan41841720175Fajar {

    public static void main(String[] args) {
        Penumpang1841720175Fajar p = new Penumpang1841720175Fajar("12345", "Mr. Krab");
        Gerbong1841720175Fajar gerbong = new Gerbong1841720175Fajar("A", 10);
        Penumpang1841720175Fajar budi = new Penumpang1841720175Fajar("1234", "Budi");
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.infoGerbongFajar());

    }
}
