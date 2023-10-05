/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi2;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Responsi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama, jurusan;
        final double nilaitugas, nilaiuts, nilaiuas, nilaipraktik, nilaiakhir;
        char grade = 0;
        
        System.out.print("Nama Lengkap\t: ");
        nama = input.nextLine();
        
        System.out.print("Jurusan\t\t: ");
        jurusan = input.nextLine();
        
        System.out.print("Nilai Tugas\t: ");
        nilaitugas = input.nextInt();
        
        System.out.print("Nilai UTS\t: ");
        nilaiuts = input.nextInt();
        
        System.out.print("Nilai UAS\t: ");
        nilaiuas = input.nextInt();
        
        System.out.print("Nilai Praktik\t: ");
        nilaipraktik = input.nextInt();
        
        nilaiakhir = (0.20*nilaitugas + 0.20*nilaiuts + 0.35*nilaiuas + 0.25*nilaipraktik);
        
        if (nilaiakhir > 81 && nilaiakhir <= 100) {
            grade = 'A'; }
        
        else if (nilaiakhir > 61 && nilaiakhir < 80) {
            grade = 'B'; }
        
        else if (nilaiakhir > 41 && nilaiakhir < 60) {
            grade = 'C'; }
        
        else if (nilaiakhir > 21 && nilaiakhir < 40) {
            grade = 'D'; }
        
        else if (nilaiakhir >=0 && nilaiakhir < 20) {
            grade = 'D'; }
        
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("\n"+nama+" dari Jurusan "+jurusan+" memiliki nilai akhir "+nilaiakhir+" dengan GRADE ("+grade+")"+""+"\ndan dinyatakan LULUS"); 
            }
        
        else {
            System.out.println("\n"+nama+" dari Jurusan "+jurusan+" memiliki nilai akhir "+nilaiakhir+" dengan GRADE ("+grade+")"+""+"\ndan dinyatakan TIDAK LULUS"); 
            }
     
        
    }
    
}
