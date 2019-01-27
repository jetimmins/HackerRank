package jet.hackerrank.thirtydaysofcode;

public class Day15 {
    public Node insert(Node head,int data) {
        //Complete this method
        if(head == null) {
            return new Node(data);
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        return head;
    }

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
}
