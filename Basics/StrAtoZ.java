public class StrAtoZ {
    public static void main(String[] args) {
        char i;

        for (i='A'; i<'Z'; i++){        // it will print from a to z normally
            System.out.print(i+" ");
        }

        System.out.println();

        for (i='a'; i<'z'; i++){
            System.out.print(i+" ");
        }
    }
}
