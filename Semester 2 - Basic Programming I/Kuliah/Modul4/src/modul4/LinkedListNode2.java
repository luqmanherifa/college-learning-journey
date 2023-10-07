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
public class LinkedListNode2 {
    LinkedListNode2 next;
    LinkedListNode2 prev;
    int data;
    
    /* Constructor
    * set this.data into new_data
    * set this.prev into null
    * set this.next into null
    */
    LinkedListNode2(int new_data) {
    this.data = new_data;
    this.prev = null;
    this.next = null;
    }

    /* set this.prev into other
    * if other is not null, set other.next into this
    */
    void set_prev(LinkedListNode2 other) {

        if (other != null) {
        other.next = this;
        }
    }
    
    /* set this.next into other
    * if other is not null, set other.prev into this
    */
    void set_next(LinkedListNode2 other) {

        if (other != null) {
        other.prev = this;
        }
    }
}