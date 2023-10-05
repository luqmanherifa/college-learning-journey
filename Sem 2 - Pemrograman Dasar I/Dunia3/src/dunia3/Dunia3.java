/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3;

/**
 *
 * @author Kyrin
 */

import java.util.Scanner;

public class Dunia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1.Input Rupiah ke Dollar");
        System.out.println("2.Input Dollar ke Rupiah");
        System.out.println("=====");
        
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        
    if (choose == 1) {
      
        float rupiah, dollar;
        
        System.out.print("Input Rupiah: ");
        
        rupiah = input.nextFloat();
        dollar = (float) (rupiah*0.0001);
        
        System.out.println("Dollar  = " + dollar);
    
    } else if (choose == 2) {
        
        float rupiah, dollar;
        
        System.out.print("Input Dollar: ");
        
        dollar = input.nextFloat();
        rupiah = (float) (dollar*10000);
        
        System.out.println("Rupiah  = " + rupiah);
        
        }    
    }
    
}
