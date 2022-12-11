package Stack;

public class SmallestRight {
    public static void main(String[] args) {
        
    }

    public static void smallestRightBF(int [] arr){
        int n = arr.length;
        int next;
        for (int i = 0; i < n; i++) {
            next = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next+" ");
        }
    }
}
