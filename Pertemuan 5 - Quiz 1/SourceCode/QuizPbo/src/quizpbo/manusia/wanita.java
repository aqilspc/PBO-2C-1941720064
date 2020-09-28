/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpbo.manusia;

/**
 *
 * @author Aqil
 */
import java.util.Scanner;
public class wanita extends manusia{
   private String namaSuami;
   private String namaAnak;
   public void setNamaSuami(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Suami Anda :");
        String newValue = sc.next();
        namaSuami=newValue;
        System.out.println("Profil Wanita");
//        super.info();
    }
   
   public void setNamaAnak(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Anak Anda :");
        String newValue = sc.next();
        namaAnak=newValue;
//        System.out.println("Profil Wanita");
        super.info();
    }
    
    public void infoWanita(){
        System.out.println("Profil Wanita");
        super.info();
        if(super.getDewasaWanita() == true){
         System.out.println("Wanita sudah dewasa harus punya suami");
        setNamaSuami();
        setNamaAnak();
        System.out.println("Nama Suami: " + namaSuami);
        System.out.println("Nama Anak: " + namaAnak);
        }else{
        System.out.println("Wanita ini masih kuliah");
        }
    }
}
