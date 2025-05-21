package Stack;

import java.util.Stack;

public class BalancedBrackets {

    // College Wallah Soltion of same type of bracket ex :- "()()(())"
    public static boolean isBalanced(String str) {
        // Stack<Character> s = new Stack<>();
        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // if (ch == '(' || ch == '{' || ch == '[') {
        // s.push(ch);
        // } else {
        // if (s.size() == 0) {
        // return false;
        // } else if (s.peek() == '(' || s.peek() == '{' || s.peek() == '[') {
        // s.pop();
        // }
        // }
        // }
        // if (s.size() > 0) {
        // return false;
        // } else {
        // return true;
        // }

        // ChatGPT solution for different types of brackets but I dont think it is
        // optimized
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.isEmpty()) {
                    return false;
                }
                char top = s.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(){}";
        System.out.println(isBalanced(str));
    }
}
