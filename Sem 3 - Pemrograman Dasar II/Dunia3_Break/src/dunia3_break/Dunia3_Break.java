/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_break;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<6; i++) {
            if(i==3) {
                System.out.println("perulagan mandek rek");
                break;
            }
        System.out.println("perulangan ke: "+i);
        }
    }
}
