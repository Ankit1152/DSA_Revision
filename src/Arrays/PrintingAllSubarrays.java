package Arrays;

public class PrintingAllSubarrays {
    public static void main(String[] args) {
        int num[] = {-5,4,6,-3,4,-1};
        int n = num.length;
        // Iterate over all possible starting points
        for (int start = 0; start < n; start++) {
            // Iterate over all possible ending points for the current starting point
            for (int end = start; end < n; end++) {
                // Print the subarray from 'start' to 'end'
                System.out.print("[");
                for (int i = start; i <= end; i++) {
                    System.out.print(num[i]);
                    if (i < end) { 
                        System.out.print(",");
                    }
                }
                System.out.println("]");
            }
        }

    }
}
