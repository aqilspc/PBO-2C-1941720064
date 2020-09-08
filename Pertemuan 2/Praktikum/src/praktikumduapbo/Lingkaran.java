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
public class Lingkaran {
    public double phi;
    public double r;
    
    public double hitungLuas(){
        r=10;
        phi =22/7;
        double hasil = r * r * phi;
        return hasil; 
    }
    
    public void tampilData(){
        System.out.println("Luas Lingkaran :"+" "+hitungLuas());
    }
}
