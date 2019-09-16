package percobaaan;

public class Motor1841720175Fajar {

    //pada percobaan 1 kecepatan dan kontakOn bertipe public
    private int mKecepatan = 0;
    private boolean mKontakOn = false;

    public void printStatusFajar() {
        if (mKontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan: " + mKecepatan);
    }

    public void nyalakanMesinFajar() {
        mKontakOn = true;
    }

    public void matikanMesinFajar() {
        mKontakOn = false;
        mKecepatan = 0;
    }

    public void tambahKecepatanFajar() {

        if (mKontakOn == true) {
            mKecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertamabah karena Mesin OFF");
        }
        if (mKontakOn == true && mKecepatan > 100) {
            System.out.println("Anda sudah mencapai batas maksimal kecepatan (100), kecepatan Anda: " + mKecepatan);
            mKecepatan-=5;
        } 
    }
    
    public void kurangaiKecepatanFajar() {
        if (mKontakOn == true) {
            mKecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin OFF");
        }
    }
}
