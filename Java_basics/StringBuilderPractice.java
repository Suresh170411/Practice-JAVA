package Java_basics;

public class StringBuilderPractice {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Masai");
        String str = new String(sb);

        System.out.println(str);    // --> Masai
    }
    
}
