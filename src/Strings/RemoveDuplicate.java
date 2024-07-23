package Strings;
// 4 ways to solve this questions
// i) Using Java 8
// ii) Using indexOf() method
// iii) Using Character Array
// iv) Using set Interface method

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate{
    public static void main(String[] args) {
        // // Approach 1               using Java 8 features
        String str = "programming";
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char)c));
        System.out.println(sb);


        // Approach 2               using indexOf() method
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i+1);
            if(idx == -1) {
                sb1.append(ch);
            }
        }
        System.out.println(sb1);

        // Approach 3              
        char charArr[] = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<charArr.length; i++) {
            boolean repeated = false;
            for(int j = i+1; j<charArr.length; j++) {
                if(charArr[i] == charArr[j]) {
                    repeated = true;
                    break;
                }
            }
            if(!repeated) {
                sb2.append(charArr[i]);
            }
        }
        System.out.println(sb2);


        // Approach - 4   
        StringBuilder sb3 = new StringBuilder();
        Set <Character> set = new LinkedHashSet<>();
        for(int i=0; i<str.length(); i++) {
            set.add(str.charAt(i));
        }
        for(Character ch : set) {
            sb3.append(ch);
        }
        System.out.println(sb3);
    }
}