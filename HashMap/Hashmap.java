package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    
    public static void main(String[] args) {
        
        Map<String, String> hm = new HashMap<>();

        hm.put("Odisha", "BBSR");
        hm.put("WestBengal", "Kolkata");

        System.out.println(hm);         // ---> {WestBengal=Kolkata, Odisha=BBSR}

    }

}
