package Collection.Other;

import java.util.HashMap;

public class Frequency {
    
    public static void main(String[] args) {
        int [] arr = {2,4,1,5,1,5,1};

        HashMap<Integer,String> hm = new HashMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        System.out.println(map);

        hm.put(1, "Apple");
        hm.put(2, "Orange");
        hm.put(3, "Banana");
        hm.put(4, "Grape");

        hm.forEach((k,v)->System.out.println(k+"=="+v));
    }

}
