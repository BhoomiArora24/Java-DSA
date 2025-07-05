import java.util.Arrays;

class removeDupaArrayII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
    int result = removeDuplicates(nums);
            System.out.println(result);
        

}
public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int i = 2;
        for(int j = 2; j<nums.length; j++){
            if(nums[j]!= nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
            
        }
        return i;
    }
}

