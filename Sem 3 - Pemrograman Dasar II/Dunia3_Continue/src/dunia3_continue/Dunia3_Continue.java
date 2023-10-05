/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_continue;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<6; i++) {
            if(i==4) {
                System.out.println("mencolot nang looping "+(i+1));
                continue;
            }
        System.out.println("perulangan ke: "+i);
        }
    }
}