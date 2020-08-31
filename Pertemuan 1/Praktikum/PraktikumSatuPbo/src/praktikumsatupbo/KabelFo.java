/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumsatupbo;

/**
 *
 * @author Aqil
 */
public class KabelFo extends Kabel {
     private String tipeKabel;
    
    public void setTipeKabel (String newValue){
        tipeKabel = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Kabel: " + tipeKabel);
    }
}
