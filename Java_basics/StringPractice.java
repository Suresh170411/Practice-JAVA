package Java_basics;

public class StringPractice {

    public static void check_byte_arr(byte [] arr){
        String str = new String(arr);

        System.out.println("The output is : "+str); //--> def
    }
    public static void main(String[] args) {
        byte [] byte_arr = {100,101,102};
        check_byte_arr(byte_arr);

    }
}
