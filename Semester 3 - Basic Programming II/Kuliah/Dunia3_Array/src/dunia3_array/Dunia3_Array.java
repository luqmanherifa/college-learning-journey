/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_array;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] buah = new String[5];
        
        Scanner input = new Scanner (System.in);
        
        for (int i=0; i<buah.length; i++) {
                System.out.print("Buah ke-"+i+": ");
                buah[i] = input.nextLine();
            }
        
        for (int i=0; i<buah.length; i++) {
                System.out.println(buah[i]);
            }

    }
    
}
