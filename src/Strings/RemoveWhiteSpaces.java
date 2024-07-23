package Strings;

public class RemoveWhiteSpaces {
    // Remove All whiteSpaces from Given String
    public static void main(String[] args) {
        String str = "  j    a  v  as  ta  r   ";
        String trimmedStr = str.trim();  // trim() method removes the whitespaces from the start and end
        System.out.println(trimmedStr);
        String str1 = str.replaceAll("\\s", "");
        System.out.println(str1);
    }
}
