/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_hashtable2;

import java.util.Hashtable;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Hashtable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //membuat hashtable
        Hashtable<Integer,String> bkalamat = new Hashtable<Integer,String>();
        
        //menginputkan data
        bkalamat.put(1, "Robet, Jl. Kepanjen\n");
        bkalamat.put(2, "Marcel, Jl. Pajagalan\n");
        bkalamat.put(3, "Feri, Jl. Suhat\n");
        bkalamat.put(4, "Aldyn, Jl. Veteran\n");
        bkalamat.put(5, "Alfiyan, Jl. Arjosari\n");
        bkalamat.put(6, "Dedhe, Jl. Bumi\n");
        bkalamat.put(7, "Dava, Jl. Singosari\n");
        bkalamat.put(8, "Ramha, Jl. Sumekar\n");
        bkalamat.put(9, "Ramma, Jl. Merdeka\n");
        bkalamat.put(10, "Virman, Jl. Dinoyo\n");
        System.out.println(bkalamat);
     
        //remove data
        System.out.println("----------------------");
        System.out.println("Menghapus 2 data: ");
        bkalamat.remove(8);
        bkalamat.remove(10);
        System.out.println(bkalamat);
        
        //baris data ganjil
        System.out.println("----------------------");
        System.out.println("Baris data ganjil: ");
        for (int i=0; i<bkalamat.size(); i++) {
            if (i%2 != 0) {
                System.out.print(bkalamat.get(i));
            }
        }
        
    }
}
