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
public class main {
   public static void main(String[] args) {
        bangunDatar bangunDatar = new bangunDatar();
        
        persegiPanjang persegiPanjang = new persegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 5;
        
        lingkaran lingkaran = new lingkaran();
        lingkaran.r = 10;
        
        segitiga segitiga = new segitiga();
        segitiga.alas = 20;
        segitiga.tinggi = 15;
        
        bangunDatar.luas();
        System.out.println("Luas Persegi Panjang :" + persegiPanjang.luas());
        System.out.println("Luas Lingkaran       :" + lingkaran.luas());
        System.out.println("Luas Segitiga        :" + segitiga.luas());
        System.out.println("");
        bangunDatar.keliling();
        System.out.println("Keliling Persegi Panjang :" + persegiPanjang.keliling());
        System.out.println("Keliling Lingkaran       :" + lingkaran.keliling());
        System.out.println("Keliling Segitiga        :" + segitiga.keliling());
    } 
}
