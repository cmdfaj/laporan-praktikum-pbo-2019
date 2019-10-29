/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author farfaraway
 */
public class Mahasiswa1841720175Fajar implements ICumlaude{
    protected String nama;

    public Mahasiswa1841720175Fajar(String nama) {
        this.nama = nama;
    }
    public void kuliahDiKampus(){
        System.out.println("Aku mahsiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku biasa-biasa saja");
    }
}
