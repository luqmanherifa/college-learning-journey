/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia42;

/**
 *
 * @author Kyrin
 */
public class Dunia42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        int tic[][] = new int [4][6];
            tic[0][0] = 0;
            tic[0][1] = 0;
            tic[1][0] = 0;
            tic[1][1] = 1;
            tic[2][0] = 1;
            tic[2][1] = 0;
            tic[3][0] = 1;
            tic[3][1] = 1;
        
        System.out.println("a  |  b  |  not a  |  a or b  |  a and b  |  (not a) and (a or b)");
        
            for (a=0; a<tic.length; a++)
                
        { 
            for (b=0; b<2; b++) 
                 { 
                     System.out.print(tic[a][b]+"  |  ");
                 }
            
            if (tic[a][0] == 0)
                 { 
                     tic[a][2]=1;
                     System.out.print("  1    |     ");
                 }
            
            else { 
                    tic[a][2]=0;
                    System.out.print("  0    |     ");
                 }
            
            System.out.print(tic[a][3]=(tic[a][0] | tic[a][1]));
            System.out.print("    |      ");
            System.out.print(tic[a][4]=(tic[a][0] & tic[a][1]));
            System.out.print("    |           ");
            System.out.print((tic[a][5]= tic[a][2]& tic[a][3]));
            System.out.print("\n");
        }
            
    }
}