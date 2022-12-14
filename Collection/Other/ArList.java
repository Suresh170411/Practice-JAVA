package Collection.Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArList {
    public static void main(String[] args) {
        
        List<Integer> candles = new ArrayList<>();
        candles.add(4);
        candles.add(2);
        candles.add(3);
        candles.add(6);
        candles.add(1);

        Collections.sort(candles, Collections.reverseOrder());

        System.out.println(candles);

    }
}
