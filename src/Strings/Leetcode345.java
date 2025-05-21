package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode345 {
    public static void main(String[] args) {
        String input = "Red Hat is the leading industry in the world";
        System.out.println("Original: " + input);
        System.out.println("Modified: " + reverseVowels(input));
    }

    // public static String reverseVowels(String s) {
    // // Set of vowels
    // Set<Character> vowels = new HashSet<>(Arrays.asList(
    // 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    // // Convert string to character array
    // char[] chars = s.toCharArray();

    // // Use two pointers to swap vowels
    // int left = 0;
    // int right = s.length() - 1;

    // while (left < right) {
    // // Move left pointer until vowel found
    // while (left < right && !vowels.contains(chars[left])) {
    // left++;
    // }

    // // Move right pointer until vowel found
    // while (left < right && !vowels.contains(chars[right])) {
    // right--;
    // }

    // // Swap vowels
    // char temp = chars[left];
    // chars[left] = chars[right];
    // chars[right] = temp;

    // left++;
    // right--;
    // }

    // return new String(chars);
    // }

    public static String reverseVowels(String str) {
        int n = str.length();
        char ch[] = str.toCharArray();

        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;

                start++;
                end--;
            }
        }

        return String.valueOf(ch);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }

        return false;
    }
}
