/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Aqil
 */
public class Keledai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    
    @Override
    public void displayMakan() {
        System.out.println("Jenis       : Herbivora");
        System.out.println("Makanan     : Tumbuhan");
    }
    @Override
    public void displayBinatang() {
        
    }

    public void displayData(){
        super.displayBinatang();
        this.displayMakan();
        System.out.println("Suara       : "+this.suara);
        System.out.println("Warna Bulu  : "+this.warnaBulu);
        System.out.println("---------------------------------------------");
    }   
}