import java.util.Arrays;

public class BubbleSort {

    // public static  void printArr(int [] arr ){
    //     for (int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
        
    //     int [] arr = {3,5,2,0,8,4,7};

    //     for (int i=0; i<arr.length-1; i++){
    //         for (int j=0; j<arr.length-i-1; j++){
    //             if (arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    //     printArr(arr);

    // }

    public static int[] swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
    public static void main(String[] args) {
        
        int [] arr = {4,2,6,3,7,1,9,0};
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
