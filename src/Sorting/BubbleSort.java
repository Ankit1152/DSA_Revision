package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble sort Tc :- O(n^2) :- It runs N - 1 times loops, in each iteration it
    // shifts the largest element to the end. Similarly, it shifts n - 1 largest
    // elements to the end
    // Greater elements shift to the end of the array in each iteration by swapping
    // with adjacent elements
    // after swapping n-1 times loop
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
