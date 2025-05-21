package Strings;
// 4 ways to solve this questions

// i) Using Java 8
// ii) Using indexOf() method
// iii) Using Character Array
// iv) Using set Interface method

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // // Approach 1 using Java 8 features
        String str = "programming";
        StringBuilder sb = new StringBuilder();
        // str.char() :- Converts the String into an IntStream of Unicode values of
        // characters. [112, 114, 111, 103, 114, 97, 109, 109, 105 110, 103] which
        // represent ['p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g']
        // .distinct() :- Removes duplicate characters based on their int (Unicode)
        // value. ['p', 'r', 'o', 'g', 'a', 'm', 'i', 'n']
        str.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(sb);

        // Approach 2 using indexOf() method that returns the first occurence of the
        // given char
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i + 1);
            if (idx == -1) {
                sb1.append(ch);
            }
        }
        System.out.println(sb1);

        // Approach 3
        char charArr[] = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {
            boolean repeated = false;
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                sb2.append(charArr[i]);
            }
        }
        System.out.println(sb2);

        // Approach - 4
        StringBuilder sb3 = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character ch : set) {
            sb3.append(ch);
        }
        System.out.println(sb3);
    }
}