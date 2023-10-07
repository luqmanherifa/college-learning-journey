package dunia3_prakbinarytree;

/**
 *
 * @author Kyrin
 */
public class Tree {
    TreeNode root;
    
    public Tree(){
        this.root = null;
    }

    void print(){
        if(this.root != null){
            this.root.print();
        }
    }

    void prefix(){
        if(this.root != null){
            this.root.prefix();
        }
        System.out.println();
    }
 
    void infix(){
        if(this.root != null){
            this.root.infix();
        }
        System.out.println();
    }

    void postfix(){
        if(this.root != null){
            this.root.postfix();
        }
        System.out.println();
    }

    void push(TreeNode new_node){
        if(this.root == null){
            this.root = new_node;
        } else {
            TreeNode current = this.root;
            while(current != null){
                if(new_node.data > current.data){
                    if(current.right == null){
                        current.set_right(new_node);
                        break;
                    } else {
                        current = current.right;
                    }
                }else{
                    if(current.left == null){
                        current.set_left(new_node);
                        break;
                    } else {
                        current = current.left;
                    }
                }
            }
        }
    }

    TreeNode traverse(int data) {
        TreeNode current = this.root;
        while (current != null) {
            if (current.data == data) {
                return current;
            } else {
                if (current.data < data) {
                    current = current.right;
                } else {
                    current = current.left;
                }
            }
        }
        return null;
    }
    
    void search(TreeNode new_node) {
        TreeNode current = this.root;
        while (current != null) {
            if (new_node.data > current.data) {
                current = current.right;
            } else if (new_node.data < current.data) {
                current = current.left;
            } else if (new_node.data == current.data) {
                System.out.println("Data ditemukan!");
                break;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan!");
        }
    }
    
}