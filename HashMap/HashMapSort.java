package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapSort {
    
    public static Map<Integer,Integer> countFreq(int [] arr){

        Map<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            int x = arr[i];
            
            if (hm.containsKey(x) == false){
                hm.put(x,1);
            }else{
                hm.put(x, hm.get(x)+1);
            }
        }
        return hm;
    }

    public static void main(String[] args) {
        int [] arr = {6,3,2,6,3,7,8,1,0};

        Map<Integer,Integer> map = countFreq(arr);

        System.out.println(map.keySet());

        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            System.out.print(m.getKey()+" ");
        }
    }

}
