import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        this.data = key;
    }
}

public class iterarivePreOrderTraversal {

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> res = iterativepreOrderTraversal(root);
        System.out.print(res);
    }


    public static List<Integer> iterativepreOrderTraversal(Node root){
        List<Integer> preOrder = new LinkedList<Integer>();
        if(root==null)  return preOrder;
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            preOrder.add(root.data);
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
        }

        return preOrder;
    }
}
