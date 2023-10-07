/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_objectclass;

/**
 *
 * @author Kyrin
 */

public class Dunia3_Kotak {
    double panjang;
    double lebar;
    double tinggi;
    
    Dunia3_Kotak(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double hitungvolume() {
        return (panjang*lebar*tinggi);
    }
}

class Dunia3_ObjectClass {
    
    public static void main(String[] args) {
    
    Dunia3_Kotak k1, k2;
    k1 = new Dunia3_Kotak(4,3,2);
    k2 = new Dunia3_Kotak(6,5,4);
    
        System.out.println("Volume k1 = "+k1.hitungvolume());
        System.out.println("Volume k2 = "+k2.hitungvolume());
    }
} 

