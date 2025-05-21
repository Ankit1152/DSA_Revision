package Arrays;

public class CeilAndFloor {
    static int findFloor(int nums[], int key) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == nums[mid]) {
                return nums[mid];
            } else if (key > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (high >= 0) {
            return nums[high];
        } else {
            return -1;
        }
    }

    static int findCeil(int nums[], int key) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == nums[mid]) {
                return nums[mid];
            } else if (key > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (low < nums.length) {
            return nums[low];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 19, 23, 56, 61, 72, 88, 92 };
        int key = 72;
        System.out.println(findCeil(nums, key));
        System.out.println(findFloor(nums, key));
    }

}
