package HashMap;

import java.util.HashMap;

public class HashMapShortF {
    public static void main(String[] args) {
        String str = "aaabccddd";

        HashMap<Character,Integer> hm = new HashMap<>();

        for (int i=0; i<str.length(); i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }

        String bag = "";

        for (Character c : hm.keySet()){
            if (hm.get(c) %2 !=0){
                bag+= c;
            }
        }
        System.out.println(bag);
    }
}
