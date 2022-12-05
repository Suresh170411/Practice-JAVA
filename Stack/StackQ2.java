package Stack;

import java.util.Stack;

public class StackQ2 {
    public static void main(String[] args) {
        
        String str = "aaabccddd";

        Stack<Character> stack = new Stack<>();

        char [] arr = str.toCharArray();

        // System.out.println(Arrays.toString(arr));
        // for (char c : arr){
        //     if (stack.isEmpty()){
        //         stack.push(c);
        //     }else if(stack.peek() == c){
        //         stack.pop();
        //     }else{
        //         stack.push(c);
        //     }
        // }
        for (int i=0; i<arr.length; i++){
            if (stack.isEmpty()){
                stack.push((arr[i]));
            }else if(stack.peek() == arr[i]){
                stack.pop();
            }else {
                stack.push(arr[i]);
            }
        }
        // System.out.println(stack);

        StringBuilder sb = new StringBuilder();
        for (Character c: stack){
            sb.append(c);
        }
        
        String res = sb.length() == 0 ? "Empty String" : sb.toString();

        System.out.println(res);
    }
}
