package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Finding first Non-Repeated character in Given String
// i) Without using collection
// ii) Using Collections

public class FirstNonRepeat {
    public static void main(String[] args) {
        String str = "AABCCDEFCGB";

        // // Approach 1 Without using collection
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(str.charAt(i));
                break;
            }
        }

        // Approach 2 using HashMap concept
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        for(Entry <Character, Integer> entrySet : map.entrySet()) {
            if(entrySet.getValue() == 1) {
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }
}
