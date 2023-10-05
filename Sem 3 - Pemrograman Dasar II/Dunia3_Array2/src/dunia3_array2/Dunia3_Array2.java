/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_array2;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Array dan Scanner
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap meja
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d):"
	, bar, kol);
                meja[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("| %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}