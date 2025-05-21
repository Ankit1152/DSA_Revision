package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            // automatic adds the value at the end of the arrayList
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(); // we can use directly main function me Static class using make them static
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(60);

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
            // s.pop();
        }

    }
}
