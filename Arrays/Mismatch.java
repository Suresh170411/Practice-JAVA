package Arrays;

import java.util.Arrays;

public class Mismatch {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,6,5};

        int res = Arrays.mismatch(arr1, arr2);

        System.out.println(res);
    }
}
