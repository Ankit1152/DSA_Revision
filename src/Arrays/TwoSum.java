package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // Brute force O(n^2)
    public static int[] twoSum(int arr[], int target) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(target == arr[i] + arr[j]) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    // TC :- O(n)     SC :- O(n) because of HashMap
    public static int[] optimizedTwoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i<nums.length; i++) {
            int num = nums[i];
            int rem = target - num;
            // searching in Linear time :- O(1)
            if(map.containsKey(rem)) {
                int index = map.get(rem);
                if(index == i) continue;
                return new int[] {i, index};
            }
        }
        
        return new int[]{};
    }

    // TC :- O(n) using Two pointer approach   SC :- O(1)    used for only sorted arrays 
    public static int[] twoSumUsingTwoPointers(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if(arr[start] + arr[end] == target) {
                return new int[] {start, end};
            } else if(arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,8};
        int target = 8;
        
        // System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(optimizedTwoSum(arr, target)));
        // System.out.println(Arrays.toString(twoSumUsingTwoPointers(arr, target)));
    }

   
}
