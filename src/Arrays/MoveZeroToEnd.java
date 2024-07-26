package Arrays;

import java.util.Arrays;

// If nz is pointing towards the non-zero element , it swaps with z index element
// z is always stick to the 0 

// TAP ACADEMY
public class MoveZeroToEnd {
    public static void moveZeroes(int nums[]) {
        if(nums.length == 0 || nums.length == 1) {
            return;
        }
        int nz = 0, z = 0;
        while(nz != nums.length) {
            if(nums[nz] != 0) {
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            }else {
                nz++;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};    
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
