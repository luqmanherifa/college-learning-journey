/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia44;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia44 {

    /**
     * @param args the command line arguments
     */
    
    static void threetype (String a, int b, String c)
        {
            System.out.println("Nama\t: "+a);
            System.out.println("NRP\t: "+b);
            System.out.println("Kelas\t: "+c);
        }
    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Scanner inp2 = new Scanner(System.in);

            int nrp;
            String nama, kelas;
        
            System.out.println("---- INPUT ----");
            
            System.out.print("Nama\t: ");
            nama = inp2.nextLine();
            System.out.print("NRP\t: ");
            nrp = input.nextInt();
            System.out.print("Kelas\t: ");
            kelas = inp2.nextLine();
            
            System.out.println("---- OUTPUT ----");
            
            threetype(nama, nrp, kelas);
        
        
    }
    
}
