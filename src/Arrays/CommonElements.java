package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// Q1.Write a program to check if two array contains same elements .
// The function should return the number which is same in both the array . 
public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5,4, 6, 4, 7,5, 8};
        List<Integer> result = optimizedCommonElements(arr1, arr2);
        System.out.println(result);  // Output: [4, 5]
    }

    // Brute force approach
    public static List <Integer> commonElements(int nums1[], int nums2[]) {
        ArrayList<Integer> common = new ArrayList<>(); 
        for(int i= 0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j] && !common.contains(nums1[i])) {
                    common.add(nums1[i]);
                }
            }
        }
        return common;
    }

     public static List<Integer> optimizedCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();
        
        for (int num : arr1) {
            set1.add(num);
        }
        
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }
        
        return new ArrayList<>(common);
    }
}
