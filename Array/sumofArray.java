import java.util.Scanner;
public class sumofArray {
    
    public static void main(String[] args) throws exception {
        
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
        arr2 = new int[n1];

        for(int i=0; i<arr2.length; i++){
            System.out.println("Enter the element at index " + (i+1));
            arr2[i] = scn.nextInt();
        }

        int[] sum= new int[n1>n2? n1:n2];
        int 
    }
}
