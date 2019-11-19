package percobaan;

import java.util.ArrayList;

public class InputData1841720175Fajar {
    ArrayList<Mahasiswa1841720175Fajar> ListMahasiswa;

    public InputData1841720175Fajar() {
        ListMahasiswa = new ArrayList();
    }
    public void isiDataFajar(String mNim,String mNama,String mAlamat){
        Mahasiswa1841720175Fajar mhs = new Mahasiswa1841720175Fajar(mNim, mNama, mAlamat);
        ListMahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa1841720175Fajar> getData(){
        return ListMahasiswa;
    }
    
}
