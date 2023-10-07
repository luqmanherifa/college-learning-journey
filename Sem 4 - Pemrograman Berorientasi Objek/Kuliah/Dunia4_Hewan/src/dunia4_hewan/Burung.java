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
public class Burung extends Hewan implements HewanPeliharaan {
    public void gantiPemilik(String nama){
        System.out.println("Ababa ini yang burung!");
    }
    
    public void rawat(){
        System.out.println("Slow saja punya burung.");
    }    
}
