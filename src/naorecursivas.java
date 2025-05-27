import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

 
    public int countNodes() {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int count = 0;

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            count++;

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Número de nós na árvore: " + tree.countNodes());
    }
}
