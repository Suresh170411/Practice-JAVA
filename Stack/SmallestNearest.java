package Stack;

import java.util.Stack;

public class SmallestNearest {
    public static void main(String[] args) {
        
        int [] arr = {5,4,1,2,4,3};
        int ans [] = new int [arr.length];
        Stack<Integer> st = new Stack<>();


        for (int i=0; i<arr.length; i++){
            while (!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();

                if (st.isEmpty()) ans[i] = -1;
            }
        }

    }
}
