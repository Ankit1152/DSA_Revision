package Strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {
    // Find the occurence of each character in a string
    public static void main(String[] args) {
        String str = "hello";

        Map <Character, Integer> map = new HashMap<>();

        // for(int i=0; i<str.length(); i++) {
        //     if(map.containsKey(str.charAt(i))) {
        //         map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        //     }
        //     else{
        //         map.put(str.charAt(i), 1);
        //     }
        // }
        // System.out.println(map);


        char arr[] =  str.toCharArray();
        for(char ch : arr) {
            if(!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int count = map.get(ch);
                map.put(ch, count+1);
            }
        }
        System.out.println(map);
    }
}
