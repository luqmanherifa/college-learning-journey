/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia6;

/**
 *
 * @author Kyrin
 */

import java.util.Scanner;

public class Dunia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //program
        System.out.println("1. Luas Lingkaran (Radius)");
        System.out.println("2. Luas Lingkaran (Diameter)");
        System.out.println("3. Luas Lingkaran (Keliling)");
        System.out.println("======");
        
        //scanner
        Scanner input = new Scanner(System.in);
        int chooseone = input.nextInt();
        
        if (chooseone == 1) {
            System.out.println("Rumus Radius: A = π × r2");
            double A;
            System.out.print("Input π (3,14): ");
            double pi = input.nextDouble();
            System.out.print("Input r: ");
            double r = input.nextDouble();
            
            A = pi*(r*r);
            System.out.println(pi + " x (" + r + " x " + r + ") = " + A);
            
        } else if (chooseone == 2) {
            System.out.println("Rumus Diameter: A = (π/4) × D2");
            double A;
            System.out.print("Input π (3,14): ");
            double pi = input.nextDouble();
            System.out.print("Input D: ");
            double d = input.nextDouble();
            
            A = (pi/4)*(d*d);
            System.out.println("Hasil= " + A);
            
        } else if (chooseone == 3) {
            System.out.println("Rumus Keliling: A = C2 / 4 × π");
            double A;
            System.out.print("Input C: ");
            double c = input.nextDouble();
            System.out.print("Input π (3,14): ");
            double pi = input.nextDouble();
            
            A = (c*c)/(4*pi);
            System.out.println("Hasil= " + A);
    }
 
}
}
