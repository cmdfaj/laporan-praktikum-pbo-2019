
package percobaaan;

public class Anggota1841720175Fajar {
    private String mNama;
    private String mAlamat;
    private float mSimpanan;

    public Anggota1841720175Fajar(String nama, String alamat) {
        this.mNama = nama;
        this.mAlamat = alamat;
    }
    
    public void setNamaFajar(String nama){
        this.mNama=nama;
    }
    public void setAlamatFajar(String alamat){
        this.mAlamat=alamat;
    }
    public String getNamaFajar(){
        return mNama;
    }
    public String Fajar(){
        return mAlamat;
    } 
    public float getSimpananFajar(){
        return mSimpanan;
    }
    public void setorFajar(float uang){
        mSimpanan+=uang;
    }
    public void pinjamFajar(float uang){
        mSimpanan-=uang;
    }
}
