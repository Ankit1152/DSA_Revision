package Arrays;

import java.util.Arrays;

public class KthSmallest {
    public static int findKthSmallest(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }

    // TC :- O(nlogn)               
    public static int kthSmallest(int arr[], int start, int end, int k) {
        Arrays.sort(arr, start, end+1);

        // Return kth smallest element
        return arr[start+k-1];
    }
    
    public static void main(String[] args) {
        // int arr[] = {6,2,3,4,1,9};
        // int k = 5;
        // System.out.println("Kth smallest element = "+findKthSmallest(arr, k));

        int[] arr1 = {7, 10, 4, 3, 20, 15};    
        int k1 = 3;
        System.out.println(kthSmallest(arr1, 0, 5, k1)); // Output: 7

        int[] arr2 = {7, 10, 4, 20, 15};
        int k2 = 4;
        System.out.println(kthSmallest(arr2, 0, 4, k2));
        // Output: 15
    }

    
}
