/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia15;

/**
 *
 * @author Kyrin
 */
public class Dunia15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        System.out.println(b);
        System.out.println(a);
        
        int c;
        do
        
        {
            c = a+b;
            System.out.println(c);
            b = a;
            a = c;
        }
        
        while (c <= 30);

}        
}