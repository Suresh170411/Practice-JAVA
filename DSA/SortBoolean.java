package DSA;

import java.util.Arrays;

public class SortBoolean {
    public static void main(String[] args) {
        boolean [] arr = {false,true,false,true,true};
        
        boolean[] arr1 = new boolean[arr.length];
        int j =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == true){
                arr1[j] = true;
                j++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i<j){
                arr[i]=true;
            }else{
                arr[i]=false;
            }
        }
        System.out.println(Arrays.toString(arr));       
    }
}
