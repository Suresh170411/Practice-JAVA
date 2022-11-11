package Java_basics.StringBuilder;

public class StrBuild {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("masai");
        System.out.println(sb.reverse()); // reversing an string using string builder (iasam)


        StringBuilder message = new StringBuilder("Welcome");
        message.append(" to masai");
        System.out.println(message);        // Welcome to masai


        StringBuilder rep = new StringBuilder("Hello");
        rep.replace(0, 1, "K");             // index 0 and 1 exclude

        System.out.println(rep);        // ---> Kello
    }
}
