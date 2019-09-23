
package fajar.relasiclass.percobaan;

public class Laptop1841720175Fajar {
    private String mMerk;
    private Processor1841720175Fajar proc;

    public Laptop1841720175Fajar() {
    }

    public Laptop1841720175Fajar(String mMerk, Processor1841720175Fajar proc) {
        this.mMerk = mMerk;
        this.proc = proc;
    }

    public String getmMerkFajar() {
        return mMerk;
    }

    public void setmMerkFajar(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720175Fajar getProcFajar() {
        return proc;
    }

    public void setProcFajar(Processor1841720175Fajar proc) {
        this.proc = proc;
    }
    
    public void infoFajar(){
        System.out.println("Merk Laptop\t: " + mMerk);
        proc.infoFajar();
    }
}
