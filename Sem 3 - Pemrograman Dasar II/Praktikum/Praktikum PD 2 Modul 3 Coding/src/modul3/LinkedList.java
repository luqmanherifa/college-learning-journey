/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author yohan
 */
public class LinkedList {

    LinkedListNode head;
    LinkedListNode tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /* First set a Node named current into head
    * while current is not null, print current.data, set current = current.next
    * print end of line
     */
    void print() {
        LinkedListNode current = this.head;
        while (current != null) {

        }
        System.out.println("");
    }

    /* if LinkedList is empty, set new_node as head and tail
    * if LinkedList is not empty, set tail.next into new_node, set
      new_node.prev into tail, and make new_node a new tail
     */
    void push(LinkedListNode new_node) {
        if (this.head == null) {

        } else {

        }
    }

    /* if linked list is empty, set new_node as head and tail
    * if new_node < head, make it a new head
    * if new_node > tail, make it a new tail
    * otherwise traverse to the current position, and put new_node there
     */
    void insert(LinkedListNode new_node) {
        if (this.head == null) {

        } else if (new_node.data <= this.head.data) {

        } else if (new_node.data >= this.tail.data) {

        } else {
            LinkedListNode position = head;
            while (position.data < new_node.data) {

            }
            LinkedListNode previous_position = position.prev;

        }
    }

    LinkedListNode find_node_by_data(int data) {
        LinkedListNode current = this.head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void delete(LinkedListNode deleted) {
        if (deleted != null && this.head != null) {
            if (this.head == this.tail && deleted == this.head) {
                this.head = null;
                this.tail = null;
            } else if (deleted == this.head) {
                LinkedListNode new_head = this.head.next;
                this.head.set_next(null);
                new_head.set_prev(null);
                this.head = new_head;
            } else if (deleted == this.tail) {
                LinkedListNode new_tail = this.tail.prev;
                this.tail.set_prev(null);
                new_tail.set_next(null);
                this.tail = new_tail;
            } else {
                LinkedListNode deleted_prev = deleted.prev;
                LinkedListNode deleted_next = deleted.next;
                deleted.set_prev(null);
                deleted.set_next(null);
                deleted_prev.set_next(deleted_next);
            }
        }
    }
}
