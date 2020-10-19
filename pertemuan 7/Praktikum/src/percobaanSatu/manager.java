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
public class manager extends karywan{
    public int tunjangan;

    manager(){

    }

    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan\t: " + tunjangan);
        System.out.println("Total Gaji\t: " + (super.gaji+tunjangan));
    }
}
