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
public class inh {
    
    public static void main(String[] args) {
        
        staffTetap ST = new staffTetap("Budi", "Malang", "Laki laki", 20, 2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetap();

        staffHarian SH = new staffHarian("Indah", "Malang", "Perempuan", 27, 10000, 50000,100000, 100);
        SH.tampilStaffHarian();

    }
}
