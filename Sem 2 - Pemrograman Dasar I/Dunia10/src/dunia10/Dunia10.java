/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia10;

/**
 *
 * @author Kyrin
 */

import java.util.Scanner;

public class Dunia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //menu makanan
        System.out.println("Menu Makanan");
        System.out.println("1. Mie Goreng\t 4000");
        System.out.println("2. Mie Rebus\t 4500");
        System.out.println("3. Mie Telur\t 6000");
        System.out.println("======");
        
        //scanner
        Scanner input = new Scanner(System.in);
      
        //input
            System.out.print("Harga barang\t: ");
            int a = input.nextInt();
            
            System.out.print("Jumlah beli\t: ");
            int b = input.nextInt();
            
            System.out.print("Diskon (%)\t: ");
            int c = input.nextInt();
            
        //rumus
            int x = a*b;
            int y = x*c/100;
            int z = x-y;
        
        //total dan pembayaran
            System.out.println("Total\t\t: "+z);
            System.out.println("======"); 
        
            System.out.print("Jumlah pembayaran : ");
            int o = input.nextInt();
            
            int p = o-z; 
            System.out.println("Uang kembalian    : "+p); 
        
        
}
}
