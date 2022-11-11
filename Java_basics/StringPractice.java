package Java_basics;

public class StringPractice {

    public static void check_byte_arr(byte [] arr){
        String str = new String(arr);
        System.out.println("The output is : "+str); //--> def
    }

    public static void check_char_arr(char [] arr){
        String str = new String(arr);
        System.out.println(str);    // --> Masai
    }
    public static void main(String[] args) {
        byte [] byte_arr = {100,101,102};
        check_byte_arr(byte_arr);

        char [] char_arr = {'M','a','s','a','i'};
        check_char_arr(char_arr);
    }
}
