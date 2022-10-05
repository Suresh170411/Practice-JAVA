package Collection;

import java.util.Arrays;

public class ArrSort {
    
    public static void main(String[] args) {
        int [] arr = new int [] {4,1,2,5,3,7};

        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        
    }

}

// MIN-MAX sum hackerRank
// ----------------------------

// long sum = 0;
//     int minEl = arr.get(0);
//     int maxEl = arr.get(0);
//     for(int i=0;i<arr.size();i++){
//         sum+=arr.get(i);
//         if(arr.get(i)<minEl){
//             minEl = arr.get(i);
//         }
//         if(arr.get(i)>maxEl){
//             maxEl = arr.get(i);
//         }
//     }
//     System.out.println((sum-maxEl)+" "+(sum-minEl));