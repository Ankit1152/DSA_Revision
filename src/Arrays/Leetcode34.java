// 34. Find First and Last Position of Element in a Sorted Array

// Given an array of integers nums sorted in non-decreasing order,
// find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Example 3:
// Input: nums = [], target = 0
// Output: [-1,-1]

package Arrays;

import java.util.Arrays;

public class Leetcode34 {
    static int[] searchRange(int nums[], int key) {
        int low = 0, high = nums.length - 1, mid = 0;
        int[] res = { -1, -1 };

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key == nums[mid]) {
                res[0] = mid;
                high = mid - 1; // move towards left
            } else if (key > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length - 1;
        mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key == nums[mid]) {
                res[1] = mid;
                low = mid + 1; // move towards right
            } else if (key > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 4, 4, 4, 4, 4, 6, 7 };
        int key = 4;
        System.out.println(Arrays.toString(searchRange(nums, key)));
    }
}
