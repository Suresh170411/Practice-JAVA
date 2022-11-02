package Recursion;

public class RecNumPrint {
    
    public static void printNum(int n){

        if (n == 6){
            return;
        }

        System.out.print(n+" ");        // printing numbers using RECURSION
        printNum(n+1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }

}
