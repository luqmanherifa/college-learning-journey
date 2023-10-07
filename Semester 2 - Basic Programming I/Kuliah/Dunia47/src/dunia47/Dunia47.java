/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia47;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia47 {

    /**
     * @param args the command line arguments
     */
    
    Scanner sc = new Scanner(System.in);
    double f, n, g;
    
    public static void main(String[] args) {
       Dunia47 call = new Dunia47();
        System.out.println("PROGRAM HITUNG");
        call.input();
        System.out.println("");
        call.faktorial();
        call.hitung();
        call.show();
    }
    
    public void input(){
        System.out.print("Input nilai n\t: ");
        n = sc.nextInt();
    }
    
    public void faktorial(){
        f = 1;
        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
    }
    
    public void hitung() {
        g = n/f;
    }
    
    public void show() {
        System.out.print("Hasil dari "+n+"/"+n+"! = ");
        System.out.print(n+" / (1");
        for (int i = 2; i <= n; i++) {
            System.out.print(" x "+i);
        }
        System.out.println(") = "+g);
    }

}