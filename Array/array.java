public class array{

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {
         
        int[] arr;

        arr= new int[5];
        arr[0]= 72;
        arr[1]= 85;
        arr[2]= 23;
        arr[3]= 98;
        arr[4]= 67;

        // System.out.println(arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("After Swapping");
        swap(arr, 0, 4);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("New Exammple");
        int[] one= new int[3];
        one[0]= 10;
        one[1]= 20;
        one[2]= 30;

        int[] two= one;
        two[1]= 40;

        
        for(int i=0; i<one.length; i++){
            System.out.println(one[i]);
        }

        System.out.println("It does not copies the actual value -- Shallow copy");
        for(int i=0; i<two.length; i++){
            System.out.println(two[i]);
        }

        
    }
}