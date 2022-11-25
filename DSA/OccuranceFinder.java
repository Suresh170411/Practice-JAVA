package DSA;

import java.util.HashMap;

public class OccuranceFinder {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,5,5,6,2,5};

        checkOcc(arr);
    }

    public static void checkOcc(int [] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        for (Integer i : hm.keySet()){
            System.out.println(i+"->"+hm.get(i));
        }
    }
}
