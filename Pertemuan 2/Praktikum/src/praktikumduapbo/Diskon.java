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
public class Diskon {
    public String kode="MK-9512HND";
    public String namaBarang="Mikrotik RouterBoard rb951-2hnd";
    public int hargaDasar;
    public float diskon=4;
    
    public int hitungHargaJual(){
//        diskon = 2/100;
        hargaDasar=120000;
        int hargaJual = (int) (hargaDasar-(diskon * hargaDasar/100));
        int total = hargaDasar - hargaJual;
        return hargaJual;
    }
    
    public void tampilData(){
//        int harga = 12000;
        System.out.println("Nama Barang :"+" "+namaBarang);
        System.out.println("Kode Barang :"+" "+kode);
        System.out.println("Harga Dasar :"+" "+hargaDasar);
        System.out.println("Harga Jual barang ini adalah :"+" "+hitungHargaJual());
        System.out.println("Diskon : "+diskon+"%");
    }
}
