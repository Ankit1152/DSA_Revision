package Arrays;

// Find the count of smaller or equal elements of a given value in a sorted Arrays
public class CountSmallerAndEqualElements {

    // Case 1:- No duplicates in the arrays
    static int countSmallAndEqualElements(int nums[], int key) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key == nums[mid]) {
                // Case 2 :- Duplicates exists in the array
                while (mid + 1 < nums.length && nums[mid + 1] == key) {
                    mid++;
                }
                break;
            } else if (key < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // Case 3 :- key doesn't exist
        if (nums[mid] > key) {
            return mid;
        } else {
            return mid + 1;
        }
    }

    public static void main(String[] args) {
        // int nums[] = { 2, 6, 12, 18, 21, 26, 33, 42 };
        // int nums1[] = { 2, 6, 12, 18, 21, 26, 26, 26 };
        int nums2[] = { 2, 6, 12, 24, 26, 26, 28, 30 };
        int key = 25;
        System.out.println(countSmallAndEqualElements(nums2, key));

    }
}