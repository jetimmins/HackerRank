package jet.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18 {
    // Write your code here.
    private Queue<Character> queue = new LinkedList<>();
    private Stack<Character> stack = new Stack<>();

    void pushCharacter(char ch)
    {
        stack.push(ch);
    }
    void enqueueCharacter(char ch)
    {
        queue.add(ch);
    }
    char popCharacter()
    {
        return stack.pop();
    }
    char dequeueCharacter()
    {
        return queue.remove();
    }
}
