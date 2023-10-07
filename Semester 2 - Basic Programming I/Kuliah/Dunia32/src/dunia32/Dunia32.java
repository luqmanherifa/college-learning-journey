/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia32;

/**
 *
 * @author Kyrin
 */
public class Dunia32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int akhir = 10;
        int awal = 0;
        int a = 0;
        
        for (int x=1; x<=5; x++) {
            if (x%2 != 0) {
                awal = awal + 1;
                for (a=awal; a<=akhir; a++) {
                    System.out.print(a+" ");
                
                }
                
                System.out.println("");
            
            } else {
                awal = a + 9;
                for (a=awal; a>akhir; a--) {
                    System.out.print(a+" ");
                }
                akhir = awal + 10;
                System.out.println("");
            }
        }
        
    }
    
}
