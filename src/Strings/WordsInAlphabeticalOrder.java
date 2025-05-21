package Strings;

import java.util.Arrays;

public class WordsInAlphabeticalOrder {
    public static void main(String[] args) {
        String input = "Red Hat is the leading industry in the world";
        String[] words = input.toLowerCase().split(" ");
        Arrays.sort(words);

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
