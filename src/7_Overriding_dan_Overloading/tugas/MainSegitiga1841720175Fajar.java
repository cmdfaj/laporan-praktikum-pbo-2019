package tugas;

public class MainSegitiga1841720175Fajar {

    public static void main(String[] args) {
        Segitiga1841720175Fajar segitiga = new Segitiga1841720175Fajar();
        System.out.println("Sudut (1 parameter)\t: " + segitiga.totalSudutFajar(45));
        System.out.println("Sudut (2 parameter)\t: " + segitiga.totalSudutFajar(30, 60));
        System.out.printf("Keliling (2 parameter)\t: %.2f\n", segitiga.kelilingFajar(15, 8));
        System.out.println("Keliling (3 parameter)\t: " + segitiga.kelilingFajar(10, 9, 15));
    }
}
