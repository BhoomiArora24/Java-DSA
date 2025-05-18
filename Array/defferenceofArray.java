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

       int borrow =10;

       int i = arr1.length - 1;
       int j = arr2.length - 1;
       int k = deff.length - 1;

       while(k >= 0){
        int d1 = i >= 0 ? arr1[i] : 0;
        int d2 = j >= 0 ? arr2[j] : 0;

        if(d2 > d1 || d2 == d1){
            borrow = 0;
            deff[k] = (d2 + borrow) - d1;
            System.out.println("deff[k]: "+ deff[k]);

        }
        else{
            borrow = 10;
            deff[k] = (d2 + borrow) - d1;
            System.out.println("deff[k]: "+ deff[k]);
            
            
        }

        
        i--;
        j--;
        k--;

        if(borrow == 10 && j >= 0){
            arr2[j]--;
        }
        

        


        
       }
       
       int[] newDeff = new int[deff.length-1];
        if(arr2[0] == 0){
            for(int m=1; m<deff.length; m++){
                newDeff[m-1] = deff[m];
            }
        }
       return newDeff;
      
    }
}