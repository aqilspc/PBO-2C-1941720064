/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumempatpbo.percobaan2;

/**
 *
 * @author Aqil
 */
public class main {
     public static void main(String[] args){
        
        mobil m = new mobil();
        m.setNama("Avanza");
        m.setBiaya(350000);
        
        sopir s = new sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);
        
        pelanggan pg = new pelanggan();
        pg.setNama("Jane Doe");
        pg.setmobil(m);
        pg.setsopir(s);
        pg.setHari(2);
        System.out.println("Biaya Total = " + pg.hitungBiayaTotal());
        System.out.println(pg.getmobil().getNama());
    }
}
