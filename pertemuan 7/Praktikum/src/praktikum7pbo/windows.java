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
public class windows extends Laptop{
     public String fitur;

    windows(){

    }

    windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk,kecProsesor,sizeMemory,jnsProsesor,jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        System.out.println("============ WINDOWS ==========");
        super.tampilLaptop();
        System.out.println("Fitur\t\t: " + fitur );
    }
}
