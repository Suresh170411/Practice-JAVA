package Java_basics.String;

public class StrUpper {
    public static void main(String[] args) {
        String str = "BatMan90";

        boolean x = upperCaseCheck(str);
        boolean y = loweCaseCheck(str);
        boolean z = digitCheck(str);

        if (x && y && z){
            System.out.println("Password Accepted..");
        }else if(x == false){
            System.out.println("There Must Have One UpperCase..");
        }else if(y == false){
            System.out.println("There Must Have One LowerCase..");
        }else if(z == false){
            System.out.println("There Must Have One Digit..");
        }else{
            System.out.println("Invalid password..");
        }
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
