/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_prakbreadthdepth;

/**
 *
 * @author Kyrin
 */
public class Node {
    
    int nilai;
    private Node left;
    private Node right;

    public Node(int a) {
        nilai = a;
    }

    public int getValue() {
        return nilai;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node ngk) {
        left = ngk;
    }

    public void setRight(Node ngk) {
        right = ngk;
    }
}
