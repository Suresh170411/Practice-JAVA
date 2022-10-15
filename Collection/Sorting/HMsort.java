package Collection.Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMsort {
    
    public static void coutFreq(int [] arr){
        
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            int x = arr[i];

            if (map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }else {
                map.put(x, 1);
            }

        }

        // for (Map.Entry<Integer,Integer> e : map.entrySet()){
        //     System.out.println(e.getKey()+":"+e.getValue());
        // }

        // Set<Integer> s = map.keySet();
        
        // for (Integer val : s){
        //     System.out.print(val+" ");
        // }

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
        }

    }

    public static void main(String[] args) {
        int [] arr = {6,3,4,3,2,0,7,1,1,5};

        coutFreq(arr);
        
    }

}
