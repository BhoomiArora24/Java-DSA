import java.util.HashMap;

public class containsDuplicate {
     public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        

        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
            int count = 0;
            int n = nums.length;
            HashMap <Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], count + 1);
                    return true;
                }
                else{
                    map.put(nums[i], 0);
                    
                }
            }
            return false;
        }
}