import java.util.Scanner;public class benjaminbulb {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of bulbs: ");
        int n = scn.nextInt();
        for(int i=1; i*i<=n; i++){
            System.out.println(i*i);
        }
        scn.close();
    }
}
