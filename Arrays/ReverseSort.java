package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSort {
    public static void main(String[] args) {
        int arr [] = {1,4,2,5,0,3,6};

        Arrays.sort(arr);

        Collections.reverse(Arrays.asList(arr));

        // System.out.println(Arrays.toString(arr));

    }
}
