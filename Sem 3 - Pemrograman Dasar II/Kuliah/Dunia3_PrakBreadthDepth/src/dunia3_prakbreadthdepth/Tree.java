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
public class Tree {

    public Node insert(Node node, int nilai) {
        if (node == null) {
        return (new Node(nilai));
        }
            if (nilai < node.getValue()) {
            node.setLeft(insert(node.getLeft(), nilai));
            } else {
            node.setRight(insert(node.getRight(), nilai));
            }
        return node;
    }
}