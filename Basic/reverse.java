import java.util.Scanner;
public class reverse {
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= scn.nextInt();
        while(n>0){
            int dig= n%10;
            n=n/10;
            System.out.println(dig);
        }
        scn.close();
    }
}
