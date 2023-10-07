/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia46;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka\t: ");
        int a = input.nextInt();
        System.out.print("Input pangkat\t: ");
        int b = input.nextInt();

        int hasil;
        hasil = pangkat(a,b);
        System.out.println("---------------------");
        System.out.println(a+" ^ "+b+" = "+hasil);
        }

    public static int pangkat(int a, int b){
        if(b > 0){
            return a * pangkat(a,b-1);
        }
        else{
            return 1;
        }
    }
}