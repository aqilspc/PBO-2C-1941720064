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
public class client {
    private String alamat;
    private String nama;
    private developer developer;
    private startup startup;
    private proyek proyek;

    public client(String alamat, String nama) {
        this.alamat = alamat;
        this.nama = nama;
    }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public developer getdeveloper() {
        return developer;
    }

    public void setdeveloper(developer developer) {
        this.developer = developer;
    }

    public startup getstartup() {
        return startup;
    }

    public void setstartup(startup startup) {
        this.startup = startup;
    }

    public proyek getproyek() {
        return proyek;
    }

    public void setproyek(proyek proyek) {
        this.proyek = proyek;
    }
    
    public void info(){
        System.out.println("Nama Client: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Proyek: " + this.proyek.info());
        System.out.println("startup: " + this.startup.info());
        System.out.println("developer: " + this.developer.info());
    }
}
