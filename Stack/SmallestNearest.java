package Stack;

import java.util.Arrays;
import java.util.Stack;

public class SmallestNearest {
    public static void main(String[] args) {
        
        int [] arr = {5,4,1,2,4,3};
        checkLestSmallestStack(arr);
    }

    public static void checkLestSmallestStack(int [] arr){
        int n = arr.length;

        int ans [] = new int [arr.length];
        Stack<Integer> st = new Stack<>();


        for (int i=0; i<arr.length; i++){
            while (!st.empty() && st.peek() >= arr[i]) st.pop();

            if (st.empty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}