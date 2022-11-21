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
        System.out.println();
        for (char i='A'; i<'Z'; i++){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("=============================");

        if(str.matches("[a-zA-Z]+")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
