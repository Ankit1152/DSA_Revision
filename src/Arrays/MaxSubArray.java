package Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        // Brute force
        int num[] = { -5, 4, 6, -3, 4, -1 };
        int maxSum = Integer.MIN_VALUE;
        // Iterate over all possible starting points
        for (int start = 0; start < num.length; start++) {
            // Iterate over all possible ending points for the current starting point
            for (int end = start; end < num.length; end++) {
                int currSum = 0;
                // Print the subarray from 'start' to 'end'
                System.out.print("[");
                for (int i = start; i <= end; i++) {
                    System.out.print(num[i]);
                    if (i < end) {
                        System.out.print(",");
                    }
                    currSum += num[i];
                    // Update maxSum if current subarray sum is greater
                    if (currSum > maxSum) {
                        maxSum = currSum;
                    }
                }
                System.out.println("]");
            }
        }
        System.out.println("Maximum subarray sum = " + maxSum);
    }
}
