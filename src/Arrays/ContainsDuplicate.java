package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ContainsDuplicate {
    
    // GFG problem := using Brute force   TC :- O(n^2)
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1 && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        Collections.sort(duplicates);

        if (duplicates.isEmpty()) {
            duplicates.add(-1);
        }
        return duplicates;
    }


    // TC :- O(nlogn)
    public static ArrayList<Integer> optimizedDuplicates(int[] arr) {
        int n = arr.length;
        HashSet<Integer> seen = new HashSet<>();  // to store all the unique elements encountered in the array.
        HashSet<Integer> duplicatesSet = new HashSet<>(); // to store the elements that appear more than once.
        ArrayList<Integer> duplicates = new ArrayList<>();  // to store the final list of duplicates.

        // Iterate over the array and find duplicates
        for (int i = 0; i < n; i++) {
            if (seen.contains(arr[i])) {
                duplicatesSet.add(arr[i]);
            } else {
                seen.add(arr[i]);
            }
        }

        // Transfer duplicates to the list
        duplicates.addAll(duplicatesSet);
        Collections.sort(duplicates);

        // If no duplicates found, add -1 to the list
        if (duplicates.isEmpty()) {
            duplicates.add(-1);
        }

        return duplicates;
    }

    // Time Complexity = O(n^2) = Brute Force
    // public static boolean toCheckDuplicate(int numbers[]) {
    // for (int i = 0; i < numbers.length - 1; i++) {
    // for (int j = i + 1; j < numbers.length; j++) {
    // if (numbers[i] == numbers[j]) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // Time Complexity = O(n) using set
    public static boolean toCheckDuplicate(int numbers[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (set.contains(numbers[i])) {
                return true;
            } else {
                set.add(numbers[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 3 };
        System.out.println(duplicates(arr)); // Output: [2, 3]
        // System.out.println(toCheckDuplicate(arr));
        // System.out.println(optimizedDuplicates(arr));

    }
}
