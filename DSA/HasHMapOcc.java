package DSA;

import java.util.HashMap;

public class HasHMapOcc {
    public static void main(String[] args) {
        int arr [] = {1,2,2,4,5,3,2,5};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for(Integer i : hm.keySet()){
            System.out.println(i+"->"+hm.get(i));
        }
    }
}
