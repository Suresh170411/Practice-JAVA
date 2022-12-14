package Collection.ArrayList;

import java.util.*;
public class Practice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        List<Integer> newList = new ArrayList<>(4);
        newList.add(10);
        newList.addAll(1,list);
        System.out.println(newList);


        // .clear() method 
        list.clear();

        System.out.println(list);

        // TRAVERSAL ON A ARRAYLIST 
        for (Integer i : newList){
            System.out.println(i);
        }
        System.out.println("=====================");

        // TRAVERSAL USING ITERATOR
        Iterator<Integer> itr = newList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
