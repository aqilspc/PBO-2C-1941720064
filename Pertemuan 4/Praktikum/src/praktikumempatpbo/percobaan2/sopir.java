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
public class sopir {
    private String nama;
    private int biaya;

    public sopir() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }
    
    public int hitungBiayasopir(int hari){
        return biaya * hari;
    }
}
