package Collection.Stack;

import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(s);

        s.pop();
        s.pop();
        System.out.println("--> "+s.peek());

        Stack<Integer> stack = new Stack<>();
        stack.add(11);
        stack.add(22);
        stack.add(33);
        stack.add(44);

        System.out.println(stack);

        for (Integer i : stack){
            System.out.println(i);
        }
    }
}
