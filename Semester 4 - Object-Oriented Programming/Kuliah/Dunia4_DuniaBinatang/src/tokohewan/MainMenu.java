/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokohewan;

/**
 *
 * @author Kyrin
 */
public class MainMenu {
    
    public static void main(String[] args) {
        
        MenuBinatang bin = new MenuBinatang();
        MenuKucing koceng = new MenuKucing();
        MenuIkan ikn = new MenuIkan();
        
        koceng.makan("Whiskas");
    
    }
}
