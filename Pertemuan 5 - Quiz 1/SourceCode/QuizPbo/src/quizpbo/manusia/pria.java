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
public class pria extends manusia {
    private String namaIstri;
    public void setNamaIstri(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Istri Anda :");
        String newValue = sc.next();
        namaIstri=newValue;
        System.out.println("Profil Pria");
        super.info();
    }
    
    public void infoPria(){
        System.out.println("Profil Pria");
        super.info();
        if(super.getDewasaPria() == true){
        System.out.println("Harus punya istri");
        setNamaIstri();
        System.out.println("Nama Istri: " + namaIstri);
        }else{
            System.out.println("Pria ini masih kuliah");
        }
    }
}
