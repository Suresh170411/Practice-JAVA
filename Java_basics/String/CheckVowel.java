package Java_basics.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckVowel {
    public static void main(String[] args) {

        String str = "aman";

        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(str);
        int count = 0;
        while(m.find()){
            count++;
        }
        System.out.println("Number of Vowel : "+count);
    }
}
