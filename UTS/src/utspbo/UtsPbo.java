/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author Aqil
 */
public class UtsPbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       topeng topeng= new topeng("Malang = ", "Topeng Malangan", new ornamen(200000));
        topeng.buatKerajinan();
        System.out.println("Nama Kerajinan = " + topeng.nama);
        System.out.println("Asal = " + topeng.asal);
        System.out.println("Harga untuk membuat = " + topeng.harga);
        topeng.perbaikiKerajinan();
        System.out.println("Harga untuk memperbaiki = " + topeng.harga);
        System.out.println("Harga Ornamen = " + topeng.ornamen.harga );
    }
    
}
