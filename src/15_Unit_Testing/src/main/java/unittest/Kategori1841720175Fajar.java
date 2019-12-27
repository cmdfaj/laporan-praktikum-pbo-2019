package unittest;

import java.util.ArrayList;
import java.sql.*;

public class Kategori1841720175Fajar {

    private int mIdKategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720175Fajar() {
    }

    public Kategori1841720175Fajar(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getmIdKategori() {
        return mIdKategori;
    }

    public void setmIdKategori(int mIdKategori) {
        this.mIdKategori = mIdKategori;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKeterangan() {
        return mKeterangan;
    }

    public void setmKeterangan(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720175Fajar getByIdFajar(int id) {
        Kategori1841720175Fajar kat = new Kategori1841720175Fajar();
        ResultSet rs = DBHelper1841720175Fajar.selectQuery("select * from kategori " + "where idkategori = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Kategori1841720175Fajar();
                kat.setmIdKategori(rs.getInt("idkategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720175Fajar> getAll() {
        ArrayList<Kategori1841720175Fajar> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720175Fajar.selectQuery("select * from kategori");
        try {
            while (rs.next()) {
                Kategori1841720175Fajar kat = new Kategori1841720175Fajar();
                kat.setmIdKategori(rs.getInt("idkategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720175Fajar> searchFajar(String keyword) {
        ArrayList<Kategori1841720175Fajar> ListKategori = new ArrayList();
        String sql = "select * from kategori where "
                + " nama like '%" + keyword + "%' "
                + " or keterangan like '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720175Fajar.selectQuery(sql);

        try {
            while (rs.next()) {
                Kategori1841720175Fajar kat = new Kategori1841720175Fajar();
                kat.setmIdKategori(rs.getInt("idkategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveFajar() {
        if (getByIdFajar(mIdKategori).getmIdKategori() == 0) {
            String sql = "insert into kategori (nama, keterangan) values("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdKategori = DBHelper1841720175Fajar.insertQueryGetIdFajar(sql);
        } else {
            String sql = "update kategori set "
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + " where idkategori = '" + this.mIdKategori + "'";
            DBHelper1841720175Fajar.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "delete from kategori where idkategori = '" + this.mIdKategori + "'";
        DBHelper1841720175Fajar.executeQuery(sql);
    }

    public ArrayList<Kategori1841720175Fajar> getByNamaAndKeterangan(String nama, String keterangan) {
        ArrayList<Kategori1841720175Fajar> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1841720175Fajar.selectQuery("SELECT * FROM kategori Where nama = '"
                    + nama + "' and keterangan = '" + keterangan + "'");
        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1841720175Fajar.selectQuery("SELECT * FROM kategori Where nama = '"
                    + nama + "'");
        } else {
            rs = DBHelper1841720175Fajar.selectQuery("SELECT * FROM kategori Where keterangan = '"+ keterangan+"'  ");
        }
        try {
            while (rs.next()) {
                Kategori1841720175Fajar kat = new Kategori1841720175Fajar();
                kat.setmIdKategori(rs.getInt("idkategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
}
