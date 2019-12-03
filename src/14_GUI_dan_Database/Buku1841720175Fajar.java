package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Buku1841720175Fajar {

    private int idBuku, idKategori;
    private String judul, penerbit, penulis;

    public Buku1841720175Fajar() {
    }

    public Buku1841720175Fajar(int idKategori, String judul, String penerbit, String penulis) {
        this.idKategori = idKategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }



    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Buku1841720175Fajar getByIdFajar(int id) {
        Buku1841720175Fajar buk = new Buku1841720175Fajar();
        ResultSet rs = DBHelper1841720175Fajar.selectQuery("select * from buku " + "where idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                buk = new Buku1841720175Fajar();
                buk.setIdBuku(rs.getInt("idbuku"));
                buk.setIdBuku(rs.getInt("idkategori"));
                buk.setJudul(rs.getString("judul"));
                buk.setPenerbit(rs.getString("penerbit"));
                buk.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buk;
    }

    public ArrayList<Buku1841720175Fajar> getAll() {
        ArrayList<Buku1841720175Fajar> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720175Fajar.selectQuery("select * from buku");
        try {
            while (rs.next()) {
                Buku1841720175Fajar buk = new Buku1841720175Fajar();
                buk.setIdBuku(rs.getInt("idbuku"));
                buk.setIdBuku(rs.getInt("idkategori"));
                buk.setJudul(rs.getString("judul"));
                buk.setPenerbit(rs.getString("penerbit"));
                buk.setPenulis(rs.getString("penulis"));

                ListKategori.add(buk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Buku1841720175Fajar> searchFajar(String keyword) {
        ArrayList<Buku1841720175Fajar> ListKategori = new ArrayList();
        String sql = "select * from buku where "
                + " judul like '%" + keyword + "%' "
                + " or penulis like '%" + keyword + "%' "
                + " or penerbit like '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720175Fajar.selectQuery(sql);

        try {
            while (rs.next()) {
                Buku1841720175Fajar buk = new Buku1841720175Fajar();
                buk.setIdBuku(rs.getInt("idbuku"));
                buk.setIdBuku(rs.getInt("idkategori"));
                buk.setJudul(rs.getString("judul"));
                buk.setPenerbit(rs.getString("penerbit"));
                buk.setPenulis(rs.getString("penulis"));

                ListKategori.add(buk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveFajar() {
        if (getByIdFajar(idBuku).getIdBuku() == 0) {
            String sql = "insert into buku (idkategori, judul, penerbit, penulis) values("
                    + " '" + this.idKategori + "', "
                    + " '" + this.judul + "', "
                    + " '" + this.penerbit + "', "
                    + " '" + this.penulis + "' "
                    + " )";
            this.idBuku = DBHelper1841720175Fajar.insertQueryGetIdFajar(sql);
        } else {
            String sql = "update buku set "
                    + " idkategori = '" + this.idKategori + "', "
                    + " judul = '" + this.judul + "', "
                    + " penerbit = '" + this.penerbit + "', "
                    + " penulis = '" + this.penulis + "' "
                    + " where idbuku = '" + this.idBuku + "'";
            DBHelper1841720175Fajar.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "delete from buku where idbuku = '" + this.idBuku + "'";
        DBHelper1841720175Fajar.executeQuery(sql);
    }
}
