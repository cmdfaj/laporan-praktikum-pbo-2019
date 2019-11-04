package percobaan;

public class Owner1841720175Fajar {

    public void payFajar(Payable1841720175Fajar p) {
        System.out.println("Total payment: " + p.getPaymentAmountFajar());
        if (p instanceof ElectricityBill1841720175Fajar) {
            ElectricityBill1841720175Fajar eb = (ElectricityBill1841720175Fajar) p;
            System.out.println("" + eb.getBillInfo());
        } else if (p instanceof PermanentEmployee1841720175Fajar) {
            PermanentEmployee1841720175Fajar pe = (PermanentEmployee1841720175Fajar) p;
            pe.getEmployeeInfoFajar();
            System.out.println("" + pe.getEmployeeInfoFajar());
        }
    }

    public void showMyEmployeeFajar(Employee1841720175Fajar e) {
        System.out.println("" + e.getEmployeeInfoFajar());
        if (e instanceof PermanentEmployee1841720175Fajar) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her");
        }
    }
}
