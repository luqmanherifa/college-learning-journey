/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_queuelinkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kyrin
 */
public class Dunia3_QueueLinkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();
        
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll()); 
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); 
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); 
        for(String q : queue){
            System.out.println(q);
        }
    }
}