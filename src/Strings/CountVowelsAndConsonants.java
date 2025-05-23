package Strings;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "abcgsjetled";
        countVowelsAndConsonants(str);
    }

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println(" Vowels " + vowels);
        System.out.println(" Consonants " + consonants);
    }
}
