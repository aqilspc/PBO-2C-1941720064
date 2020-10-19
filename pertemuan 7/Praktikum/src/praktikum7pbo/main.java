/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7pbo;

/**
 *
 * @author Aqil
 */
public class main {
   public static void main(String[] args) {
        Mac mac = new Mac("Macbook Pro 2020", 3 , 8, "i5-M78s", "Li-on", "Smadav");
        mac.tampilMac();

        windows wd = new windows("SUSA", 3, 16, "i9-10900HK", "Li-On", "Hack with TERMUX");
        wd.tampilWindows();
    } 
}
