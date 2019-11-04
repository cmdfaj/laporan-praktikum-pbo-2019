package percobaan;

public class Tester11841720175Fajar {

    public static void main(String[] args) {
        PermanentEmployee1841720175Fajar pEmp = new PermanentEmployee1841720175Fajar("Dedik", 500);
        InternshipEmployee1841720175Fajar iEmp = new InternshipEmployee1841720175Fajar("Sunarto", 5);
        ElectricityBill1841720175Fajar eBill = new ElectricityBill1841720175Fajar(5, "A-1");
        Employee1841720175Fajar e;
        Payable1841720175Fajar p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }

}
