package Sorting;

import java.util.Arrays;

// Selection sort is similar to bubble sort
// In this we pick smaller element from the array , move to the front of the array
// 1 swap per 1 iteration
// TC :- O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
