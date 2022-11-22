package DSA;

public class CheckSubStr {
    public static void main(String[] args) {
        
        String str = "aman";
        
        for (int i=0; i<str.length(); i++){
            String bag = "";
            for (int j=i; j<str.length(); j++){
                bag+= str.charAt(j);
                System.out.println(bag);
            }
        }
    }
}
