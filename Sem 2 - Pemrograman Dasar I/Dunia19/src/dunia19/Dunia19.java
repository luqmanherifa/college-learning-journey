/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia19;

/**
 *
 * @author Kyrin
 */
public class Dunia19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Bilangan Prima mulai dari 10 hingga 50");
        
            int a;
            int b;
            int c;
            for (a=10; a<50; a++)
        {   c=0;
            for (b=1; b<50; b++)
        {   if (a%b==0)
        {   c++;
    }
    }
            if ((c==2)&&(a!=1))
        {   System.out.print(a+" ");
    }
    }

}    
}