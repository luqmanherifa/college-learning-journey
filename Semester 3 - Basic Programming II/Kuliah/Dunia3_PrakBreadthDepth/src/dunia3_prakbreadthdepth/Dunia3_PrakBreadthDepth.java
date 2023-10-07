/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this jlate file, choose Tools | Templates
 * and open the jlate in the editor.
 */
package dunia3_prakbreadthdepth;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kyrin
 */
public class Dunia3_PrakBreadthDepth {

    private static Node a;

    public static void breadth(Node a) {
        if (a == null) {
        return;
        }
        
    Queue<Node> o = new LinkedList<Node>();
    o.add(a);
    while (o.peek() != null) {
        Node j = (Node) o.remove();
        System.out.print(j.nilai + " ");
        if (j.getLeft() != null) {
        o.add(j.getLeft());
        }
            if (j.getRight() != null) {
            o.add(j.getRight());
            }
        }
    }

    public static void depth(Node a) {
        if (a == null) {
        return;
        }
        System.out.print(a.nilai + " ");
        depth(a.getLeft());
        depth(a.getRight());
    }

    public static void main(String[] args) {

        Tree r = new Tree();
        a = r.insert(a, 3);
        a = r.insert(a, 2);
        a = r.insert(a, 6);
        a = r.insert(a, 9);
        a = r.insert(a, 4);

        System.out.println("Breadth First Search\t:");
        breadth(a);
        
        System.out.println("\nDepth First Search\t:");
        depth(a);
    }
}