import java.util.Scanner;
import java.util.Arrays;

public class defferenceofArray{

    public static void main(String[] args){

        Scanner scn= new Scanner (System.in);
        System.out.println("Enter the size of array1: ");
        int n= scn.nextInt();

        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter " + (i+1) + "element of array: ");
            arr1[i] = scn.nextInt();
        }


        System.out.println("Enter the size of array2: ");
        int k= scn.nextInt();

        int[] arr2 = new int[k];
        for(int i = 0; i < k; i++){
            System.out.println("Enter " + (i+1) + "element of array2: ");
            arr2[i] = scn.nextInt();
        }


        int[] defference = deffofArray(arr1, arr2);
        System.out.println(Arrays.toString( defference));
    }

    public static int[] deffofArray(int[] arr1, int[] arr2){
       int[] deff= new int[arr2.length];

       int borrow;

       int i = arr1.length - 1;
       int j = aar2.length - 1;
       int k = deff.length - 1;

       while(k>=0){
        if(j>i){
            deff[k] = arr2[j] + borrow - arr1[i];
            borrow = 0;
        }
        else if(i>j){
            deff
        }
       }
    }
}