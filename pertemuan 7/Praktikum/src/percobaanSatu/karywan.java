/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaanSatu;

/**
 *
 * @author Aqil
 */
public class karywan {
    public String nama, alamat, jk;
    public int umur,gaji;
    
    karywan(){

    }

    karywan(String nama, String alamat,String jk, int umur,  int gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
        this.gaji = gaji;
    }

    public void tampilDataKaryawan() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Jenis Kelamin\t: " + jk);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Gaji\t\t: " + gaji);
    }
}
