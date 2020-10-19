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
public class topeng extends kerajinan{
 public ornamen ornamen;

    topeng(String asal, String namaKerajinan, ornamen ornamen){
        this.asal = asal;
        this.nama = namaKerajinan;
        this.ornamen = ornamen;
    }

    public void buatKerajinan() {
        super.buatKerajinan();
        float harga1 = super.harga;
        super.perbaikiKerajinan();
        float harga2 = super.harga;
        super.harga = harga1+harga2;
    }
}
