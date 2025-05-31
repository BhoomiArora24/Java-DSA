import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = reverseArray(arr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] reverseArray(int[] arr){
        int[] result = new int[arr.length];
        int n = arr.length;
        for(int i =0; i< n; i++){
            result[i] = arr[n - i - 1];
        }
        return result;
    }
}
