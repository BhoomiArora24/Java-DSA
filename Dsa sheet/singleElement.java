// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.


//method used ------------XOR
// int a = 5;    // 0101 in binary
// int b = 3;    // 0011 in binary

// System.out.println(a ^ b); // Output: 6 → (0110 in binary)

public class singleElement{
    public static void main(String[] args) {
        int[] nums ={2,2,1};
        int result = singleNumber(nums);
        System.out.println(result);
    }
    public static int singleNumber(int[] nums) {
       int result = 0;
       for(int num : nums){
        result ^= num;
       }

       return result;
}
}