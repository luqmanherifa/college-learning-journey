/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_segitiga;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Segitiga {

    /**
     * @param args the command line arguments
     */
    
    static boolean segitiga(int p, int l, int t) {
        if (p>(l+t)) {
            return false;
        } else if (l>(p+t)) {
            return false;
        } else if (t>(p+l)) {
            return false;
        } else {
            return true;
        }
    }
    
    public static void main(String[] args) {
        int s1 = 10;
        int s2 = 3;
        int s3 = 5;
        
        boolean hasil = segitiga(s1,s2,s3);
        
        if (hasil) {
            System.out.println("Bisa membuat segitiga.");
        } else {
            System.out.println("Tidak bisa membuat segitiga!");
        }
    }
}