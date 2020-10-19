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
public class Mac extends Laptop{
     public String security;

    Mac(){

    }

    Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security){
        super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBatrei);
        this.security = security;
    }

    public void tampilMac() {
        System.out.println("======== MACBOOK ===========");
        super.tampilLaptop();
        System.out.println("Keamanan\t: " + security);
    }
}
