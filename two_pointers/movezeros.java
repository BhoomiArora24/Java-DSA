package two_pointers;

public class movezeros {
    
    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0, 7, 0, 2, 9};

        int index =0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while(index< nums.length){
            nums[index++] = 0;
        }
}}
