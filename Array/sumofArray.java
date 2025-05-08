import java.util.Scanner;
public class sumofArray {
    
    public static void main(String[] args){
        
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the no of elements to be printed in an array:");
        int n1= scn.nextInt();

        int[] arr1;
        arr1 = new int[n1];

        for(int i=0; i<arr1.length; i++){
            System.out.println("Enter the element at index " + (i+1));
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter the no of elements to be printed in an array:");
        int n2= scn.nextInt();

        int[] arr2;
        arr2 = new int[n2];

        for(int i=0; i<arr2.length; i++){
            System.out.println("Enter the element at index " + (i+1));
            arr2[i] = scn.nextInt();
        }

        int[] sum= sumofArray(arr1, arr2, n1, n2);
        System.out.println("Sum of the two arrays is: "+sum);
        for (int val : sum) {//to get all the value stored in sum and get it printed in same line
            System.out.print(val);
        }
        System.out.println();
    }

    public static int[] sumofArray(int[] arr1, int[] arr2, int n1, int n2){
        int[] result;//created an array for storing result
        result = new  int[n1>n2? n1:n2];// using ternary operator stores the highest length

        
        int carry =0;

        int i= arr1.length -1;//for starting adding from right side
        int j= arr2.length -1;
        int k= result.length -1;

        while(k >= 0){
            int d1= i>=0 ? arr1[i]:0;//if digit is given then stores that value otherwise o
            int d2= j>=0 ? arr2[j]:0;

            int digit= d1+d2+carry;
            result[k]=digit %10;
            carry = digit/10;

           

            i--;
            k--;
            j--;
        }

        if(carry>0){//for adding carry in last by increasing the length
            int[] newResult= new int[result.length+ 1];
            newResult[0]=carry;
            for (int m = 0; m < result.length; m++) {
                newResult[m + 1] = result[m];
            }
            return newResult;
        }
        return result;
    }
}
