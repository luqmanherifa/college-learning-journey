/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucing;

/**
 *
 * @author Kyrin
 */
public class Menu_Kucing {
    
    String namaKucing;
    String jenisKucing;
    String warnaBulu;
    int tahunLahir;
    
    public Menu_Kucing() {
        System.out.println("Mungkin save berhasil.");
    }
    
    public Menu_Kucing(String namaKc, String jenisKc, String warnaKc, int tahunKc) {
        namaKucing = namaKc;
        jenisKucing = warnaKc;
        warnaBulu = warnaKc;
        tahunLahir = tahunKc;
    }    
    
}
