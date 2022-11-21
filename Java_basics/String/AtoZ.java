package Java_basics.String;

import java.util.Arrays;

public class AtoZ {
    public static void main(String[] args) {
        

        String str = "Hello";

        char [] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        for (char i='a'; i<'z'; i++){
            System.out.print(i+" ");
        }

    }
}
