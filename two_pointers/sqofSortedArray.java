package two_pointers;

import java.util.Arrays;

public class sqofSortedArray {
     public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};

        for(int i = 0; i< nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
}}
