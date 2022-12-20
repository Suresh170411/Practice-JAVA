package NEW.Recursion;

public class Practice17 {
    public static void main(String[] args) {
        String str = "Hello";
        printReverse(str,str.length()-1);
        System.out.println();
        printCharReverseBf(str);
    }
    public static void printReverse(String str,int n){
        
        if (n == 0){
            System.out.print(str.charAt(n)+" ");
            return;
        }

        System.out.print(str.charAt(n)+" ");
        printReverse(str,n-1);
    }
    public static void printCharReverseBf(String str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
