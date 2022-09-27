public class StrBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");      // reversing a str using StringBuilder
        
        StringBuilder new_sb = new StringBuilder("");
        for (int i=sb.length()-1; i>=0; i--){
            new_sb.append(sb.charAt(i));
        }
        System.out.println(new_sb);


        // by not using another StringBuilder
        for (int i=0; i<sb.length()/2; i++){
            int start = i;
            int last = sb.length() - 1 - i;
                                                            
            char front_char = sb.charAt(start);         // by using same stringbuilder str
            char back_char = sb.charAt(last);

            sb.setCharAt(start, back_char);
            sb.setCharAt(last, front_char);
        }
        System.out.println(sb);

    }
}
