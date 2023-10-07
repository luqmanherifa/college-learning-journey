/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia31;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double nilaitugas, nilaiuts, nilaiuas, nilaiakhir;
        char grade = 0;
        int nrp;
        
        do {
            System.out.println("Input NRP\t: ");
            nrp = input.nextInt();
                if (nrp==0) {
                    break;
                }
    
 
        System.out.print("Nilai Tugas\t: ");
        nilaitugas = input.nextInt();
        
        System.out.print("Nilai UTS\t: ");
        nilaiuts = input.nextInt();
        
        System.out.print("Nilai UAS\t: ");
        nilaiuas = input.nextInt();
        
        nilaiakhir = (0.10*nilaitugas + 0.30*nilaiuts + 0.60*nilaiuas);
        
        if (nilaiakhir >= 80 && nilaiakhir <= 100) {
            grade = 'A'; }
        
        else if (nilaiakhir >= 70 && nilaiakhir < 80) {
            grade = 'B'; }
        
        else if (nilaiakhir >= 56 && nilaiakhir < 70) {
            grade = 'C'; }
        
        else if (nilaiakhir >= 44 && nilaiakhir < 5) {
            grade = 'D'; }
        
        else if (nilaiakhir >=0 && nilaiakhir < 44) {
            grade = 'D'; }
        
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("|     NRP     |  TUGAS |   UTS   |   UAS   | Nilai Akhir | Grade |");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("|  "+nrp+"  |  "+nilaitugas+"  |  "+nilaiuts+"   |  "+nilaiuas+"   |    "+nilaiakhir+"     |   "+grade+"   |");
        System.out.println("+----------------------------------------------------------------+");
     
        }
        while(!(nrp==0));
    }
}