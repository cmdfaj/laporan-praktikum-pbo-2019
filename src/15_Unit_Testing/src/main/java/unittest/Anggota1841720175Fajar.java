
package unittest;
import java.util.ArrayList;
import java.sql.*;
public class Anggota1841720175Fajar {


    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720175Fajar() {
    }

    public Anggota1841720175Fajar(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getmIdAnggota() {
        return mIdAnggota;
    }

    public void setmIdAnggota(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamat() {
        return mAlamat;
    }

    public void setmAlamat(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getmTelepon() {
        return mTelepon;
    }

    public void setmTelepon(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    

    public Anggota1841720175Fajar getByIdFajar(int id) {
        Anggota1841720175Fajar ang = new Anggota1841720175Fajar();
        ResultSet rs = DBHelper1841720175Fajar.selectQuery("select * from anggota " + "where idanggota = '" + id + "'");
        try {
            while (rs.next()) {
                ang = new Anggota1841720175Fajar();
                ang.setmIdAnggota(rs.getInt("idanggota"));
                ang.setmNama(rs.getString("nama"));
                ang.setmAlamat(rs.getString("alamat"));
                ang.setmTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ang;
    }

    public ArrayList<Anggota1841720175Fajar> getAll() {
        ArrayList<Anggota1841720175Fajar> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720175Fajar.selectQuery("select * from anggota");
        try {
            while (rs.next()) {
                Anggota1841720175Fajar ang = new Anggota1841720175Fajar();
                ang.setmIdAnggota(rs.getInt("idanggota"));
                ang.setmNama(rs.getString("nama"));
                ang.setmAlamat(rs.getString("alamat"));
                ang.setmTelepon(rs.getString("telepon"));

                ListKategori.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    public ArrayList<Anggota1841720175Fajar> searchFajar(String keyword){
        ArrayList<Anggota1841720175Fajar> ListKategori = new ArrayList();
        String sql = "select * from anggota where " +
                " nama like '%" + keyword + "%' " + 
                " or alamat like '%" + keyword + "%' " +
                " or telepon like '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720175Fajar.selectQuery(sql);
        
        try{
            while(rs.next()){
                Anggota1841720175Fajar ang = new Anggota1841720175Fajar();
                ang.setmIdAnggota(rs.getInt("idanggota"));
                ang.setmNama(rs.getString("nama"));
                ang.setmAlamat(rs.getString("alamat"));
                ang.setmTelepon(rs.getString("telepon"));
                
                ListKategori.add(ang);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return ListKategori;
    }
    public void saveFajar(){
        if (getByIdFajar(mIdAnggota).getmIdAnggota()==0) {
            String sql = "insert into anggota (nama, alamat, telepon) values("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat +"', "
                    + " '" + this.mTelepon +"' "
                    + " )";
            this.mIdAnggota= DBHelper1841720175Fajar.insertQueryGetIdFajar(sql);
        }else{
            String sql = "update anggota set " 
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + " where idanggota = '" + this.mIdAnggota + "'";
            DBHelper1841720175Fajar.executeQuery(sql);
        }
    }
    public void delete(){
        String sql = "delete from anggota where idanggota = '" +this.mIdAnggota + "'";
        DBHelper1841720175Fajar.executeQuery(sql);
    }

}
