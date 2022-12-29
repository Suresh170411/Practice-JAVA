package HashMap;

import java.util.HashMap;

public class Practice2 {
    public static void main(String[] args) {
        int arr [] = {2,4,1,0,5,4,5,7};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i : arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        // System.out.println(hm);

        for (Integer i : hm.keySet()){
            System.out.println(i+" => "+hm.get(i));
        }
    }
}
