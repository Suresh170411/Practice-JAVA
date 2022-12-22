package NEW.Recursion;

public class Practice18 {
    public static void main(String[] args) {
        String str = "abxgexixox";
        
    }

    public static void elementAtEndBF(String str){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'x'){
                count++;
                continue;
            }else {
                sb.append(str.charAt(i));
            }
        }
        // System.out.println(sb);

        for (int i=0; i<count; i++){
            sb.append('x');
        }

        System.out.println(sb.toString());
    }
}
