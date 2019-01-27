package jet.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;

public class Day23 {
    static void levelOrder(Node root) {
        //Write your code here
        Queue<Node> dataQueue = new LinkedList<Node>();

        if (root != null) {
            dataQueue.add(root);
        }

        while (dataQueue.peek() != null) {
            Node current = dataQueue.remove();
            System.out.print(current.data + " ");
            if (current.left != null) {
                dataQueue.add(current.left);
            }
            if (current.right != null) {
                dataQueue.add(current.right);
            }
        }
    }

    class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
