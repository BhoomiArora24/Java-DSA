import java.util.Scanner;
import java.util.Arrays;

public class defferenceofArray{

    public static void main(string[] args){

        Scanner scn= new Scanner (System.in)
        System.out.println("Enter the size of array1: ")
        int n= scn.nextInt();

        int[] arr1 = new int[n];
        for(int i = 0; i < n.length; i++){
            System.out.println("Enter " + (i+1) + "element of array: ")
            arr1[i] = scn.nextInt();
        }


        System.out.println("Enter the size of array2: ")
        int k= scn.nextInt();

        int[] arr2 = new int[n];
        for(int i = 0; i < n.length; i++){
            System.out.println("Enter " + (i+1) + "element of array: ")
            arr1[i] = scn.nextInt();
        }

        int[] defference = deffofArray(arr1, arr2);
        System.out.println(Arrays.toString("Defference of array is: " + defference));
    }

    public static int[] deffofArray(int[] arr1, int[] arr2){
        int[] defference = new int[arr2.length];
        
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = defference.length-1;
}