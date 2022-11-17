package Collection;

import java.util.HashMap;

public class Frequency {
    
    public static void main(String[] args) {
        int [] arr = {2,4,1,5,1,5,1};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
    }

}
