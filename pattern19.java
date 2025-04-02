import java.util.Scanner;
public class pattern19 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space= 2;
        int star= 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                if(i==n/2+1){
                    System.out.print("*\t");
                }
                else if(i==1 && j<=n/2){
                    System.out.print("*\t");
                }
                else if(i>n/2+1 && j==1){
                    System.out.print("*\t");
                }
                else{
                System.out.print("\t");
                }
            }
            for(int k=1; k<=star; k++){
                System.out.print("*\t");
            }
            
            for(int j=1; j<=space; j++){
                if(i==n/2+1){
                    System.out.print("*\t");
                }
                else if(i<=n/2 && j==space){
                    System.out.print("*\t");
                }else if(i==n && j<=space){
                    System.out.print("*\t");
                }
                else{
                System.out.print("\t");
                }
            }
            System.out.println();
        }
            scn.close();
    }
}

