/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia4;

/**
 *
 * @author Kyrin
 */

import java.util.Scanner;

public class Dunia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Byte: \t");
        byte b = input.nextByte();
        System.out.print("Input Integer: \t");
        int i = input.nextInt();
        System.out.print("Input Float: \t");
        float f = input.nextFloat();
        System.out.print("Input Double: \t");
        double d = input.nextDouble();
        System.out.print("Input Char: \t");
        char c = input.next().charAt(0);
        
        System.out.println("Byte: \t\t"+b);
        System.out.println("Integer: \t"+i);
        System.out.println("Float: \t\t"+f);
        System.out.println("Double: \t"+d);
        System.out.println("Char: \t\t"+c);
    }
 
}
