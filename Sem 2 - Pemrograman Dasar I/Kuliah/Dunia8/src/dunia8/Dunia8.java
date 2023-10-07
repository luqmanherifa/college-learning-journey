/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia8;

/**
 *
 * @author Kyrin
 */

import java.util.Scanner;

public class Dunia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Masukkan Nilai: ");
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
                 if (a == 100) {
                 System.out.println("EXCELLENT!");
        
        } else { if (a >= 56) {
                 System.out.println("LULUS");
            
        } else { if (a == 0) {
                 System.out.println("LOOSER!");
        
        } else { if (a < 56) {
                 System.out.println("GAGAL");
        }
           
        }
    
        }
        
        }
        
    }
}