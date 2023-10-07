/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia34;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double nilaiakhir, nilaiuts, nilaiuas, tugas1, tugas2, tugast; 
        char grade = 0;
        char ulang;
        
        do {
            System.out.print("Input Y untuk Run Program : ");
            ulang = input.next().charAt(0);
                if (ulang==1) {
                    break;
                }
 
        System.out.println("-----------------------------------");
                
        System.out.print("Nilai UTS\t: ");
        nilaiuts = input.nextInt();
        
        System.out.print("Nilai UAS\t: ");
        nilaiuas = input.nextInt();
        
        System.out.print("Nilai Tugas 1\t: ");
        tugas1 = input.nextInt();
        
        System.out.print("Nilai Tugas 2\t: ");
        tugas2 = input.nextInt();
        
        
        if (tugas1>tugas2){
            tugast=tugas1;
        } else {
            tugast=tugas2;
        }
        
        nilaiakhir = (0.30*tugast + 0.30*nilaiuts + 0.40*nilaiuas);
        
        if (nilaiakhir >= 80 && nilaiakhir <= 100) {
            grade = 'A'; }
        
        else if (nilaiakhir >= 70 && nilaiakhir < 80) {
            grade = 'B'; }
        
        else if (nilaiakhir >= 56 && nilaiakhir < 70) {
            grade = 'C'; }
        
        else if (nilaiakhir >= 44 && nilaiakhir < 56) {
            grade = 'D'; }
        
        else if (nilaiakhir >= 0 && nilaiakhir < 44) {
            grade = 'E'; }
        
        System.out.println("+------------------------------------------------------+");
        System.out.println("|  TUGAS |   UTS   |   UAS   |   NILAI AKHIR   | GRADE |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("|  "+tugast+"  |  "+nilaiuts+"   |  "+nilaiuas+"   |       "+nilaiakhir+"      |   "+grade+"   |");
        System.out.println("+------------------------------------------------------+");
     
        System.out.print("Input Grade\t: ");
        grade = input.next().charAt(0);
        
        switch(grade){
            case 'A':
                System.out.println("> Memuaskan");
                break;
            case 'B':
                System.out.println("> Baik");
                break;
            case 'C':
                System.out.println("> Cukup");
                break;
            case 'D':
                System.out.println("> Kurang");
                break;
            case 'E':
                System.out.println("> Gagal");
                break;
            default:
                System.out.println("> Input Grade Salah!");
        }
        
            System.out.println("-----------------------------------");
      
        }
        while(!(ulang==1));
        
    }
}