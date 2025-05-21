package Arrays;

public class MergeTwoSortedArrays {

    public static void mergeTwoSortedArrays(int nums1[], int nums2[]) {
        int mergedArray[] = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }

        for (int k2 = 0; k2 < mergedArray.length; k2++) {
            System.out.print(mergedArray[k2] + " ");
        }

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3, 8, 17 };
        int nums2[] = { 5, 6, 7, 19, 21, 25 };
        mergeTwoSortedArrays(nums1, nums2);
    }
}
