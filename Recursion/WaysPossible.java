package Recursion;

public class WaysPossible {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ways(n));
    }

    public static int ways(int n){
        // if (n == 0 || n == 1){
        //     return 1;
        // }
        if (n < 0) return 1;
        if (n <= 1) return 1;

        return ways(n-1) + ways(n-2) + ways(n-3);
    }
}
