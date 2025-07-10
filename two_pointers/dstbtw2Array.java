package two_pointers;

public class dstbtw2Array {
     public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};

        int d =2;

        int k = 0;
        for(int i = 0; i<arr1.length; i++){
            boolean isvalid = true;
            for(int j = 0; j<arr2.length; j++){
                int def = Math.abs(arr1[i]-arr2[j]);
                if(def <=d){
                    isvalid = false;
                    break;
                }
            }
            if(isvalid == true){
                k++;
            }
        }}
}
