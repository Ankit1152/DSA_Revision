package Arrays;

import java.util.Arrays;

// TAP ACADEMY (LEETCODE 26)
public class RemoveDuplicatesInSortedArr {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 8, 6, 9, 7, 7 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int rdIdx = removeDuplicates(arr);
        for (int i = 0; i < rdIdx; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int nums[]) {
        int rd = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[rd] != nums[i]) {
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd + 1;
    }
}
