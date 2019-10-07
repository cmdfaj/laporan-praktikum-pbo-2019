package tugas;

public class InheritanceTugas1851720175Fajar {

    public static void main(String[] args) {
        MAC1841720175Fajar mac = new MAC1841720175Fajar("Macbook Pro", 2, 8, "Intel Core i5 quad-core", "lithium-polymer", "macOS Security");
        Windows1841720175Fajar win = new Windows1841720175Fajar("Acer", 2, 8, "Intel Core i5-8265U", "lithium-polymer", "Thin & Light");
        PC1841720175Fajar pc = new PC1841720175Fajar("Asus", 3, 4, "Intel Core i5 8400", 27);
//        mac.tampilMACFajar();
//        win.tampilWindowsFajar();
        pc.tampiPCFajar();
    }
}
