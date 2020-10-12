/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakikum6pbo.tugas;

/**
 *
 * @author Aqil
 */
public class pegawai {
     public String nip, nama, alamat;

    public Pegawai() {

    }

    public Pegawai(String nama, String nip, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return 3000000;
    }
}
