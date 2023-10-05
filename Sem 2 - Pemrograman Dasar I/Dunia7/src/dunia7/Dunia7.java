/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia7;

/**
 *
 * @author Kyrin
 */

import java.util.Scanner;

public class Dunia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
         System.out.println("Luas Alas × Tinggi");
         System.out.println("Rumus A = π × r2 × tinggi");
            double A;
            System.out.print("Input π (3,14): ");
            double pi = input.nextDouble();
            System.out.print("Input r: ");
            double r = input.nextDouble();
            System.out.print("Input Tinggi: ");
            double tinggi = input.nextDouble();
            
            A = (pi*r*r)*tinggi;
            System.out.println("Hasil: " + A);
    }
    
}
