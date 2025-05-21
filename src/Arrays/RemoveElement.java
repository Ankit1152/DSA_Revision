package Arrays;

public class RemoveElement {
    // Given an integer array nums and an integer val, remove all occurrences of val
    // in nums in-place. The order of the elements may be changed. Then return the
    // number of elements in nums which are not equal to val.
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
