package Stack;

import java.util.Stack;

public class StackQ1 {
    public static void main(String[] args) {    // String shorting stack question---->
        
        String str = "aaabccddd";
        char [] arr = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c : arr){
            if (stack.isEmpty()) {
                stack.push(c);
            }else if(stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Character c : stack){
            sb.append(c);
        }

        // if (sb.length() == 0){
        //     System.out.println("Empty String");
        // }else{
        //     System.out.println(sb);
        // }

        String res =sb.length() == 0 ? "Empty String" : sb.toString();
        System.out.println(res);
    }
}
