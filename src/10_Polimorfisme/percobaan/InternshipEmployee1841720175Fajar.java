package percobaan;

public class InternshipEmployee1841720175Fajar extends Employee1841720175Fajar {

    private int lenght;

    public InternshipEmployee1841720175Fajar(String name, int lenght) {
        this.lenght = lenght;
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String getEmployeeInfoFajar() {
        String info = super.getEmployeeInfoFajar() + "\n";
        info += "Registered as Internship employee for " + lenght + " month\n";
        return info;
    }
}
