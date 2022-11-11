package Java_basics.String;

public class EqualsMethod {
    
    public static void main(String[] args) {
        
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1.equals(s2));  //-----> TRUE
        System.out.println(s1.equals(s3));  //-----> TRUE


        System.out.println(s1 == s2);   //-----> TRUE
        System.out.println(s1 == s3);   //-----> FALSE


        String str1 = "Sachin";
        String str2 = "Sachin";
        String str3 = "Ratan";

        System.out.println(str1.compareTo(str2)); // 0
        System.out.println(str1.compareTo(str3)); // 1   -->   (str1 > str3)
        System.out.println(str3.compareTo(str1)); // -1  -->   (str3 < str1)
    }

}
