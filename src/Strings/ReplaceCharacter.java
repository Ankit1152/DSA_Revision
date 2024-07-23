package Strings;

import java.util.Arrays;

// Java Program to replace character with its first occurance in string
// Input  opentext        charToReplace = 't'
// Output open1ex2
public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = "deloitte";
        char charToReplace = 't';

        // To check the character is available or not
        if(str.indexOf(charToReplace) == -1) {
            System.out.println("Character is not present in the string");
            System.exit(0);
        }

        // Logic to replace char occurence in string
        int count = 1;
        for(int i=0; i<str.length(); i++) {
            char charVal = str.charAt(i);
            if(charVal == charToReplace) {
                str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);

        
        // char arr[] = str.toCharArray();
        // int count = 1;
        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i] == charToReplace) {  // o==t p==t e==t n==t t==t e==t x==t t==t
        //         arr[i] = String.valueOf(count).charAt(0);
        //         count++;
        //     }
        // }
        // System.out.println(new String(arr));

    }
}
