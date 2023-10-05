/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_perpangkatan;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Perpangkatan {

    /**
     * @param args the command line arguments
     */
    
    static int pangkat(int n, int p) {
        if (p==0) {
            return 1;
        } else {
            return n*pangkat(n,p-1);
        }
    }
    
    public static void main(String[] args) {
        int ni = 2;
        int pa = 3;
        System.out.println("Hasil dari "+ni+" dipangkatkan "+pa+" = "+pangkat(ni,pa));
    }
    
}
