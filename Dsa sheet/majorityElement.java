import java.util.HashMap;
public class majorityElement {
    public static  void main(String[] args) {
        int[] arr = {3, 2, 3};
        int result = majorityElement(arr);
        System.out.println(majorityElement(result));
    }
    //BRUTE FORCE CODE-------
    // public static int majorityElement(int[] nums) {
    //     int majElement = 0;
    //     int count = 0;
    //     for(int num : nums){
    //         if(count == 0){
    //             majElement = num;
    //         }
    //         if(majElement == num){
    //             count++;
    //         }
    //         else{
    //             count--;
    //         }
    //     }
    //     return majElement;
    // }



    //OPTIMALCODE----HASHMAP
    // User function Template for Java


    static int majorityElement(int arr[]) {
        // code here
        
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        
        for(int key : map.keySet()){
            if(map.get(key)>arr.length/2){
                return key;
            }
        }
       
                
         return -1;
    }
}
