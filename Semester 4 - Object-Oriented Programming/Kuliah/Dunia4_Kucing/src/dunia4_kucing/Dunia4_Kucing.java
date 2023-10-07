/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia4_kucing;

/**
 *
 * @author Kyrin
 */
public class Dunia4_Kucing {
    
    public static void main(String[] args) {
        
        Kucing anu = new Kucing("Alien");
        anu.namaKucing = "Thonas";
        anu.setWarnaBulu("Biru");
        anu.beratKucing = 80;
        anu.umurKucing = 22;
                
        Kucing itu = new Kucing("Anggora");
        itu.namaKucing = "Natasha";
        itu.setWarnaBulu("Putih");
        itu.beratKucing = 12;
        itu.umurKucing = 5;
        
        System.out.println("---------");
        anu.mainBersama("Tony", 42, true);
        anu.memandikanKucing("Hulk", 11);
        anu.menguburKucing("Orang", 13);
        anu.temanKucing(itu);
        
        anu.setWarnaBulu("aaa");

        
    }
    
}
