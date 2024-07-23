package Arrays;

public class MinMax {
    // TC :- O(n)   SC :- O(1)
    public static void findMinMax(int arr[]) {
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            // if(arr[i] > max ) {
            //     max = arr[i];
            // }
            // if(arr[i] < min) {
            //     min = arr[i];
            // }
            min = Math.min(arr[i],min);
            max = Math.max(arr[i], max);
        }
        System.out.println("Minimum:- "+min);
        System.out.println("Maximum:- "+max);
    }
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,1,9};
        findMinMax(arr);
    }
}