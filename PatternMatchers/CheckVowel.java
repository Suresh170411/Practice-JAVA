package PatternMatchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckVowel {
    public static void main(String[] args) {

        String str = "ankushIsnotgOOD";

        Pattern p = Pattern.compile("[aeiouAEIOU]");    // countin vowels
        Matcher m = p.matcher(str);

        int vowel = 0;
        while(m.find()){
            vowel++;
        }
        System.out.println("Number of vowel : "+vowel);

        Pattern p1 = Pattern.compile("[^aeiouAEIOU]");  // counting consonant
        Matcher m1 = p1.matcher(str);

        int consonent = 0;
        while(m1.find()){
            consonent++;
        }
        System.out.println("Number of Consonent : "+consonent);
    }
}
