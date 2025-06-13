import java.util.HashMap;

public class subarraySumK {
    public static void main(String[] args) {
        int[] arr = {10};
        int k = 10;

        int result = subarraySum(arr, k);
        System.out.println(result);
    }

    // public static int subarraySum(int[] arr, int k){
    //     int count = 0;
    //     for(int i = 0; i< arr.length; i++){
    //         int sum = 0;
    //         for(int j = i; j< arr.length; j++){
    //             sum += arr[j];
    //             if(sum == k){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public static int subarraySum(int[] arr, int k){
        int count =0;
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);//if sum-k exists, it means a subarray with sum k has been found.

            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum, 1);

            }
        }                                                                                            
        return count;
    }
}
