/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia35;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int angka;
      
      do {
        System.out.print("Input Angka\t: ");
        angka = input.nextInt();
            if (angka==1000) {
                    break;
                }
        
            if (angka == 100) {
                 System.out.println("\t\t> SEMPURNA"); } 
                 
            else if (angka >= 56) {
                 System.out.println("\t\t> LULUS"); }
            
            else if (angka == 0) {
                 System.out.println("\t\t> PARAH"); }
        
            else if (angka < 56) {
                 System.out.println("\t\t> GAGAL"); }
       
      }
      while(!(angka==1000));         
    }
}