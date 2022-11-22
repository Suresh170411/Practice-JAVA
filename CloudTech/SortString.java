package CloudTech;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String you want to sort");

        String str = sc.next();

        // String str = "aman";

        String res = sortString(str);

        System.out.println("Sorted String is--->"+res);

    }

    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }

}
