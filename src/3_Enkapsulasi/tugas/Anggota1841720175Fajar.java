package tugas;

public class Anggota1841720175Fajar {

    private String noKtp, nama;
    private int limitPinjaman, jumlahPinjaman, pinjam, angsur;

    public int getAngsur() {
        return angsur;
    }

    public void setAngsur(int newAngsur) {

        if (newAngsur < jumlahPinjaman/10) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            this.angsur = 0;
        } else {
            this.angsur = newAngsur;
        }
    }

    public int getPinjam() {
        return pinjam;
    }

    public void setPinjam(int newPinjam) {
        this.pinjam = newPinjam;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String newNoKtp) {
        this.noKtp = newNoKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void setLimitPinjaman(int limitPinjaman) {
        this.limitPinjaman = limitPinjaman;
    }

    public int getJumlahPinjaman() {
        if (pinjam > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjaman = pinjam - angsur;
            pinjam = jumlahPinjaman;
        }
        return jumlahPinjaman;
    }

    public void setJumlahPinjaman(int newJumlahPinjaman) {
        this.jumlahPinjaman = newJumlahPinjaman;
    }

    public Anggota1841720175Fajar() {
    }

    public Anggota1841720175Fajar(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

}
