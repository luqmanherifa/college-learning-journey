/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia18;

/**
 *
 * @author Kyrin
 */
public class Dunia18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int i;
        int j;
            for (i = 5; i >= 1; i--)
        {   
            for (j = 1; j <= i; j++)
            {   
                System.out.print(j*10+" ");
            }
            {   
                System.out.println();
            }
        }
    }    
}