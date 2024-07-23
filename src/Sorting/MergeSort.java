package Sorting;

import java.util.Arrays;

 // Merge Sort TC = O(nlogn) SC = O(n)
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
    
    // O(logn)
    public static void divide(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid); // left part
        divide(arr, mid + 1, ei); // right part
        // conquer part
        merge(arr, si, mid, ei);
    }


    public static void merge(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // New merged array

        int i = si;          // index for first sorted part or iterator for left part
        int j = mid + 1;     // index for 2nd sorted part or iterator for right part
        int k = 0;           // idx for new merged array or iterator for new merged array


        // conquer part    O(n)
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                merged[k++] = arr[i++];
                // k++;
                // i++;
            } else {
                merged[k++] = arr[j++];
            }
        }
        // left part or for leftover elements of 1st sorted parts
        while (i <= mid) {
            merged[k++] = arr[i++];
        }
        // right part or for leftover elements of 2nd sorted part
        while (j <= ei) {
            merged[k++] = arr[j++];
        }
        // copy new merged array elements to original array
        for (k = 0, i = si; k < merged.length; k++, i++) {
            arr[i] = merged[k];
        }
    }
}
