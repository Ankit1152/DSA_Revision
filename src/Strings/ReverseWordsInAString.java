package Strings;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String input = "    Red Hat is the leading industry in the world   ";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String input) {
        String words[] = input.trim().split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // StringBuilder sb = new StringBuilder(word);
            result.append(new StringBuilder(word).reverse().append(" "));
        }

        return result.toString();
    }

}
