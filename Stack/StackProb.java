package Stack;

import java.util.Stack;

public class StackProb {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();

        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
