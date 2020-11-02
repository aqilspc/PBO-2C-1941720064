/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Aqil
 */
public class MainManusia {
     public static void main(String[] args) {
        Manusia man = new Manusia();
        Dosen dos = new Dosen();
        Mahsiswa mah = new Mahsiswa();
        System.out.println("KURANG JAGO MANUSIA");
        man.makan();
        man.bernafas();
        System.out.println("KURANG JAGO DOSEN");
        man = dos;
        man.makan();
        dos.lembur();
        System.out.println("KURANG JAGO MAHASISWA");
        man = mah;
        man.makan();
        mah.tidur();
    }
}
