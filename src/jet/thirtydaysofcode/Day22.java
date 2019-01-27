package jet.thirtydaysofcode;

public class Day22 {
    class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }

        boolean hasChildren = (root.right != null || root.left != null);
        return hasChildren ? 1 + Math.max(getHeight(root.left), getHeight(root.right)) : 0;
    }
}
