import java.util.Arrays;

public class rotateArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d=2;
        int[] result = rotateArr(arr,d);
        System.out.println(Arrays.toString(result));
        
    }
    

    static int[] rotateArr(int arr[], int d) {
        int[] result = new int[arr.length];
        int n =arr.length;
        
        for (int i = 0; i < n - d; i++) {
            result[i] = arr[i + d];
        }
        for (int i = 0; i < d; i++) {
            result[n - d + i] = arr[i];
        }
        return result;
    }
}


