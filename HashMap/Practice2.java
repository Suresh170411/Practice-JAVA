package HashMap;

import java.util.HashMap;

public class Practice2 {
    public static void main(String[] args) {
        int arr [] = {2,4,1,0,5,4,5,7};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            if (hm.containsKey(arr[i]) == false){
                hm.put(arr[i], 1);
            }else {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        System.out.println(hm);
    }
}
