/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi1;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Responsi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int a;
            int b;
            int c;
        
            Scanner input = new Scanner(System.in); 
            System.out.print("Input tebak total angka dadu\t: ");
            a = input.nextInt();
        
            //Dadu pertama, dari angka 1 sampai 12
            System.out.println("Angka random dari dadu pertama\t: " + (int)(Math.random() * 12));
            
            //Dadu kedua, dari angka 1 sampai 12
            System.out.println("Angka random dari dadu kedua\t: " + (int)(Math.random() * 12));
      
    }  
}