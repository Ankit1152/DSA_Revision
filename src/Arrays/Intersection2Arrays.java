package Arrays;

import java.util.HashSet;

public class Intersection2Arrays {

    public static int intersection2Arrays(int nums1[], int nums2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int value : nums1) {
            set.add(value);
        }

        int count = 0;
        for (int value : nums2) {
            if (set.contains(value)) {
                count++;
                set.remove(value);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        int count = intersection2Arrays(arr1, arr2);
        System.out.println(count);
    }
}
