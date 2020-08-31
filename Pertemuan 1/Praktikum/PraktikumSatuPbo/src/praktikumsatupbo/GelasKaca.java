/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumsatupbo;

/**
 *
 * @author Aqil
 */
public class GelasKaca {
     private int kaca;
     private String warna;
     private int gangang;
     
    public void setWarna(String newValues) {
        warna = newValues;
    }

    public void tambahDiamterKaca(int increment) {
        kaca = increment+increment;
    }
    

    public void tambahPanjangGangang(int increment) {
        gangang = gangang + increment;
    }

    
     public void cetakStatus() {
        System.out.println("Warna           : " + warna);
        System.out.println("Diameter Kaca   : " + kaca+" "+"mm");
        System.out.println("Panjang Gangang : " + gangang+""+"mm");
    }
}
