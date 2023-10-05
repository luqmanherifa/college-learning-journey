/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia16;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        int l = 1;
        
        System.out.print("Input x = ");
        int a = input.nextInt();
        System.out.print("Input y = ");
        int b = input.nextInt();
       
            for (int i = 1; i <= b; i++) 
        {
            l = l*a;
        }
        System.out.println("Hasil = "+l);
        
}        
}