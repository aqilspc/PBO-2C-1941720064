/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumempatpbo.tugas;

/**
 *
 * @author Aqil
 */
public class proyek {
    private String nama;

    public proyek(String nama) {
        this.nama = nama;
    }
    

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "" + this.nama + "\n";
        return info;
    } 
}
