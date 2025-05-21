package Strings;

public class RemoveSpecialChar {
    // Java Program to remove all special characters from a given string

    public static void main(String[] args) {
        String str = "$ja!va$&st%ar";
        // Approach 1 using replaceAll metrhod provided by String class
        // if there are any characters other than this [^a-zA-Z0-9], then replace with
        // ""
        String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainStr);
    }
}
