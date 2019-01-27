package jet.thirtydaysofcode;

import java.util.HashSet;

public class Day24 {
    public static Node removeDuplicates(Node head) {
        //Write your code here
        if (head == null) {
            return null;
        }
        HashSet<Integer> occurences = new HashSet<>();
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (!occurences.contains(current.data)) {
                occurences.add(current.data);
                previous = current;
                current = current.next;
            } else {
                previous.next = current = current.next;
            }
        }
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
