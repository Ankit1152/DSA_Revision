package Arrays;

// TAP ACADEMY
public class SecondLargest {
    static int secondLargestElement(int nums[]) {
        int max1 = 0, max2 = 0;
        if (nums[0] > nums[1]) {
            max1 = nums[0];
            max2 = nums[1];
        } else {
            max1 = nums[1];
            max2 = nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2 && nums[i] != max1) {
                max2 = nums[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 20, 12, 20, 10 };
        // int arr[] = {20,42,6,25,30,88};
        System.out.println(secondLargestElement(arr));
    }

    public static int secondLargest(int arr[]) {
        int largest = getLargest(arr);
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (result == -1) {
                    result = i;
                } else if (arr[i] > arr[result]) {
                    result = i;
                }
            }
        }
        return result;
    }

    public static int getLargest(int arr[]) {
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }
}
