package tugas;

import java.lang.*;

public class Segitiga1841720175Fajar {
    
    private int mSudut;
    
    public int totalSudutFajar(int sudutA) {
        mSudut = 180 - sudutA;
        return mSudut;
    }
    
    public int totalSudutFajar(int sudutA, int sudutB) {
        mSudut = 180 - (sudutA + sudutB);
        return mSudut;
    }
    
    public int kelilingFajar(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }
    
    public double kelilingFajar(int sisiA, int sisiB) {
        return Math.sqrt(sisiA) + Math.sqrt(sisiB);
    }
    
}
