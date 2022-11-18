package CloudTech;

import java.util.Arrays;
import java.util.List;

public class PrintEvenList {        // Finding even number from the list
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10,20,30,27,29,73);

        numbers.stream().filter(n -> n%2==0).forEach(System.out::println);

    }
}
