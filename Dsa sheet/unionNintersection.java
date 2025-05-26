import java.util.*;
public class unionNintersection {
    

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        HashSet<Integer> result = Unionofarray(arr1, arr2);
        System.out.println(result);

        HashSet<Integer> result2 = Intersection(arr1, arr2);
        System.out.println(result2);
    }

    static HashSet<Integer> Unionofarray(int[] arr1, int[] arr2){
        HashSet<Integer> Set = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;


        for (int i = 0; i<n1; i++){
            Set.add(arr1[i]);
        }
        for(int j = 0; j< n2; j++){
            Set.add(arr2[j]);
        }
        // return Set.size();
        return Set;
    }

    static HashSet<Integer> Intersection(int[] arr1, int[] arr2){
        HashSet<Integer> Set2 = new HashSet<>();
        HashSet<Integer> IntersectionSet = new HashSet<>();


        int n1 = arr1.length;
        int n2 = arr2.length;


        int count =0;
        for (int  i = 0; i<n1; i++){
            Set2.add(arr1[i]);
        }

        
        for(int i =0; i<n2; i++){
            if(Set2.contains(arr2[i])){
                IntersectionSet.add(arr2[i]);
                count++;
                Set2.remove(arr2[i]);
            }
        }
        return IntersectionSet;
    }
}
