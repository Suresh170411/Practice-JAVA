package DSA;

public class RotateArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

        int k = 2;
        rotate(arr, k);
        
    }
    public static void rotate(int[] arr, int k) {
        // step1: reverse the array
        // step2: split the array into two.
        // step3: reverse both the two parts.
        
        //taking k modulo for edge cases
        k = k%arr.length;
        swap(arr, 0, arr.length-1);
        swap(arr, 0, k-1);
        swap(arr, k, arr.length-1);
    }
    public static void swap(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
