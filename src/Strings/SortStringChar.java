package Strings;

import java.util.Arrays;

// Sort the string characters of given string in alphabetical order
public class SortStringChar {
    public static void main(String[] args) {
        String str = "java";

        // using without sort() method
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));

        // Approach 2 using sort method
        String str2 = "rock";
        char charArr[] = str2.toCharArray();
        Arrays.sort(charArr);
        System.out.println(new String(charArr));
    }
}
