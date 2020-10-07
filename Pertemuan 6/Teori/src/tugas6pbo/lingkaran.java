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
public class lingkaran extends bangunDatar {
     public float r;
    
    public float luas(){
        float luas = (float) (Math.PI * r * r);
        return luas;
    }
    
    public float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        return keliling;
    }
}
