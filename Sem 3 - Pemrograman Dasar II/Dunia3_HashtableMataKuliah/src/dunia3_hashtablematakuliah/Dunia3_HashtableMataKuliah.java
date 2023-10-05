/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_hashtablematakuliah;

import java.util.Hashtable;

/**
 *
 * @author Kyrin
 */
public class Dunia3_HashtableMataKuliah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create hashtable
        Hashtable<String,String> mataklh = new Hashtable<String,String>();
        
        //menginputkan data
        mataklh.put("MK1", "Kalkulus");
        mataklh.put("MK2", "Algoritma");
        mataklh.put("MK3", "Aljabar");
        mataklh.put("MK4", "Statistika");
        mataklh.put("MK5", "Mat Diskrit");
        System.out.println(mataklh);
     
        System.out.println("----------------------");
        
        //cek hashtable
        System.out.println("Is Hashtable empty? "+mataklh.isEmpty());
        mataklh.remove("MK1");
        System.out.println(mataklh);
        System.out.println("Size of the Hashtable: "+mataklh.size());
        
    }
    
}
