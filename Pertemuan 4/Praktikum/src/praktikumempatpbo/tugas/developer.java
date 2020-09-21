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
public class developer {
    private int npwp;
    private String nama;

    public developer(int npwp, String nama) {
        this.npwp = npwp;
        this.nama = nama;
    }
    

    public void setNpwp(int npwp) {
        this.npwp = npwp;
    }
    
    public int getNpwp() {
        return npwp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "Profile Developer & DevOps\n";
        info += "Npwp: " + this.npwp + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    } 
}
