
package percobaan_1;

public class Manager1841720175Fajar extends Karyawan1841720175Fajar{
    private double mTunjangan;
    private String mBagian;
    private Staff1841720175Fajar st[];

    public double getmTunjangan() {
        return mTunjangan;
    }

    public void setmTunjangan(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagian() {
        return mBagian;
    }

    public void setmBagian(String mBagian) {
        this.mBagian = mBagian;
    }

    public Staff1841720175Fajar[] getSt() {
        return st;
    }

    public void setSt(Staff1841720175Fajar[] st) {
        this.st = st;
    }
    public void viewStaff(){
        for (int i =0;i<st.length;i++) {
        st[i].lihatInfo();
        }
    }
    public void lihatInfo(){
        System.out.println("Manager\t\t: " + this.getmBagian());
        System.out.println("NIP\t\t: " + this.getmNip());
        System.out.println("Nama\t\t: " + this.getmNama());
        System.out.println("Golongan\t: " + this.getmGolongan());
        System.out.printf("Tunjungan\t: %.0f\n",this.getmTunjangan());
        System.out.printf("Gaji\t\t: %.0f\n",this.getmGaji());
        System.out.println("Bagian\t\t: " + this.getmBagian());
        this.viewStaff();
        System.out.println("============================================");
    }
    public double getGaji(){
        return super.getmGaji()+mTunjangan;
    }
}
