package SlidingWindow;

public class MaximumSubarraySumOfSizeK {
    public static void main(String[] args) {
        // int arr[] = { 2, 9, 31, -4, 21, 7 };
        int arr[] = { 3, 8, 2, 5, 7, 6, 12 };
        int k = 4; // subarray size
        // int maxSum = maximumSubarraySum(arr, k);
        int maxSum = optimizedMaximumSubArraySum(arr, k);
        System.out.println(maxSum);
    }

    // Brute Force TC :- O(n^2)
    public static int maximumSubarraySum(int arr[], int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) { // notice <=
            int currSum = 0; // reset for each i
            for (int j = i; j < i + k; j++) {
                currSum += arr[j];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    // Optimized approach TC :- O(n)
    public static int optimizedMaximumSubArraySum(int nums[], int k) {
        int currSum = 0;
        for (int i = 0; i < k; i++) { // first find out the sum of first window sum O(w)
            currSum += nums[i];
        }

        int maxSum = currSum;
        for (int i = 1; i <= nums.length - k; i++) { // O(n-k)
            currSum = currSum - nums[i - 1] + nums[i + k - 1];

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }

        return maxSum;
    }
}
