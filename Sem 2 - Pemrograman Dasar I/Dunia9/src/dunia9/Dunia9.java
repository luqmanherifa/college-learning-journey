/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia9;

/**
 *
 * @author Kyrin
 */

public class Dunia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //tugas
        System.out.println("5 Buku + 2 Spidol = 26000");
        System.out.println("3 Buku + 4 Spidol = 38000");
       
        //deklarasi
        int a = (5 * 4) - (2 * 3);
        int x = (4 * 26000) - (2 * 38000); 
        int y = (5 * 38000) - (3 * 26000);
        
        //rumus
        int b = x/a;
        int s = y/a;
        
        //output
        System.out.println("1 Buku = "+b);
        System.out.println("1 Spidol = "+s);   
    }
    
}
