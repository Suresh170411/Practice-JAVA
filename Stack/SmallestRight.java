package Stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestRight {
    public static void main(String[] args) {
        
        int arr [] = {1,3,2,4};
        int ans = 0;
        int res [] = new int [arr.length];

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }

        for (int i=0; i<res.length; i++){
            if (res[i] == 0){
                res[i] = -1;
            }
        }

        System.out.println(Arrays.toString(res));

        smallestRightBF(arr);

    }

    

    // <--------- BRUTE FORCE ------------>
    public static void smallestRightBF(int [] arr){
        int n = arr.length;
        int next;
        for (int i = 0; i < n; i++) {
            next = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next+" ");
        }
    }
}
