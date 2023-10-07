/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_pduts1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia3_PDUTS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array list
        ArrayList dn1 = new ArrayList();
        
        // scanner input
        Scanner input = new Scanner (System.in);
        
        //input jumlah data
        System.out.print("Input jumlah data: ");
        int jml_data = input.nextInt();
        System.out.println("-----------------------");
        
        //input data
        for (int i=0; i<jml_data; i++) {
            System.out.print("Input data ke-"+(i+1)+": ");
            dn1.add(input.nextInt());
        }
        System.out.println("-----------------------");
        
        //menampilkan data yang sudah diinput
        System.out.println("Data yang sudah di input");
        for (int i = 0; i < dn1.size(); i++){
            System.out.println("Angka ke-"+(i+1)+" : " + dn1.get(i));
        }
        System.out.println("-----------------------");
        
        //periksa antrian apakah kosong
        System.out.println("Periksa antrian apakah kosong?");
        System.out.println(dn1.isEmpty());
        System.out.println("-----------------------");
        
        //masukkan angka "60"
        dn1.add(60);
        
        //hapus angka "3"
        dn1.remove(4);
        
        //masukkan angka "33"
        dn1.add(33);
        
        //menampilkan antrian saat ini
        System.out.println("Data saat ini");
        for (int i=0; i<dn1.size(); i++) {
            System.out.println("Angka ke-"+(i+1)+":"+dn1.get(i));
        }
        System.out.println("-----------------------");
        
        //mencari "44" di antrian
        System.out.println("Cari angka '44' di antrian");
        System.out.println(dn1.contains(44));       
    }
}