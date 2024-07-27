package Arrays;

import java.util.Arrays;

public class RotateArray {
    // TC :- O(k*n)
    public static void leftRotateByOne(int nums[]) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }

    public static void rotate(int nums[], int k) {
        k = k % nums.length;
        if (k < 0) {
            k = k + nums.length;
        }
        for (int i = 1; i <= k; i++) {
            leftRotateByOne(nums);
        }
    }

    public static void main(String[] args) {
        // int nums[] = {10,20,30,40,50,60,70,80,90};
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(Arrays.toString(nums)); // [1, 2, 3, 4, 5]

        // rotate(nums, -1);
        // System.out.println(Arrays.toString(nums)); // [5, 2, 3, 4, 1]

        rotateByKTimes(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    // Rotate an array by k times TC :- O(n)
    public static void rotateByKTimes(int nums[], int k) {
        k = k % nums.length;
        if (k < 0) {
            k = k + nums.length;
        }
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public static void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
