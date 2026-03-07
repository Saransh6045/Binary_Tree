import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        this.data = key;
    }
}
public class levelOrderTraversal {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> result = levelOrderTraversal(root);
        System.out.println(result);
    }

    public static List<List<Integer>> levelOrderTraversal(Node root){
        Queue<Node> q = new ArrayDeque<Node>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        if(root==null)  return result;
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size();
            List<Integer> list = new LinkedList<Integer>();
            for(int i=1; i<=levelNum; i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null)    q.offer(q.peek().right);
                list.add(q.poll().data);
            }
            result.add(list);
        }
        return result;
    }

}
