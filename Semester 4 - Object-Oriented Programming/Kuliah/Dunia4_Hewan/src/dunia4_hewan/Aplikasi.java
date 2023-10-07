/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia4_hewan;

/**
 *
 * @author Kyrin
 */
public class Aplikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hewan hewhew = new Hewan();
        hewhew.setMakanan("Sempol");
        System.out.println("Makanannya adalah "+hewhew.getMakanan());
        
        Kucing kuckuc = new Kucing();
        kuckuc.setMakanan("Sate");
        System.out.println("Kucingnya makan "+kuckuc.getMakanan());
        */
        
        Hewan k = new Kucing();
        k.gantiPemilik("Nyaman");
        
        Burung b = new Burung();
        b.gantiPemilik("Auto");
    }
    
}