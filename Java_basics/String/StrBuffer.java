package Java_basics.String;

public class StrBuffer {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Masai");
        
        System.out.println("STRING BUFFER: "+sb);       // --> Masai

        String str = new String(sb);

        System.out.println("STRING: "+str);         // --> Masai

    }
}
