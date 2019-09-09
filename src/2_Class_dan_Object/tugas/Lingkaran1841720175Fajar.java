package tugas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lingkaran1841720175Fajar {

    public double r;
    public final double PHI = 3.14;

    private static DecimalFormat df = new DecimalFormat("#.##");

    public double hitungKelilingFajar() {
        return 2 * PHI * r;
    }

    public double hitungLuasFajar() {
        return PHI * r * r;
    }

    public void printDataFajar() {
        System.out.println("r: " + r + " cm");
        System.out.println("K: " + df.format(hitungKelilingFajar()) + " cm");
        System.out.println("L: " + df.format(hitungLuasFajar()) + " cm2");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran1841720175Fajar lingkaran = new Lingkaran1841720175Fajar();
        System.out.println("====================");
        System.out.print("Jari-jari: ");
        lingkaran.r = sc.nextDouble();
        lingkaran.hitungKelilingFajar();
        lingkaran.hitungLuasFajar();
        lingkaran.printDataFajar();
    }
}
