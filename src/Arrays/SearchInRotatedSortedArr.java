package Arrays;

public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2}, target = 0;
        int result = search(nums, target);
        System.out.println(result);
        int nums2[] = {4,5,6,7,0,1,2}, target2 = 3;
        int result2 = search(nums2, target2);
        System.out.println(result2);

    }

    // Search in Rotated Sorted Array   TC :- O(logn)
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {  // Notice the <= to handle equal case
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
