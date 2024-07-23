package Sorting;

import java.util.Arrays;


// first we divide the array into two parts sorted and unsorted part,
// then we pick the element one by one from the unsorted part, place the element at the right place in the sorted part 
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;  // last index of sorted part
            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }
    }
}
