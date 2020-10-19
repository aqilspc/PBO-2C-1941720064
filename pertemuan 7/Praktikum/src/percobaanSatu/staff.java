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
public class staff extends karywan{
    public int lembur, potongan;

    staff(){

    }

    staff(String nama, String alamat, int umur, String jk, int gaji){
        super(nama,alamat,jk,umur,gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaff() {
        super.tampilDataKaryawan();
        System.out.println("Lembur\t\t: " + lembur);
        System.out.println("Potongan\t: " + potongan);
        System.out.println("Total Gaji\t: " +(gaji+lembur-potongan));
    }
}
