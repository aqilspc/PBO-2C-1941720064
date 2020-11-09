/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan;

/**
 *
 * @author Aqil
 */

import pertemuan.ICumlaude;
import pertemuan.Mahasiswa;
import pertemuan.PascaSarjana;
import pertemuan.Rektor;
import pertemuan.Sarjana;
public class interfacemain {
    
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Rega");
        Sarjana SarjanaCumlaude = new Sarjana("Rifkie");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakrektor.beriSertifikatCumlaude(SarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
    
}

