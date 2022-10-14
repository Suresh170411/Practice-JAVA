package Collection.Sorting;

import java.util.HashMap;
import java.util.Map;

public class HMsort {
    

    public static void coutFreq(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            
            int x = arr[i];

            if (map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }else{
                map.put(x, 1);
            }
        }

        // for (Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     System.out.println(entry.getKey()+" : "+entry.getValue());
        // }

        System.out.println(map);

    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,4,3,3,4,5};

        coutFreq(arr);


    }

}
