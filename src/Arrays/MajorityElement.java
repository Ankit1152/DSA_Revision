package Arrays;

import java.util.HashMap;
import java.util.Map;

// Q1. Majority Element
// Given an integer array of size n, find all elements that appear more than [n/3] times 
public class MajorityElement {
    public static void majorityElement(int nums[]) {
        // Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Stores the frequency of each number in the array into the HashMap
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.print(key + " ");
            }
        }
    }

    public static void maj(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.print(key + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        majorityElement(arr);
    }
}
