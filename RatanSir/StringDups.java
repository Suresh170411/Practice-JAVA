package RatanSir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class StringDups {
    public static void main(String[] args) {
        
        String str = "HEllo";

        System.out.println(str);

        char [] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));

        LinkedHashSet<Character> lhs =  new LinkedHashSet<>();

        for (int i=0; i<arr.length; i++){
            lhs.add(arr[i]);
        }

        // System.out.println(lhs);

        List<Character> list = new ArrayList<>(lhs);

        System.out.println(list);

    }
}
