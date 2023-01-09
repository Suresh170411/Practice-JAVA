package Arrays;

import java.util.Arrays;
import java.util.Collections;


public class ReverseSort {
    public static void main(String[] args) {
        // Integer [] arr = {5,0,1,4,3,2};

        // Arrays.sort(arr,Collections.reverseOrder());

        // System.out.println(Arrays.toString(arr));

        int [] res = {1,4,51,2,8,3};

        Integer [] arr1 = new Integer[res.length];
        for (int i=0; i<res.length; i++){
            arr1[i] = res[i];
        }

        // System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr1));
    }
}
