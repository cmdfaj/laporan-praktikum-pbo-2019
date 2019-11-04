package percobaan;

public class ElectricityBill1841720175Fajar implements Payable1841720175Fajar {

    private int kwh;
    private String category;

    public ElectricityBill1841720175Fajar(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmountFajar() {
        return kwh * getBasePriceFajar();
    }

    public int getBasePriceFajar() {
        int bPrice = 0;
        switch (category) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    public String getBillInfo() {
        return "kwh: " + kwh + "\n"
                + "Category: " + category + "(" + getBasePriceFajar() + " per kwh)\n";
    }

}
