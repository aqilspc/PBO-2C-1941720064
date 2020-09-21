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
public class startup {
     private int nib;
    private String nama;

    public startup(int nib, String nama) {
        this.nib = nib;
        this.nama = nama;
    }

    public void setNib(int nib) {
        this.nib = nib;
    }
    
    public int getNib() {
        return nib;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "Nomor Induk Usaha: " + this.nib + "\n";
        info += "Nama Statup: " + this.nama + "\n";
        return info;
    }
}
