
import java.util.Queue; 
import java.util.LinkedList; 

class Node{
    Node left;
    Node right;
    int item;
    
    public Node(int item){
        this.item = item;
        this.left = this.right = null;
    }
}

class BinaryTree{
    Node root;
    public BinaryTree (Node node){
        root = node;
    }
    
    public void levelOrderTraversal(){
        if(root == null) return;
        Queue<Node> q = new LinkedList<Node>();
        //add root
        q.add(root);
        while(!q.isEmpty()){
            //remove element from Queue
            Node node = q.poll();
            System.out.print(node.item + " ");
            
            //add left
            if(node.left !=null){
                q.add(node.left);
            }
            if(node.right !=null){
                q.add(node.right);
            }
        }
    }
}

public class BFS
{
	public static void main(String[] args) {
		Node node = new Node(1);
		BinaryTree tree = new BinaryTree(node);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left= new Node(4); 
        tree.root.left.right= new Node(5);
        tree.levelOrderTraversal();
	}
}
