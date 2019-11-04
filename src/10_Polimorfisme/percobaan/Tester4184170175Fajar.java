package percobaan;

public class Tester4184170175Fajar {

    public static void main(String[] args) {
        Owner1841720175Fajar ow = new Owner1841720175Fajar();
        ElectricityBill1841720175Fajar eBill = new ElectricityBill1841720175Fajar(5, "R-1");
        ow.payFajar(eBill);
        System.out.println("--------------------------------------------------------");
        PermanentEmployee1841720175Fajar pEmp = new PermanentEmployee1841720175Fajar("Dedik", 500);
        ow.payFajar(pEmp);
        System.out.println("-------------------------------------");
        InternshipEmployee1841720175Fajar iEmp = new InternshipEmployee1841720175Fajar("Sunarto", 5);
        ow.showMyEmployeeFajar(pEmp);
        System.out.println("------------------------------------------");
        ow.showMyEmployeeFajar(iEmp);
//        ow.payFajar(iEmp);
    }
}
