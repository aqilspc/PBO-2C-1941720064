/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaanDua;

/**
 *
 * @author Aqil
 */
public class staffHarian extends staff{
     public int jmlJamKerja;

    staffHarian(){

    }

    staffHarian(String nama, String alamat, String jk,int umur, int gaji, int lembur, int potongan, int jmlJamKerja){
        super(nama,alamat,jk,umur,gaji,potongan,lembur);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilStaffHarian() {
        System.out.println("=============Data Staff Harian===========");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja : " + jmlJamKerja);
        System.out.println("Gaji Bersih\t: " + (gaji*jmlJamKerja+lembur-potongan));
    }
}
