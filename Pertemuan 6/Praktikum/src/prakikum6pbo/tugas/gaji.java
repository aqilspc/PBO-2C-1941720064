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
public class gaji {
     pegawai listpegawai[];

    public gaji(int jumlah) {
        this.listpegawai = new pegawai[jumlah];
    }

    public void addpegawai(pegawai pegawai) {
        for (int i = 0; i < listpegawai.length; i++) {
            if (listpegawai[i] == null) {
                this.listpegawai[i] = pegawai;
                break;
            }
        }
    }

    public void info() {
        System.out.println("Daftar pegawai");
        for (int i = 0; i < listpegawai.length; i++) {
            if (listpegawai[i] == null) {
                break;
            } else {
                System.out.println("Nama   : " + listpegawai[i].nama);
                System.out.println("Nip    : " + listpegawai[i].nip);
                System.out.println("Alamat : " + listpegawai[i].alamat);
                System.out.println("Gaji   : " + listpegawai[i].getGaji());
                System.out.println("====================================");
            }
        }
    }
}
