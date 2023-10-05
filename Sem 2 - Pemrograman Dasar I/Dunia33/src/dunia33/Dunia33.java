/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia33;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia33 {

    /**
     * @param args the command line arguments
     */
    static void tambahtambah(int a, int b, int c){
        System.out.println("Void Add\t= " +(a+b+c));
    }
    
    static int kalikali(int x, int y, int z){
        int hasilkali = (x*y)+z;
        return hasilkali;
    }
    
    static int tampilfaktorial(int nomor){
        if (nomor == 1)
            return 1;
        
        else
            return(nomor*tampilfaktorial(nomor-1));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int value1, value2, value3;
        System.out.print("Input value 1\t: ");
        value1 = input.nextInt();
        System.out.print("Input value 2\t: ");
        value2 = input.nextInt();
        System.out.print("Input value 3\t: ");
        value3 = input.nextInt();

        System.out.println("Hasil Input\t= " +value1+ " & " +value2+ " & " +value3);
    
        tambahtambah(value1, value2, value3);
        System.out.println("Hasil Kali\t= "+kalikali(value1, value2, value3));
        
        System.out.println("---Faktorial---");
        int angkafaktorial = 6;
        System.out.println("Hasil Faktorial\t= "+angkafaktorial+"! ="+tampilfaktorial(angkafaktorial));
        
    }
}
