/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpbo.manusia;

/**
 *
 * @author Aqil
 */
public class main {
     public static void main(String[] args) {
        pria p = new pria();
        wanita w = new wanita();

        // priaa
    System.out.println("Contoh Pria dan wanita belum dewasa");
     p.setUmur(20);
      p.setNama("Abdulloh Aqil");
       p.infoPria();
       System.out.println("");
         
        //wanita
       w.setUmur(19);
       w.setNama("Shella Mega Amalia");
       w.infoWanita();
        
        
        //paarmeter
        p.setData(22,"Shiva");
        p.infoPria();
        
        //paarmeter
        w.setData(25,"Cantika");
        w.infoWanita();
         // priaa
//         System.out.println("Contoh Pria dan wanita sudah dewasa");
//        p.setUmur(23);
//        p.setNama("Abdul Muchidin SE");
//        p.infoPria();
//         System.out.println("");
//         
//        //wanita
//        w.setUmur(24);
//        w.setNama("Ucik Nurul Hidayati");
//        w.infoWanita();

    }
}
