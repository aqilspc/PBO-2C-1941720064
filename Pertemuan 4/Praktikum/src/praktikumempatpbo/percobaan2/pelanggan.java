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
public class pelanggan {
        private String nama;
    private mobil mobil;
    private sopir sopir;
    private int hari;

    public pelanggan() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setmobil(mobil mobil) {
        this.mobil = mobil;
    }

    public mobil getmobil() {
        return mobil;
    }

    public void setsopir(sopir sopir) {
        this.sopir = sopir;
    }

    public sopir getsopir() {
        return sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHari() {
        return hari;
    }
    
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayasopir(hari);
    }
}
