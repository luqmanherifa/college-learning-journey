/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_prakgraph;

/**
 *
 * @author Kyrin
 */
public class Tree {
    
    TreeNode root;
    
    public Tree(){
        this.root = null;
    }
    
    public Tree(TreeNode root){
        this.root = root;
    }
    
    void print(){
        if(this.root == null){
        System.out.println();
        }
        else{
        this.root.print();
        }
    }
}