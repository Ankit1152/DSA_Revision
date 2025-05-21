package Strings;

public class CountWordsInString {
    public static void main(String[] args) {
        String input = "   Red Hat is the leading industry in the world   ";
        String[] words = input.trim().split("\\s+");
        System.out.println("Word count: " + words.length);
    }

    // Reverse words in a String Leetcode have solve
}
