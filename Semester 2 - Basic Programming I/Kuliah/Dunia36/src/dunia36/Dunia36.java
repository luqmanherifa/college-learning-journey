/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia36;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.print("Input Kalimat\t: ");
        String ka1 = input.nextLine();
        
        int ka2 = ka1.length();
        int b = 0;
        int a;
        for (a=0; a<ka1.length(); a++) {
            if(ka1.charAt(a) == ka1.charAt(ka2-1)) {
                ka2 = ka2 - 1;
                b += 1;
            } else {
                break;
            }
        }
        
        if (b == ka1.length()) {
            System.out.println(ka1+" adalah Kalimat Palindrom!");
        } else {
            System.out.println("Maaf! "+ka1+" bukan Kalimat Palindrom.");
        }
    }
}
        