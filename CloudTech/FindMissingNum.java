package CloudTech;

public class FindMissingNum {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7,9};

        int n = arr.length;
        int sum = ((n+1)*(n+2))/2;

        // System.out.println(sum);

        int actualSum = 0;

        for (int i=0; i<n; i++){
            actualSum+= arr[i];
        }

        System.out.println("The missing number is: "+(sum-actualSum));
    } 
}
