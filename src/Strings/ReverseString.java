package Strings;
// 4 ways to remove a strings
// i) Using toCharArray() method provided by String class
// ii) Using charAt(int index) method
// iii) Using java.lang.StringBuffer class provided reverse() method
// iv) Using java.lang.StringBuilder class provided reverse() method

public class ReverseString {
    public static void main(String[] args) {
        // Approach 1
        String str = "hello";
        char chArr[] = str.toCharArray();
        for(int i = chArr.length-1; i>=0; i--) {
            System.out.print(chArr[i]);
        }

        System.out.println();

        // Approach 2
        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        // Approach-3
        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());

        System.out.println();

        // Approach 4
        StringBuilder sBuilder = new StringBuilder(str);
        System.out.print(sBuilder.reverse());
    }
}
