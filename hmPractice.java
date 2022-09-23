import java.util.*;

public class hmPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 50);
        hm.put("China", 150);
        hm.put("Pakistan", 40);

        // insertion 
        System.out.println(hm);

        // lookup or search operation
        // System.out.println(hm.containsKey("India"));  --> return TRUE OR FALSE;

        if (hm.containsKey("China")){
            System.out.println("Yes the key is present in the HashMap");
        }else {
            System.out.println("No the key is not present in the HashMap");
        }


        // it returns the value which is assosiate with corresponding key;

        System.out.println(hm.get("China")); // key exist
        System.out.println(hm.get("Indonesia")); // key doesn't exitst
    }
}
