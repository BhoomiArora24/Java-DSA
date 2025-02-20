import java.util.Scanner;

public class pattern2 {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=5; j<=i; j++){
            System.out.print("*");
            }
            System.out.print("\n");
        }
        scn.close();
    }
}