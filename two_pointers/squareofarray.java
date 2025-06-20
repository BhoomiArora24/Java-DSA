package two_pointers;
import java.util.Arrays;

public class squareofarray {
    public static void main(String[] args) {
        int[] arr = {2, -10, 5, 4, 1};
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        int[] result = sqArray(arr, left, right);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sqArray(int[] arr, int left, int right){
        int[] result = new int[arr.length];
        int index = arr.length - 1;

        while(left <= right){
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if(leftSquare > rightSquare){
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}
