/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_rekursif;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Rekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0;
        System.out.println("Nilai faktorial dari "+a+" adalah "+factorial(a));
    }
    
    static int factorial (int n) {
        if(n==0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}