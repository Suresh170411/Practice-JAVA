package Java_basics.String;

public class StrUpper {
    public static void main(String[] args) {
        String str = "aBcT";

        int n = str.length();

        boolean flag = false;
        for (int i=0; i<n; i++){
            if (
            Character.isDigit(str.charAt(i))){
                flag = true;
            }
        }
        System.out.println(flag);
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
}
