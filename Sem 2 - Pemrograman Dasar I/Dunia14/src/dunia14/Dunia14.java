/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia14;

/**
 *
 * @author Kyrin
 */
public class Dunia14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bilangan kelipatan 3 mulai 1 hingga 50");
        
        for(int i = 1; i <= 50; i++)
        if (i%3 == 0)
    {
        System.out.print(i+" ");
    }

}    
}
