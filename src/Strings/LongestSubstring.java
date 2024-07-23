package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
    // Java Program to find longest substring length which doesn't contain repeating characters in a given string
    public static void main(String[] args) {
        lengthOfLongestSubstring("abbac");
    }   

    public static void lengthOfLongestSubstring(String s) {
        String longestSubstring = null;
        int longestSubstringLength = 0;

        Map <Character, Integer> map = new LinkedHashMap<Character, Integer>(); 

        char arr[] = s.toCharArray();

        for(int i=0; i<arr.length; i++) {
            char ch = arr[i];
            if(!map.containsKey(ch)) {
                map.put(ch, i);
            }else {
                i = map.get(ch);
                map.clear();
            }

            if(map.size() > longestSubstringLength) {
                longestSubstringLength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        System.out.println(longestSubstring);
    }
}

