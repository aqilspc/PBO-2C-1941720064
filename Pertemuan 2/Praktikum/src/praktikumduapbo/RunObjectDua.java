/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumduapbo;

/**
 *
 * @author Aqil
 */
public class RunObjectDua {
    public static void main(String[] args) {
        PraktikumDuaPbo sewa = new PraktikumDuaPbo();
        Lingkaran lkr = new Lingkaran();
        Diskon dk = new Diskon();
        sewa.setdataSewa();
        lkr.tampilData();
        dk.tampilData();
    }
}
