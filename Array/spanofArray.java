import java.util.Scanner;
public class spanofArray {
    public static void main(String[] args) {
        
        Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int[] arr;
    arr= new int[n];;


    for(int i=0; i<arr.length; i++){
        System.out.println("Number "+ (i+1) + " :");
        arr[i]=scn.nextInt();
    }

    int max= arr[0];;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }

    int min=arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }

    int span= max-min;
    System.out.println("Span of the array is: "+span);
    }
    
}
