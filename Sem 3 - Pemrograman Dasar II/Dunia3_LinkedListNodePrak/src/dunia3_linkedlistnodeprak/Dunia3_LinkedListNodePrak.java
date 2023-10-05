/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_linkedlistnodeprak;

/**
 *
 * @author Kyrin
 */
public class Dunia3_LinkedListNodePrak {

    Dunia3_LinkedListNodePrak next;
    Dunia3_LinkedListNodePrak prev;
    int data;
    
    Dunia3_LinkedListNodePrak(int new_data){
        this.data = new_data;
        this.next = null;
        this.prev = null;
    }
    
    void set_prev(Dunia3_LinkedListNodePrak other) {
        this.prev = other;
        if(other != null) {
            other.next = this;
        }
    }
    
    void set_next(Dunia3_LinkedListNodePrak other){
        this.next = other;
        if(other != null){
            other.prev = this;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
