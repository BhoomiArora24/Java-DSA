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
        int[] defference = new int[arr2.length];
        int carry = 0;
        
        
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = defference.length-1;

        int a1v = i >= 0? arr1[i]: 0;

        while(k >= 0){
            if(arr2[j] + carry >= a1v){
                defference[k] = arr2[j] + carry - a1v;
                carry = 0;
            }
            else{
                defference[k] = arr2[j] + carry - a1v;
                carry= -1;
            }
            i--;
            j--;
            k--;

            int idx = 0;
            while(idx<defference.length){
                if(defference[idx]==0){
                    
                    idx++;
                }
                else{
                    break;
                }
            }

            if(idx < defference.length){
                System.out.println("Defference array is: " + Arrays.toString(defference));
                idx++;
            }

          return defference;
        }
        return defference;
    }
}