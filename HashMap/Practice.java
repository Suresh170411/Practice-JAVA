package HashMap;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        int arr [] = {12,2,4,5,5,2,6};
        Map<Integer,Integer> hm = new HashMap<>();
        
        for (int i=0; i<arr.length; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(hm);
    }
}
