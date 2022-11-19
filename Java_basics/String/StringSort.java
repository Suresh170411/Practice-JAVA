package Java_basics.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringSort {
    // SORTING A STRING IN JAVA USING .SORT()

    public static String sortString(String str){

        char res[] = str.toCharArray();
 
        Arrays.sort(res);
 
        return new String(str);
    }

    public static void main(String[] args) {        // ALAN FREQUNCY

        String str = "Hello";
        int n = str.length();

        String str1 = sortString(str);
        
        Map<Character,Integer> hm = new HashMap<>();
        
        for (int i=0; i<n; i++){
            hm.put(str1.charAt(i), hm.getOrDefault(str1.charAt(i),0)+1);
        }
        
        for (Map.Entry<Character,Integer> h : hm.entrySet()){
            System.out.println(h.getKey()+"-"+h.getValue());
        }
    }
}
