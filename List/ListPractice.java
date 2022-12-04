package List;

import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        
        List<Integer> list = getList();

        for (Integer i : list){
            System.out.println(i);
        }
    }

    public static List<Integer> getList(){
        return List.of(1,2,3,4,5,6);
    }
}
