import java.util.Scanner;
public class pattern20 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star=1;
        int space= n-2;
        for(int i=  1; i<=n; i++){
            for(int j=1; j<=star; j++){
                System.out.print("*\t");
            }
            for(int j=1; j<=space; j++){
                if(i==n/2+1 && j==n/2){
                    
                        System.out.print("*\t");
                }
                else if(i>n/2+1 &&  j!=n/2 && i==n-1){
                    System.out.print("*\t");
                }
                else{
            System.out.print("\t");
                }
            }
            for(int j=1; j<=star; j++){
            System.out.print("*\t");
            }
        System.out.println();
        scn.close();
        }
    }
}
