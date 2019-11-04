package percobaan;

public class PermanentEmployee1841720175Fajar extends Employee1841720175Fajar implements Payable1841720175Fajar {

    private int salary;

    public PermanentEmployee1841720175Fajar(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalaryFajar() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmountFajar() {
        return (int) (salary + 0.05 * salary);
    }

    @Override
    public String getEmployeeInfoFajar() {
        String info = super.getEmployeeInfoFajar() + "\n";
        info += "Registered as permanent employer with salary " + salary + "\n";
        return info;
    }

}
