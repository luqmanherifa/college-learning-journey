/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi4;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Responsi4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int tebak;
         int hasil;
         int dadu1;
         int dadu2;
         
        Scanner input = new Scanner(System.in);
        
            dadu1 = (int)(Math.random() *6+1);
            System.out.println("Hasil acak dadu pertama\t: " + dadu1);

            dadu2 = (int) (Math.random() *6+1);
            System.out.println("Hasil acak dadu kedua\t: " + dadu2);

            hasil = dadu1+dadu2;


            System.out.print("Input angka menebak hasil dadu\t: ");
            tebak = input.nextInt();
            
            if (tebak == hasil){
                System.out.println("BENAR"); }
            
            else { System.out.println("SALAH"); }

            System.out.println("Total hasil dadu = "+hasil);
    }
    
}
