package DSA;
public class SumOfsqArray {
    public static void main(String[] args) {
        int n = 0;

        System.out.println(check(n));
    }

    public static boolean check(int n){
        long i=0,j=(long)Math.sqrt(n);
        
        while(i<=j){
            long curr = i*i + j*j;
            if(curr < n){
                i++;
            } 
            else if(curr > n){
                j--;
            } 
            else{
                return true;
            } 
        }
        return false;
    }
}
