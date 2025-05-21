package Arrays;

public class SpanOfArray {

    public static int span(int nums[]) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 42, 88, 10, 99, 6 };
        System.out.println(span(arr));
    }

}
