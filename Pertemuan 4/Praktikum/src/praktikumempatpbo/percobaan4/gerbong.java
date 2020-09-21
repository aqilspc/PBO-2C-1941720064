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
public class gerbong {
   private String kode;
    private kursi[] arraykursi;

    public gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arraykursi = new kursi[jumlah];
        this.initKrusi();
    }
    
    private void initKrusi(){
        for (int i = 0; i < arraykursi.length; i++){
            this.arraykursi[i] = new kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }
    
    public void setpenumpang(penumpang penumpang, int nomor){
        if (String.valueOf(nomor) == null ? arraykursi[nomor - 1].getNomor()
           == null : String.valueOf(nomor).equals(arraykursi[nomor - 1].getNomor())) {
            System.out.println("kursi Sudah Dipesan");
        }
        else { 
            this.arraykursi[nomor - 1].setpenumpang(penumpang);
        } 
    }

    public void setArraykursi(kursi[] arraykursi) {
        this.arraykursi = arraykursi;
    }
    
    public String info(){
        String info = "";
        info += "Kode: " + kode + "\n";
        for(kursi kursi : arraykursi){
            info += kursi.info();
        }
        return info;
    }  
}
