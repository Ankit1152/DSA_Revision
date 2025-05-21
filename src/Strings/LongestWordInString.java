package Strings;

public class LongestWordInString {
    public static void main(String[] args) {
        String input = "Red Hat is the leading industry in the World";

        String words[] = input.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}
