/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia40;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
        int [] kode_pgw;
        kode_pgw = new int[5];
        
        int [] lama_krj;
        lama_krj = new int[5];
        
        int [] jml_anak;
        jml_anak = new int[5];
        
        int [] insentif;
        insentif = new int [5];
        
        int [] gaji_pkk;
        gaji_pkk = new int [5];
        
        int [] tunjangan_anak;
        tunjangan_anak = new int [5];
       
        int total_gaji;
        
        for (int x=0; x<5; x++) {
            
            System.out.println("-------------------------");
            System.out.print("Input Kode Pegawai\t: ");
            kode_pgw[x] = input.nextInt();
            System.out.print("Input Lama Bekerja\t: ");
            lama_krj[x] = input.nextInt();
            
            if (lama_krj[x] <=5) {
            gaji_pkk[x] = 1000000;
            } else if ((lama_krj[x] >=6) && (lama_krj[x] <=10)){
            gaji_pkk[x] = 2000000;
            } else if (lama_krj[x] >=11) {
            gaji_pkk[x] = 5000000; }
            
            System.out.print("Jumlah Anak\t\t: ");
            jml_anak[x] = input.nextInt();
            
            if ((jml_anak[x] >=1) && (jml_anak[x] <=2)) {
            tunjangan_anak[x] = 400000;
            } else if ((jml_anak[x] >2) && (lama_krj[x] >2)) 
            insentif[x] = 1000000;
            
            total_gaji = gaji_pkk[x] + tunjangan_anak[x] + insentif[x];
            
            System.out.println("-------------------------");
            System.out.println("Kode Karyawan\t: " +kode_pgw[x]);
            System.out.println("Lama Bekerja\t: " +lama_krj[x]);
            System.out.println("Jumlah Anak\t: " +jml_anak[x]);
            System.out.println("Insentif\t: " +insentif[x]);
            System.out.println("Gaji Pokok\t: " +gaji_pkk[x]);
            System.out.println("Total Gaji\t: " +total_gaji);
            
        } 
    }
}