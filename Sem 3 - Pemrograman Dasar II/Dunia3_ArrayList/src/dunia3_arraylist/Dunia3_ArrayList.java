/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_arraylist;

import java.util.*;

public class Dunia3_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creating arraylist
        ArrayList<String> al=new ArrayList<String>();
        
        //adding object in arraylist
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        
        //getting Iterator from arraylist to traverse elements
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
