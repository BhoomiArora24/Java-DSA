import java.util.Scanner;
import java.util.Arrays;
public class arrleetcode2{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Size of array1: ");
        int s1 = scn.nextInt();
        
        int[] nums1 = new int[s1];
        for(int i = 0; i < s1; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            nums1[i] = scn.nextInt();
        }

        System.out.println("Size of array2: ");
        int s2 = scn.nextInt();
        
        int[] nums2 = new int[s2];
        for(int i = 0; i < s2; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            nums2[i] = scn.nextInt();
        }

        double median = medianOfArray(nums1, nums2);
        System.out.println("Medain: " + median);
        
    }

    public static double medianOfArray( int[] nums1, int[] nums2){
        int[] newArr =  new int[nums1.length + nums2.length];
        for( int i = 0; i < nums1.length; i++){
            newArr[i] = nums1[i];
        }

        for( int i = 0; i < nums2.length; i++){
            newArr[nums1.length + i] = nums2[i];
        }

        Arrays.sort(newArr);
        System.out.println("newArr" + Arrays.toString(newArr));

        double mainMed;

        if(newArr.length % 2 == 0){
            int med1 = newArr[(newArr.length/2) - 1];
            int med2 = newArr[newArr.length/2];
            mainMed = (med1 + med2) /2.0;
        }
        else{
            mainMed = newArr[newArr.length/2];
        }
        
        return mainMed;
    }
}