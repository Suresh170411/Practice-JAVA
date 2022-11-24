package Java_basics.String;

public class StrUpper {
    public static void main(String[] args) {
        String str = "aBcT";

        int n = str.length();

        boolean flag = false;
        for (int i=0; i<n; i++){
            if (Character.isUpperCase(str.charAt(i))){
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
