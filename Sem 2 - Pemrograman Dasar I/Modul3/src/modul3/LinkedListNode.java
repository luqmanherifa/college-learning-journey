/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author Kyrin
 */
public class LinkedListNode {
    
    LinkedListNode next;
    LinkedListNode prev;
    int data;
    
    LinkedListNode(int new_data){
        this.data = new_data;
        this.next = null;
        this.prev = null;
    }
    
    void set_prev(LinkedListNode other) {
        this.prev = other;
        if(other != null) {
            other.next = this;
        }
    }
    
    void set_next(LinkedListNode other){
        this.next = other;
        if(other != null){
            other.prev = this;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
