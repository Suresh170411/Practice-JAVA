package HashMap;

import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        int arr [] = {12,2,4,5,5,2,6};

        for (int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(hm);

        for (Integer i : hm.keySet()){
            System.out.println(i);
        }
    }
}
