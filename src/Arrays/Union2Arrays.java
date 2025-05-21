package Arrays;

import java.util.HashSet;

public class Union2Arrays {
    public static void main(String[] args) {
        int num1[] = { 85, 25, 1, 32, 54, 6 };
        int num2[] = { 85, 2 };
        System.out.println(unionTwoArrays(num1, num2));
    }

    // TC :- O(n+m) SC :- O(n+m)
    public static int unionTwoArrays(int nums1[], int nums2[]) {
        HashSet<Integer> unionSet = new HashSet<>();

        // TC :- O(n)
        for (int i : nums1) {
            unionSet.add(i);
        }

        // TC :- O(m)
        for (int i : nums2) {
            unionSet.add(i);
        }

        System.out.println(unionSet);

        // for (Integer value : unionSet) {
        // System.out.println(value);
        // }
        return unionSet.size();
    }
}
