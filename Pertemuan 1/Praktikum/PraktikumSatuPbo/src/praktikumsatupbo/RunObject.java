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
public class RunObject {
    public static void main(String[] args) {
        KorekApi korek = new KorekApi();
        GelasKaca Gk = new GelasKaca();
        Kabel kb = new Kabel();
        KabelFo kbfo = new KabelFo();

        // korek api
        korek.setMerek("Indomaret");
        korek.setWarna("Merah");
        korek.tambahPematik(2);
        korek.tambahGas(12);
        korek.kurangGas(9);
        korek.cetakStatus();

        //Gelas Kaca
        Gk.setWarna("Kuning");
        Gk.tambahDiamterKaca(10);
        Gk.tambahPanjangGangang(2);
        Gk.cetakStatus();

        //kabel awal
        kb.setMerek("Zimiilink");
        kb.setWarna("Hijau");
        kb.setSerat("Tembaga");
        kb.tambahPanjangKabel(7);
        kb.setTipe("UTP");
        kb.cetakStatus();
        
        //kabel turunan
        kbfo.setMerek("Precon");
        kbfo.setWarna("Hitam");
        kbfo.setSerat("Serat Kaca");
        kbfo.tambahPanjangKabel(7);
        kbfo.setTipeKabel("Fiber Optic");
        kbfo.cetakStatus();
    }
}
