package Arrays;

public class ThreeSum {
    // Brute force :- TC :- O(n^3)     
    public static boolean findThreesum(int arr[], int target) {
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++) {
                for(int k = j+1; k<arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Two Pointer approach

    
    public static void main(String[] args) {
        int arr[] = {12,3,7,1,6,9};
        int target = 24;

        if(findThreesum(arr, target)) {
            System.out.println("Yes there is a triplet in the arrays whose sum = target");
        }else {
            System.out.println("Not exist");
        }
    }

   
}
