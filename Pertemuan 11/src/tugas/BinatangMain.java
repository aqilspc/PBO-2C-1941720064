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
import tugas.Binatang;
import tugas.Gorila;
import tugas.Keledai;
import tugas.Singa;

public class BinatangMain {

    public static void main(String[] args) {
        Singa singa = new Singa("Raja", 4, "gaoon-gaoon, aum-aum", "Loreng");      
        singa.displayData();
        
        Keledai keledai = new Keledai("Petty", 4, "I-ah-ia-ah, I-oh-I-oh", "Coklat");
        keledai.displayData();
        
        Gorila gorilla = new Gorila("Bombom", 4, "khherr-khhherr","Hitam");
        gorilla.displayData();
    }
}
