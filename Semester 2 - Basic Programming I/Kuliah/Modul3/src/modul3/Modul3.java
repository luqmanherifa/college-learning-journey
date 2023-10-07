/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

import java.util.Scanner;

public class Modul3 {

     public static void main(String[] args) {
        LinkedList a = new LinkedList();
        int c,x;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyak data : ");
        c = input.nextInt();
        for (int i = 0; i < c; i++){
            System.out.println("Masukkan angka : ");
            x = input.nextInt();
            a.insert (new LinkedListNode(x));
        }
        a.print(); // should show nothing
        a.insert(new LinkedListNode(5));
        a.insert(new LinkedListNode(4));
        a.insert(new LinkedListNode(7));
        a.insert(new LinkedListNode(6));
        a.print(); // should show 4 5 6 7
        a.delete(a.head);
        a.print(); // should show 5 6 7
        a.delete(a.tail.prev);
        a.print(); // should show 5 7
        a.delete(a.tail);
        a.print(); // should show 5
        a.delete(a.head);
        a.print(); // should show nothing
    
         System.out.println("Mencari angka: ");
         
         int cari = input.nextInt();
         if (a.find_node_by_data(cari) == null) {
             System.out.println("Data tidak ada!");
         } else {
             System.out.println("Data ditemukan!");
         }
        
     }

}
