/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia37;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int matrikA[][] = new int[4][4];
        int matrikB[][] = new int[4][4];
        int jumlah[][] = new int[4][4];

        for (a=1; a<4; a++) {
            for (b=1; b<4; b++) {
                System.out.print("Matrik A [" +a+ "][" +b+ "] = ");
                matrikA[a][b] = input.nextInt();
            }
        }
        System.out.println();

        for (a=1; a<4; a++) {
            for (b=1; b<4; b++) {
                System.out.print("Matrik B [" +a+ "][" +b+ "] = ");
                matrikB[a][b] = input.nextInt();
            }
        }

        for (a=1; a<4; a++) {
            for (b=1; b<4; b++) {
                jumlah[a][b] = matrikA[a][b] + matrikB[a][b];
            }
        }
        System.out.println("\nMatrik A");
        for (a=1; a<4; a++) {
            for (b=1; b<4; b++) {
                System.out.print(" " + matrikA[a][b]);
            }
            System.out.println();
        }

        System.out.println("\nMatrik B");
        for (a=1; a<4; a++) {
            for (b=1; b<4; b++) {
                System.out.print(" " + matrikB[a][b]);
            }
            System.out.println();
        }
        System.out.println("\nMatrik A + Matrik B");
        for (a=1; a<4; a++) {
            for (b=1; b<4; b++) {
                System.out.print(jumlah[a][b]+"  ");
            }
            System.out.println();
        }
    }
}