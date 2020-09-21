/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumempatpbo.percobaan3;

/**
 *
 * @author Aqil
 */
public class main1 {
     public static void main(String[] args){
        pegawai masinis = new pegawai("1234", "Abdulloh Aqil");
        keretaApi keretaApi = new keretaApi("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.info());
    }
}
