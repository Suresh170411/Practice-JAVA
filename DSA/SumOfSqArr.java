package DSA;
public class SumOfSqArr {
    public static void main(String[] args) {
        int n = 0;

        System.out.println(check(n));
    }

    public static boolean check(int n){
        
        for (long i=0; i*i <= n; i++){
            for (long j=0; j*j <= n; j++){
                if (i*i + j*j == n){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkSum(int n){
        //<------------------ optimized Brute force 2 ----------->

        for(long i=0;i*i <= n;i++){
            double b = Math.sqrt(n-i*i);
            if(b == (int)b) return true;
        }
        return false;
    }
}
