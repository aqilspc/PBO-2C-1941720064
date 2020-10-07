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
public class persegiPanjang extends bangunDatar {
    public float panjang, lebar;
    
    public float luas(){
        float luas = panjang * lebar;
        return luas;
    }
    
    public float keliling(){
        float keliling = 2*panjang + 2*lebar;
        return keliling;
    }
}
