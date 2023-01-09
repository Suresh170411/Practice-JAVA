package Arrays;

import java.util.Arrays;
import java.util.Collections;


public class ReverseSort {
    public static void main(String[] args) {
        Integer [] arr = {5,0,1,4,3,2};

        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
