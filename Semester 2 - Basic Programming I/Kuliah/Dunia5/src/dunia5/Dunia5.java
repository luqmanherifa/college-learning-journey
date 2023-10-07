/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia5;

/**
 *
 * @author Kyrin
 */

import java.util.Scanner;

public class Dunia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //nama program
        System.out.println("Program Penjumlahan");
        System.out.println("======");
        
        //scanner
        Scanner input = new Scanner(System.in);
        
        //deklarasi
        System.out.print("Input Nilai a: ");
        int a = input.nextInt();
        System.out.print("Input Nilai b: ");
        int b = input.nextInt();
        
        //rumus
        int c = a + b;
        
        //output
        System.out.println(a + " + " + b + " = " + c);
    }
    
}
