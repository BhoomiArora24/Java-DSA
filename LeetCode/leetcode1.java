import java.util.Scanner;
import java.util.Arrays;

public class leetcode1{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Give " + (i+1) + " element of array: ");
            nums[i] = scn.nextInt();
        }
        System.out.println("Enter the targeted number: ");
        int target = scn.nextInt();

        int[] output= twoSum(nums , target);
       System.out.println(Arrays.toString(output));

    }

    public static int[] twoSum(int[] nums, int target){
        int[] output= new int[2];
        int sum=0;
        for(int i=0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                sum = nums[i] + nums[j];
                if(i != j && nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
                
            }
        }
        
        
        return output;
    }
}