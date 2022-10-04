public class StarPrint {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
       
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                if(i == 1 || j == 1 || i==n || j==m){       // hollow box ------->
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");          // half PYRAMID ---------->
            }
            System.out.println();
        }

        for (int i=n; i>=1; i--){
            for (int j=1; j<i; j++){
                System.out.print("*");          // reverse half PYRAMID ------->
            }
            System.out.println();
        }


        for (int i=1; i<=n; i++){
            for (int j=1; j<n-i; j++){
                System.out.print(" ");      // star with space pattern ------->
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
