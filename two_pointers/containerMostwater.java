package two_pointers;
import java.util.Arrays;

public class containerMostwater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = maxArea(height);
        System.out.println(result);
    }

    public static int maxArea(int[] height) {
         int left = 0;
         int right = height.length-1;
         int result = 0;
         while(left<right){
            int area = Math.min(height[left], height[right])* (right-left);
//             The height of the container is the shorter line (because water overflows from the shorter side).

// The width is the distance between left and right.
            result = Math.max(result, area);

            if(height[left]<height[right]){
                // Move the pointer pointing to the shorter line, because only that gives a chance of getting a taller line.
                left++;
            }
            else{
                right--;
            }
         }
         return result;
    }
}

