public class arrGFG3{
    
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        if(arre.length == 1){
            max = arr[0];
            min = arr[0];
        }
        
        
        return new Pair(min, max);
    }
}


