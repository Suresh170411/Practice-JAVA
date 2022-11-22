package CloudTech;

public class HalfUpperCase {
    public static void main(String[] args) {
        String str = "Hello there Hello there";

        int mid = str.length()/2;

        String lower = "";
        String upper = "";

        for (int i=0; i<mid; i++){
            lower+= str.charAt(i);
        }

        for (int i=mid; i<str.length(); i++){
            upper+= str.charAt(i);
        }

        System.out.println(lower+upper);

    }
}
