public class majorityElement {
    public static  void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = majorityElement(nums);
        System.out.println(majorityElement(result));
    }
    
    public static int majorityElement(int[] nums) {
        int majElement = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                majElement = num;
            }
            if(majElement == num){
                count++;
            }
            else{
                count--;
            }
        }
        return majElement;
    }
}