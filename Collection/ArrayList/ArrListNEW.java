package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrListNEW {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Hello");
        list.add(10);

        System.out.println(list);

        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(1) instanceof Integer);
    }
}
