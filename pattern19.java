import java.util.Scanner;
public class pattern19 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space= 2;
        int star= 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                if(i!=n/2){
                    System.out.print("*\t");
                }
                System.out.print("\t");
            }
            for(int k=1; k<=star; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
