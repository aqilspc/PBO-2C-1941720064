/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumempatpbo.percobaan4;

/**
 *
 * @author Aqil
 */
public class main {
    public static void main(String[] args){
        penumpang p = new penumpang("12345", "Oke FFF");
        penumpang p2 = new penumpang("67890", "BudiA");
        gerbong gerbong = new gerbong("A", 10);
        gerbong.setpenumpang(p, 1);
        gerbong.setpenumpang(p2, 1);
//        penumpang p1 = new penumpang("454545", "Oke M");
//        penumpang p3 = new penumpang("543424", "Budi C");
//        gerbong gerbong1 = new gerbong("A", 20);
//        gerbong1.setpenumpang(p1, 1);
//        gerbong1.setpenumpang(p3, 1);
        System.out.println(gerbong.info());
//        System.out.println(gerbong1.info());
    } 
}
