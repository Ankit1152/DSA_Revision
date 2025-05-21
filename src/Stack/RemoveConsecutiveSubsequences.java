package Stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
        int result[] = removeSubsequences(arr);
        System.out.print(Arrays.toString(result) + " ");
    }

    public static int[] removeSubsequences(int arr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty() || s.peek() != arr[i]) {
                s.push(arr[i]);
            } else if (s.peek() == arr[i]) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                    s.pop();
                }
            }
        }
        int nums[] = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            nums[i] = s.pop();
        }

        return nums;
    }
}
