package DSA;

import java.util.Arrays;

public class WavePattern {
    public static void main(String[] args) {
        int [] arr = {9, 8, 4, 10, 3, 6, 5, 7, 1, 2};

        makeWaveOfArray(10, arr);
    }
    
    public static void makeWaveOfArray(int n, int [] arr){
        
        Arrays.sort(arr);
        
        for (int i=0; i<n-1; i = i+2){
            swap(arr,i,i+1);
        }
        
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
