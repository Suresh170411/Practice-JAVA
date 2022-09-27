public class StrBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");      // reversing a str using StringBuilder
        
        StringBuilder new_sb = new StringBuilder("");
        for (int i=sb.length()-1; i>=0; i--){
            new_sb.append(sb.charAt(i));
        }
        System.out.println(new_sb);

    }
}
