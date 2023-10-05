/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia45;

import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia45 {

    /**
     * @param args the command line arguments
     */
    
    static void facto (int a, int b, int c)
        {
            if (a>=1)
            {
                System.out.print("Hasil factorial\t: ");
                System.out.print(a+"! = ");
                for (c=a; c>0; c--)
                {
                    if (c==1)
                    {
                        System.out.println("1 = "+b);
                    }
                    else 
                    {
                        System.out.print(c+" x ");
                    }
                }
            }
        }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("Input n\t\t: ");
        n = input.nextInt();
        
        facto(n, n, n);
        
        
        
    }
    
}
