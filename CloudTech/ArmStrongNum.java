package CloudTech;

public class ArmStrongNum {     // check ARM STRONG num (1^3 + 5^3 + 3^3 = 1+125+27 = 153)
    public static void main(String[] args) {
        int input = 153;

        // if(isArmStrong(input)){
        //     System.out.println("The number is armStrong");
        // }else {
        //     System.out.println("This number is not ArmStrong");
        // }

        System.out.println(countDigit(input));
    }

    public static boolean isArmStrong(int input){
        int j = input;
        int digit = 0;
        int sum = 0;
        while(j > 0){
            digit = j%10;
            j = j/10;

            sum+= digit*digit*digit;
        }
        return input == sum;
    }

    public static int countDigit(int input){        // count digit logic
        
        int count = 0;

        while(input > 0){
            input = input/10;
            count++;
        }
        return count;
    }
}
