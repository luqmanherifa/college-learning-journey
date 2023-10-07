/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia43;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        //deklarasi variabel 
        int n, hasil;
        
        //input
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai n\t: ");      
        n = input.nextInt();
        
        hasil = faktorial(n);
        System.out.println("Faktorial dari "+n+" adalah "+hasil);
    }
    
        //membuat fuction penghitungan 
    public static int faktorial(int n)
    
    {
        //untuk nilai n=0 atau 1 maka faktorial nya adalah 1
        if(n==0||n==1)
        {
            return 1;            
        }
        
        //selain perhitungan di atas menggunakan n-1
        else return n*faktorial(n-1);
    }
    
    
}