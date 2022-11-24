package DSA;

public class SprialTraversal {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int N = mat.length;
        int M = mat[0].length;

        int top = 0;
        int bottom = N-1;
        int left = 0;
        int right = M-1;
        int dir = 1;


        while (left <= right && top <= bottom){
            
            if(dir == 1){
                for (int i=top; i<=bottom; i++){
                    System.out.print(mat[i][left]+" ");
                }
                left++;
                dir = 2;
            }else if(dir == 2){
                for (int i=left; i<=right; i++){
                    System.out.print(mat[bottom][i]+" ");
                }
                bottom--;
                dir = 3;
            }else if(dir == 3){
                for (int i=bottom; i>=top; i--){
                    System.out.print(mat[i][right]+" ");
                }
                right--;
                dir = 4;
            }else {
                for (int i=right; i>=left; i--){
                    System.out.print(mat[top][i]+" ");
                }
                top++;
                dir = 1;
            }
        }
    }
}
