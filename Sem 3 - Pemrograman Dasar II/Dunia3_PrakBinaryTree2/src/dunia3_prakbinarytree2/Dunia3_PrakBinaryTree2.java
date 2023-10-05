package dunia3_prakbinarytree2;

/**
 *
 * @author Kyrin
 */
public class Dunia3_PrakBinaryTree2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Tree t = new Tree(new TreeNode(1));
    
    t.root.add_child(new TreeNode(2), 1);
    t.root.add_child(new TreeNode(3), 1);
    t.root.add_child(new TreeNode(4), 2);
    t.root.children.get(0).add_child(new TreeNode(5), 1);
    t.root.children.get(2).add_child(new TreeNode(6), 1);
    t.root.children.get(2).add_child(new TreeNode(7), 2);
    t.print(); 
    }
}