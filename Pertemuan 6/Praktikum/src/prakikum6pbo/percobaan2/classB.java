/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakikum6pbo.percobaan2;

/**
 *
 * @author Aqil
 */
public class classB extends classA {
    private int z;
    
    public void setZ(int z){
        this.z = z;
    }
    
    public void getNilaiZ(){
        System.out.println("nilai Z:" + z);
    }
    
    public void getJumlah(){
        System.out.println("jumlah:" + (super.getX()+super.getY()+z));
    }
}