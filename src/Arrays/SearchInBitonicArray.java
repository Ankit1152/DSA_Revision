package Arrays;

public class SearchInBitonicArray {
    static int ascendingBinarySearch(int nums[], int key, int range) {
        int low = 0, high = range;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == nums[mid]) {
                return mid;
            } else if (key < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int descendingBinarySearch(int nums[], int key, int range) {
        int low = 0, high = range;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == nums[mid]) {
                return mid;
            } else if (key < nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int findBitonicPoint(int nums[]) {
        int low = 0, high = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) { // for increasing side case
                low = mid;
            } else {
                high = mid;
            }
        }
        return -1;
    }

    static int searchInBitonic(int nums[], int key, int bIndex) {
        if (key == nums[bIndex]) {
            return bIndex;
        }
        if (key > nums[bIndex]) {
            return -1;
        }

        int res1 = ascendingBinarySearch(nums, key, bIndex - 1);
        if (res1 != -1) {
            return res1;
        }

        int res2 = descendingBinarySearch(nums, key, bIndex + 1);
        if (res2 != -1) {
            return res2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 6, 7, 8, 9, 10, 3, 2, 1 };
        int b = 8;
        int bIndex = findBitonicPoint(nums);

        System.out.println(searchInBitonic(nums, b, bIndex));

    }
}
