/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author Kyrin
 */
public class LinkedList2 {
        LinkedListNode2 head;
        LinkedListNode2 tail;

    LinkedList2(){
        this.head = null;
        this.tail = null;
}   
    void print(){
        LinkedListNode2 current = head;
        while (current !=null){
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println("");
    }

    /* if LinkedList is empty, set new_node as head and tail
    * if LinkedList is not empty, set tail.next into new_node, set
      new_node.prev into tail, and make new_node a new tail
     */
    void push(LinkedListNode2 new_node) {
        if (this.head == null && this.tail == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
        tail.next = new_node;
        new_node.prev = tail;
        this.tail = new_node;
        }
    }

    /* declare a node named taken
    * if LinkedList is empty, set taken into null
    * if linkedList consists only one node, set taken = head, set both head 
    and tail into null
    * if linkedList consists of two or more nodes, set taken = head, 
    set head.next into new head, cut off all the link between taken and head
    * return taken
     */
    LinkedListNode2 qpop() {
        LinkedListNode2 taken = null;
        if (this.head == null && this.tail == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = head;
            this.head = null;
            this.tail = null;
        } else {
            taken = head;
            this.head = head.next;
            taken.set_next(null);
            head.set_prev(null);
        }
        return taken;
    }

    LinkedListNode2 spop() {
        LinkedListNode2 taken = null;
        if (this.head == null && this.tail == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = tail;
            this.head = null;
            this.tail = null;
        } else {
            taken = tail;
            tail = taken.prev;
            tail.next = null;
            taken.set_prev(null);
        }
        return taken;
    }
}