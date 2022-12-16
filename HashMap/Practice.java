package HashMap;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        int arr [] = {12,2,4,5,5,2,6};
        Map<Integer,Integer> hm = new HashMap<>();
        
        for (int i=0; i<arr.length; i++){
            int x = arr[i];
            if (hm.containsKey(x) == false){
                hm.put(x,1);
            }else{
                hm.put(x,hm.get(x)+1);
            }
        }
        for (Integer i : hm.keySet()){
            System.out.println(i+"=="+hm.get(i));
        }
    }
}
