package Arrays;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 2, 8, 6 };
        System.out.println(findPeakElement(arr));
        System.out.println(optimizedPeakElement(arr));

    }

    // Brute force TC - O(n) SC - O(1)
    public static int findPeakElement(int arr[]) {
        // Corner case: if array has only one element
        if (arr.length == 1) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            // Check if the first element is a peak
            if (i == 0 && arr[i] > arr[i + 1]) {
                return 0;
            }

            // Check if the last element is a peak
            if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                return arr.length - 1;
            }

            // Check if the current element is a peak
            if (i > 0 && i < arr.length - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        // If no peak is found (though the problem guarantees at least one peak)
        return -1;
    }

    // Find the Peak element TC :- O(nlogn) SC :- O(1)
    public static int optimizedPeakElement(int arr[]) {
        if (arr.length == 1) {
            return 0;
        }
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
