package Arrays;

// An element is a leader, if it is a greater than all the elements to its right side and the rightmost element is always a leader  
public class LeadersInAnArray {
    // TC :- O(n^2) Brute Force
    public static void findLeaders(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    // TC :- O(n)
    public static void optimizedFindLeaders(int nums[]) {
        int currLeader = nums[nums.length - 1];
        System.out.print(currLeader + " ");
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > currLeader) {
                currLeader = nums[i];
                System.out.print(currLeader + " ");
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 8, 11, 5, 11, 7, 6, 3 };
        findLeaders(nums);
        // optimizedFindLeaders(nums);
    }
}
