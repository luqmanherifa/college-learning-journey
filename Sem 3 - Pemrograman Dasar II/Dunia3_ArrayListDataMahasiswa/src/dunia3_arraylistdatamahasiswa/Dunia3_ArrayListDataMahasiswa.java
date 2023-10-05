/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_arraylistdatamahasiswa;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kyrin
 */
public class Dunia3_ArrayListDataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating arraylist
        ArrayList<String> datamhs = new ArrayList<String>();
        
        //adding object in arraylist
        datamhs.add("Robet, 171111111, Turen");
        datamhs.add("Marcel, 171111112, Arjosari");
        datamhs.add("Feri, 171111113, Singosari");
        datamhs.add("Aldyn, 171111114, Tidar");
        datamhs.add("Alfiyan, 171111115, Sulfat");
        
        //getting Iterator from arraylist to traverse elements
        Iterator itr = datamhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.println("------------------------------");
        
        //data remove
        for (int i=0; i<datamhs.size(); i++) {
            datamhs.remove("Aldyn, 171111114, Tidar");
            System.out.println(datamhs.get(i));
    
    }
}
}