package DSA;

public class SumOfSqArr {
    public static void main(String[] args) {
        int n = 5;

        boolean flag = check(n);

        if (flag){
            System.out.println("");
        }
    }

    public static boolean check(int n){
        
        boolean flag = false;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i*i+j*j == n){
                    flag = true;
                }
            }
        }
        return flag;
    }
}
