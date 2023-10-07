/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_prakbinarytree2;

import java.util.ArrayList;

/**
 *
 * @author Kyrin
 */
public class TreeNode {
    
    TreeNode parent;
    double distance;
    ArrayList<TreeNode> children;
    int data;

    public TreeNode (int new_data){
        this.data = new_data;
        this.parent = null;
        this.distance = 0.0;
        this.children = new ArrayList<TreeNode>();
    }

    void set_parent(TreeNode new_parent, double distance){
        this.parent = new_parent;
        this.distance = distance;
    
        if(this.parent != null){
            parent.children.add(this);
        }
    }
    
    void set_parent(TreeNode new_parent){
        this.set_parent(new_parent, 0);
    }
    
    void add_child(TreeNode new_child, double distance){
        new_child.set_parent(this);
        new_child.distance = distance;
    }
 
    void remove_child(TreeNode child){
        child.set_parent(this);
        distance = child.distance;
        this.children.remove(child);
    }

    void print(String spaces, double distance){
        System.out.println(data+ "\t "+"distance from parent : "+this.distance +"distance from initial node"+(distance+this.distance));
        for(int i=0; i<this.children.size(); i++){
    
        this.children.get(i).print(" ",this.distance);
        }
    }
    
    void print(){
        this.print("", 0);
    }
}     

