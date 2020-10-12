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
public class dosen extends pegawai {
     public int jumlahSKS, TarifSKS = 100000;

    public dosen() {

    }

    public dosen(String nama, String nip, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public int getGaji() {
        int totalGaji = jumlahSKS * TarifSKS;
        return totalGaji + super.getGaji();
    }
}
