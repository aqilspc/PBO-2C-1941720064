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
public class Kabel  {  //utp
     private String merek;
     private String warna;
     private String serat;
     private String tipe;
     private int PanjangKabel;
     
     public void setMerek(String newValue) {
        merek = newValue;
    }
     
     public void setTipe(String newValue) {
        tipe = newValue;
    }

    public void setWarna(String newValues) {
        warna = newValues;
    }

    public void setSerat(String newValues) {
        serat = newValues;
    }
    

    public void tambahPanjangKabel(int increment) {
        PanjangKabel = PanjangKabel + increment;
    }

    
     public void cetakStatus() {
        System.out.println("\nMerek       : " + merek);
        System.out.println("Warna         : " + warna);
        System.out.println("Serat         : " + serat);
        System.out.println("Panjang Kabel : " + PanjangKabel+" "+"m");
        System.out.println("tipe          : " + serat);
    }
}
