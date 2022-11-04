package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    
    public static void main(String[] args) {
        
        Map<String, String> hm = new HashMap<>();

        hm.put("Odisha", "BBSR");
        hm.put("WestBengal", "Kolkata");

        System.out.println(hm);         // ---> {WestBengal=Kolkata, Odisha=BBSR}

        if (hm.containsKey("Odisha")){
            System.out.println("Yes Odisha is present in the HashMap");
        }else {
            System.out.println("No man nothing is there..");
        }

        System.out.println(hm.containsKey("Odisha"));   // --> It will return TRUE/false based on the avalability of the key

        System.out.println(hm.keySet()); // --> It will return all the KEYS present in the HashMap
        System.out.println(hm.values()); // --> It will return all the VALUES present in the HashMap

        System.out.println(hm.entrySet()); // --> [WestBengal=Kolkata, Odisha=BBSR]

        for (Map.Entry<String,String> h : hm.entrySet()){
            System.out.println(h.getKey()+"=="+h.getValue());     // FOR LOOP for HashMap
        }
    }

}
