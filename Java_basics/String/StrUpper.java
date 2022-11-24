package Java_basics.String;

public class StrUpper {
    public static void main(String[] args) {
        String str = "aBcT";

        System.out.println(upperCaseCheck(str) && loweCaseCheck(str) && digitCheck(str));
    }

    public static boolean upperCaseCheck(String str){
        
        boolean flag = false;
        
        for (int i=0; i<str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))){
                flag = true;
            }
        }
        return flag;
    }

    public static boolean loweCaseCheck(String str){

        boolean flag = false;

        for (int i=0; i<str.length(); i++){
            if (Character.isLowerCase(str.charAt(i))){
                flag = true;
            }
        }
        return flag;
    }

    public static boolean digitCheck(String str){

        boolean flag = false;

        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                flag = true;
            }
        }
        return flag;
    }
}
