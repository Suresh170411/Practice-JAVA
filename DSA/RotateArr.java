package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

        int k = 2;

        int [] res = new int [arr.length];

        for (int i=k; i<arr.length; i++){
            res[i] = arr[i];
        }

        System.out.println(Arrays.toString(res));

        for (int i=0; i<k; i++){
            res[k+i] = arr[i];
        }

        System.out.println(Arrays.toString(res));
    }
}
