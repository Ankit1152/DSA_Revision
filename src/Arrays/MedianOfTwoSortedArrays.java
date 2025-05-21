package Arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 8, 17 };
        int arr2[] = { 5, 6, 7, 19, 21, 25 };
        System.out.println(findMedian(arr1, arr2));
    }

    // TC :- O(m+n)
    public static float findMedian(int nums1[], int nums2[]) {
        int mergedArr[] = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length && k <= mergedArr.length / 2) { // && k <= mergesdArr.length / 2
            if (nums1[i] < nums2[j]) {
                mergedArr[k] = nums1[i];
                i++;
                k++;
            } else {
                mergedArr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length && k <= mergedArr.length / 2) { // && k <= mergesdArr.length / 2
            mergedArr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length && k <= mergedArr.length / 2) { // && k <= mergesdArr.length / 2
            mergedArr[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(mergedArr));

        if (mergedArr.length % 2 == 0) {
            int mid = mergedArr.length / 2;
            return (float) (mergedArr[mid] + mergedArr[mid - 1]) / 2;
        } else {
            int mid = mergedArr.length / 2;
            return mergedArr[mid];
        }

    }
}
