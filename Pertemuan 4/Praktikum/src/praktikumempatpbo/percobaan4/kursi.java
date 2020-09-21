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
public class kursi {
   private String nomor;
    private penumpang penumpang;

    public kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setpenumpang(penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public penumpang getpenumpang() {
        return penumpang;
    }
    
    public String info(){
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null){
            info += "penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }  
}
