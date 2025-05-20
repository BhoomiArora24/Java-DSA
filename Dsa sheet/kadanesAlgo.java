import java.util.Scanner;
public class kadanesAlgo {
    public static void main(String[] args){
        
        int[] arr = {4,3,7,5,9,2,-8,-6,9,10};

        int result = kadanealgo(arr);
        System.out.println(result);
    }
    public static int kadanealgo(int[] arr){
        int csum = arr[0];
        int osum = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(csum>=0){
                csum += arr[i];
            }else{
                csum = arr[i];
            }
            if(csum>osum){
                osum = csum;
            }
        }

        return osum;
    }
    
}
