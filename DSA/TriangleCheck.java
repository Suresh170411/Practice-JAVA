package DSA;

public class TriangleCheck {
    
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int c = 9;

        if( (a+b) > c && (a+c) > b && (c+b) > a){
            System.out.println("Yes This is a Triangle");
        }else {
            System.out.println("Not a triangle");
        }
    }

}
