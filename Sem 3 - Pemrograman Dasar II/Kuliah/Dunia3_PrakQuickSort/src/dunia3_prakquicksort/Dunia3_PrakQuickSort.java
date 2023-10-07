/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_prakquicksort;

/**
 *
 * @author Kyrin
 */
public class Dunia3_PrakQuickSort {

    node head;
    node sorted;
    
    class node {
        int a;
        node next;
        
        public node(int a) {
            this.a = a;
        }
    }
    
    void push(int a) {
        node newnode = new node(a);
        newnode.next = head;
        head = newnode;
    }
    
    void insertsort(node b) {
        sorted = null;
        node current = b;
        while (current != null) {
            node next = current.next;
            sortedinsert(current);
            current = next;
        }
        head = sorted;
    }
    
    void sortedinsert(node newnode) {
        if (sorted == null || sorted.a >= newnode.a) {
            newnode.next = sorted;
            sorted = newnode;
        } else {
            node current = sorted;
            while (current.next != null && current.next.a < newnode.a) {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
    
    void printlist(node head) {
        while (head != null) {
            System.out.println(head.a+" ");
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
        Dunia3_PrakQuickSort qs = new Dunia3_PrakQuickSort();
        qs.push(30);
        qs.push(10);
        qs.push(50);
        qs.push(40);
        qs.push(20);
        System.out.println("Sebelum diurutkan: ");
        qs.printlist(qs.head);
        qs.insertsort(qs.head);
        System.out.println("Setelah diurutkan: ");
        qs.printlist(qs.head);
    }
    
}
