/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6pbo;

/**
 *
 * @author Aqil
 */
public class segitiga extends bangunDatar {
    public float alas, tinggi;
    
    public float luas(){
        float luas =alas * tinggi / 2;
        return luas;
    }
    
    public float keliling(){
        float sisi = (float) ((Math.pow(tinggi,2)) -  (Math.pow(1/2*alas,2)));
        float keliling = sisi + sisi + alas;
        return keliling;
    }
}
