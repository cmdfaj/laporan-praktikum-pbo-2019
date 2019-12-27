package unittest;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class Buku1841720175Fajar {

    private int idBuku;
    private Kategori1841720175Fajar kategori = new Kategori1841720175Fajar();
    private String judul, penerbit, penulis;

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public Kategori1841720175Fajar getKategori() {
        return kategori;
    }

    public void setKategori(Kategori1841720175Fajar kategori) {
        this.kategori = kategori;
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

    public Buku1841720175Fajar() {
    }

    public Buku1841720175Fajar(Kategori1841720175Fajar kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public Buku1841720175Fajar getByIdFajar(int id) {
        Buku1841720175Fajar buku = new Buku1841720175Fajar();
        ResultSet rs = DBHelper1841720175Fajar.selectQuery("select "
                + " b.idbuku as idbuku, "
                + " b.judul as judul, "
                + " b.penerbit as penerbit, "
                + " b.peulis as penulis, "
                + " k.idkategori as idkategori, "
                + " k.nama as nama, "
                + " k.keterangan as keterangan, "
                + " from buku b, "
                + " left join kategori on b.idkategori = k.idkategori"
                + " where b.idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku1841720175Fajar();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setmIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setmNama(rs.getString("nama"));
                buku.getKategori().setmKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720175Fajar> getAll() {
        ArrayList<Buku1841720175Fajar> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720175Fajar.selectQuery("select "
                + " b.idbuku as idbuku, "
                + " b.judul as judul, "
                + " b.penerbit as penerbit, "
                + " b.penulis as penulis, "
                + " k.idkategori as idkategori, "
                + " k.nama as nama, "
                + " k.keterangan as keterangan, "
                + " form buku as b, "
                + " left join kategori k on b.idkategori = k.idkategori");
        try {
            while (rs.next()) {
                Buku1841720175Fajar buku = new Buku1841720175Fajar();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setmIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setmNama(rs.getString("nama"));
                buku.getKategori().setmKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Buku1841720175Fajar> searchFajar(String keyword) {
        ArrayList<Buku1841720175Fajar> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720175Fajar.selectQuery("select "
                + " b.idbuku as idbuku, "
                + " b.judul as judul, "
                + " b.penerbit as penerbit, "
                + " b.peulis as penulis, "
                + " k.idkategori as idkategori, "
                + " k.nama as nama, "
                + " k.keterangan as keterangan, "
                + " form buku as b, "
                + " left join kategori k on b.idkategori = k.idkategori"
                + " where b.judul like '%" + keyword + "' "
                + " or b.penerbit like '%" + keyword + "' "
                + " or b.penulis like '%" + keyword + "' ");

        try {
            while (rs.next()) {
                Buku1841720175Fajar buku = new Buku1841720175Fajar();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setmIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setmNama(rs.getString("nama"));
                buku.getKategori().setmKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void saveFajar() {
        if (getByIdFajar(idBuku).getIdBuku() == 0) {
            String sql = "insert into buku (idkategori, judul, penerbit, penulis) values("
                    + " '" + this.getKategori().getmIdKategori() + "', "
                    + " '" + this.judul + "', "
                    + " '" + this.penerbit + "', "
                    + " '" + this.penulis + "' "
                    + " )";
            this.idBuku = DBHelper1841720175Fajar.insertQueryGetIdFajar(sql);
        } else {
            String sql = "update buku set "
                    + " idkategori = '" + this.getKategori().getmIdKategori() + "', "
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
