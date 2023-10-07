/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_array3;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Array dan Scanner
        String[][] mhs = new String[4][5];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap data
        for(int bar = 0; bar < mhs.length; bar++){
            for(int kol = 0; kol < mhs[bar].length; kol++){
                System.out.format("Isi data (%d,%d): "
	, bar, kol);
                mhs[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int bar = 0; bar < mhs.length; bar++){
            for(int kol = 0; kol < mhs[bar].length; kol++){
                System.out.format("| %s | \t", mhs[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}