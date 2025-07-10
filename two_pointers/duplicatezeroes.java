package two_pointers;

public class duplicatezeroes {
     public static void main(String[] args) {
        int[] arr = {1,8,0,2,0,0,8,3,7};

        int possibleDups = 0;
        int length = arr.length - 1;

        // Count how many zeros can be duplicated
        for (int left = 0; left <= length - possibleDups; left++) {
            if (arr[left] == 0) {
                // Edge case: last 0 can't be duplicated if at boundary
                if (left == length - possibleDups) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start from the last index where we can safely write
        int last = length - possibleDups;

        // Move backwards and duplicate zeros
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
}
}