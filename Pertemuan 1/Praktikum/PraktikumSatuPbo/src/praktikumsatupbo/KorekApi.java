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
public class KorekApi {
     private String merek;
     private String warna;
     private int pematik;
     private int gasBensol;
     
     public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValues) {
        warna = newValues;
    }


    public void tambahPematik(int increment) {
        pematik = pematik + increment;
    }

    public void tambahGas(int increment) {
        gasBensol = gasBensol + increment;
    }
    
    public void kurangPematik(int decrement) {
        pematik = pematik - decrement;
    }

    public void kurangGas(int decrement) {
        gasBensol = gasBensol - decrement;
    }
    
     public void cetakStatus() {
        System.out.println("\nMerek              : " + merek);
        System.out.println("Warna                : " + warna);
        System.out.println("Gas                  : " + gasBensol+" "+"gr");
        System.out.println("Level Pematik        : " + pematik);
        System.out.println("Warna                : " + warna);
    }
}
