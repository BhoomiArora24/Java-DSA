package two_pointers;

public class twoPointer0sn1s{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1};

        int left = 0;
        int right = arr.length-1;

        while(left<right){//its about he indexes not he value that is os and 1s 
            if(arr[left]==1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            
            else if(arr[left]==0){
                left++;
            }

            else if(arr[right] ==1){
                right--;
            }
        }
        
        for(int num: arr){
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
