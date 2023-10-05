/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_string3;

/**
 *
 * @author Kyrin
 */
public class Dunia3_String3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mencetak string pada format tertentu
        double harga = 10.6;
        int nilai = 90;
        String alamat = "malang";
        String fs;
        
        fs = String.format("The value of the float variable is "+
        "%f, \nwhile the value of the integer "+
        "variable is %d, \nand the string "+"is %s ", harga, nilai, alamat);
        System.out.println(fs);
                
                
    }
    
}
