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
public class Kucing extends Hewan implements HewanPeliharaan {
    public void setMakanan(String makanan) {
        
        if(makanan.equals("Jagung")) {
            System.out.println("ERROR: Kalo ini salah lur!");
        } else {
            super.setMakanan(makanan);
        }
    }
    
    public void gantiPemilik(String nama){
        System.out.println("Terserah dah ini yang kucing!");
    }
    
    public void rawat(){
        System.out.println("Pokoknya dah ini yang kucing.");
    }
    
}