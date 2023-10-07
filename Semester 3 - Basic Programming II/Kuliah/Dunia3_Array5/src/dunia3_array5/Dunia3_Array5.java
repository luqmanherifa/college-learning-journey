/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_array5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia3_Array5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
      // create an array list
      ArrayList<String> huruf = new ArrayList<String>();
      System.out.println("Initihuruf size of huruf: " + huruf.size());

      // add elements to the array list
      huruf.add("C");
      huruf.add("A");
      huruf.add("E");
      huruf.add("B");
      huruf.add("D");
      huruf.add("F");
      huruf.add(1, "A2");
      System.out.println("Size of huruf after additions: " + huruf.size());

      // display the array list
      System.out.println("Contents of huruf: " + huruf);

      // Remove elements from the array list
      huruf.remove("F");
      huruf.remove(2);
      System.out.println("Size of huruf after deletions: " + huruf.size());
      System.out.println("Contents of huruf: " + huruf);
      
      System.out.println("\nUpdate suatu nilai di dalam array list: ");
        huruf.set(1, "Z");  
        huruf.set(2, "Y");  
        huruf.set(3, "X");
   }
}