package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class AList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        
        // ADD elements ------------->
        list.add(0);
        list.add(1);
        list.add(3);

        // GET elements -------------->
        int res = list.get(2);
        System.out.println(res);

        // ADD element in BETWEEN ------------>
        list.add(1,5);
        System.out.println(list);

        // SET element ------------->
        list.set(0,8);
        System.out.println(list);

        // DELETE element ----------------->
        list.remove(0);
        System.out.println(list);

        // LENGTH of the LIST ---------->
        int size = list.size();
        System.out.println(size);

        // For loop for LIST
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        // SORTING ArrayList ------------>
        Collections.sort(list);
        System.out.println(list);
    }
}
