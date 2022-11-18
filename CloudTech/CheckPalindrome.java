package CloudTech;

public class CheckPalindrome {
    public static void main(String[] args) {
        
        String input = "My name is nitin and I can speak malayalam";

        String [] words = input.split(" ");

        for (String word: words){
            if (isPalindrome(word)){
                System.out.println(word+" : is palindrome");
            }else{
                System.out.println(word+" : is not a palindrome");
            }
        }

    }

    public static boolean isPalindrome(String input){
        int left = 0;
        int right = input.length()-1;

        while(left < right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
