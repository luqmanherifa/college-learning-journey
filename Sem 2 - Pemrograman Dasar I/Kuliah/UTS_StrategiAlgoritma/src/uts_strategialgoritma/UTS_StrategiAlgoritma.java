/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_strategialgoritma;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class UTS_StrategiAlgoritma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input jumlah koin: ");
        int totalkoin = input.nextInt();
        System.out.println("-----");
        int[] weightkoin = new int[totalkoin];
        
        for(int urut=0; urut<totalkoin; urut++){
            int urutan = urut+1;
            System.out.print("Koin ke "+urutan+": ");
            weightkoin[urut] = input.nextInt();
        }       UTS_StrategiAlgoritma uts_sa = new UTS_StrategiAlgoritma();
                uts_sa.sortkoin(weightkoin);
                System.out.println("-----\nHasil:\t" +uts_sa.findkoin(weightkoin));
    }

    public int findkoin(int[] fweight) {
        int a = fweight.length - 1;
        int b = 0;
        
        for (int c=a; c>=0; c--) {
            if (fweight[c]==5) {
                b = b+1;
                if (fweight[c+1]==4) {
                    break;
                }
            }
        }       return b;
    }
    
        public void sortkoin(int sweight[]) {
        int inweight = sweight.length;
        
        for(int a=0; a<inweight; a++) {
            int c = sweight[a];
            int b = a-1;
            while (b>=0 && sweight[b]>c) {
                sweight[b+1] = sweight[b];
                b = b-1;
            }       sweight[b+1] = c;
        }
    }
        
}
    

