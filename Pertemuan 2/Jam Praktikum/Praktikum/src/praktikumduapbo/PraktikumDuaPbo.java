/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumduapbo;

/**
 *
 * @author Aqil
 */
public class PraktikumDuaPbo {
    public int id;
    public String NamaGame;
    public int BasicPrice;
    public String NamaMember;
    /**
     * @param args the command line arguments
     */
    
    public int cekTotalBayar(int lamapinjam) {
      int total = lamapinjam*BasicPrice;
        return total;
    }
    public void setdataSewa(){
        id=1105;
        NamaGame="PES2020";
        BasicPrice =16000;
        int lama=7;
        System.out.println("Total yang harus dibayarkan sewa Rp."+" "+cekTotalBayar(lama));
    }
    
    
}
