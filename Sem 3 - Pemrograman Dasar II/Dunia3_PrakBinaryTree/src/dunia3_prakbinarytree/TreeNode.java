package dunia3_prakbinarytree;

/**
 *
 * @author Kyrin
 */
public class TreeNode {
    TreeNode parent;
    TreeNode left;
    TreeNode right;
    int data;

    TreeNode(int new_data){
        this.data = new_data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    void set_parent(TreeNode other){
        this.parent = other;
        if(other != null){
            if(other.data > this.data){
                other.left = this;
            }else{
                other.right = this;
            }
        }
    }

    void set_left(TreeNode other){
        this.left = other;
        if(other != null){
            other.parent = this;
        }
    }

    void set_right(TreeNode other){
        this.right = other;
        if(other != null){
            other.parent = this;
        }
    }

    boolean is_left(){
        if(this.parent != null && parent.left == this){
            return true;
        }else{
            return false;
        }
    }

    boolean is_right(){
        if(this.parent != null && parent.right == this){
            return true;
        }else{
            return false;
        }
    }

    boolean has_right_and_left(){
        if(this.left != null && this.right != null){
            return true;
        }else{
            return false;
        }
    }

    boolean only_has_left(){
        if(this.left != null && this.right == null){
            return true;
        }else{
            return false;
        }
    }

    boolean only_has_right(){
        if(this.right != null && this.left == null){
            return true;
        }else{
            return false;
        }
    }

    boolean has_no_child(){
        if(this.right == null && this.left == null){
            return true;
        }else{
            return false;
        }
    }

    void unset_parent(){
        if(this.is_left()){
            this.parent.left = null;
            this.parent = null;
        }else if(this.is_right()){
            this.parent.right = null;
            this.parent = null;
        }
    }

    TreeNode most_left_child(){
        TreeNode child = this.left;
        while(child.left != null){
            child = child.left;
        }
        return child;
    }

    TreeNode most_right_child(){
        TreeNode child = this.right;
        while(child.right != null){
            child = child.right;
        }
        return child;
    }

    void print(String spaces, String label){
        System.out.println(spaces + label + " " + this.data);
        if(this.left != null){
            this.left.print(spaces + " ", "LEFT");
        }
        if(this.right != null){
            this.right.print(spaces + " ", "RIGHT");
        }
    }

    void print(){
        this.print("", "NODE");
    }

    void infix(){
        System.out.print("(");
        if(this.left != null){
            left.infix();
        }else{
            System.out.print("null");
        }
        System.out.print(" " + this.data + " ");
        if(this.right != null){
            right.infix();
        }else{
            System.out.print("null");
        }
        System.out.print(")");
    }

    void prefix(){
        System.out.print(this.data + "(");
        if(this.left != null){
            left.prefix();
        }else{
            System.out.print("null");
        }
        System.out.print(" ");
        if(this.right != null){
            right.prefix();
        }else{
            System.out.print("null");
        }
        System.out.print(")");
    }

    void postfix(){
        System.out.print("(");
        if(this.left != null){
            left.postfix();
        }else{
            System.out.print("null");
        }
        System.out.print(" ");
        if(this.right != null){
            right.postfix();
        }else{
            System.out.print("null");
        }
        System.out.print(")" + this.data);
    }
}