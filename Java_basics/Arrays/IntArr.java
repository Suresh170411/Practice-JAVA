package Java_basics.Arrays;

import java.util.Arrays;

public class IntArr {
    public static void main(String[] args) {
        
        int [] marks = {10,20,30,40};

        String [] names = new String [3]; // -----> SIZE 3

        names[0]="Suresh";
        names[1]="Abhishek";
        names[2]="Padmanabh";

        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(names));

        // =============== FOR LOOPS ===================
        for (int i=0; i<names.length; i++){     // normal for loop
            System.out.println(names[i]);
        }

        for (String s : names){
            System.out.println(s);      // ENHANCHED FOR LOOP
        }

    }
}
