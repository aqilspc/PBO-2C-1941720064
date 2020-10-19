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
public class Pc extends Komputer{
     public int ukuranMonitor;

    Pc(){

    }

    Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk,kecProsesor,sizeMemory,jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor\t: " + ukuranMonitor);
    }
}
