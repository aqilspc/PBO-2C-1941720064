/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumempatpbo.tugas;

/**
 *
 * @author Aqil
 */
public class main {
    public static void main(String[] args){
            developer m = new developer(95948830, "Abdulloh Aqil");
            startup d = new startup(91200009, "Intermediatechonlogy Corporation");
            proyek r = new proyek("SIAKAD UMM");
            client v = new client("Jl. Bendungan Sutami No.188, Sumbersari, Kec. Lowokwaru, Kota Malang, Jawa Timur 65145"
                    , "Prof. Dr. Yus Mochammad Cholily, M.Si");
            v.setstartup(d);
            v.setdeveloper(m);
            v.setproyek(r);
            v.info();
    }
}
