package Strings;

import java.util.Arrays;

public class ReverseEachWord {

    // Reverse each word in a given string 
    public static void main(String[] args) {
        String input = "java code";
        System.out.println("Original String :: "+input);
        String words[] = input.split(" "); 

        String outputStr = "";
        for(String word : words) {
            String reversed = "";
            for(int i=word.length()-1; i>=0; i--) {
                reversed += word.charAt(i);
            }
            outputStr += reversed +" ";
        }
        System.out.println("Reversed String :: "+outputStr);
    }
}
