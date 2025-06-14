package two_pointers;

import java.util.Arrays;

public class oddeven {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 7, 6, 2, 9};

        int left = 0;
        int right = arr.length - 1;

        // Step 1: Separate even and odd numbers
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else {
                if (arr[left] % 2 == 0) left++;
                if (arr[right] % 2 == 1) right--;
            }
        }

        // Step 2: Sort even part in ascending
        Arrays.sort(arr, 0, left);

        // Step 3: Sort odd part in descending
        Arrays.sort(arr, left, arr.length);
        

        // Print final result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

   
}
