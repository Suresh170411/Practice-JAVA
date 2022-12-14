package Collection.Vector;

import java.util.Vector;

public class Practice {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);

        System.out.println(v);

        for (Integer i : v){
            System.out.println(i);
        }
    }
}
