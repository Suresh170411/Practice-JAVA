package Java_basics.String;

public class StrSortBrute {
    public static void main(String[] args) {
        // Custom string input
        String str = "geeksforgeeks";
       
        // Converting string into an array for computation
        char arr[] = str.toCharArray();
 
        // Nested loops for comparison of characters
        // in above character array
        char temp;
 
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        // By now loop is done means we have
        // iterated the whole array
        System.out.println(arr);
    
    }

}
