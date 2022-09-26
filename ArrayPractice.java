import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size here");
        int size = sc.nextInt();

        int[] marks = new int[size]; // definig size of the array from the user

        for (int i = 0; i < size; i++) { // assigning the values dynamically
            System.out.println("Enter number");
            marks[i] = sc.nextInt();
        }

        // for (int i = 0; i < size; i++) {
        // System.out.println(marks[i]);
        // }

        int i = 0;
        do {
            System.out.println(marks[i]);       // do while loop iteration
            i++;
        } while (i < size);

        sc.close();

    }
}
