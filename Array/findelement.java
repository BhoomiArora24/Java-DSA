import java.util.Scanner;
public class findelement {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scn.nextInt();

        int[] arr;
        arr = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the element " + (i+1)+  " :");
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the element which needs to be found:");
        int target = scn.nextInt();

        int tg= -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== target){
                tg=i;
                System.out.println("Element found at index " + i);
            }
            
        }
        
    }
}
