import java.util.Scanner;
public class pattern17 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                if(i==n/2+1){
                    System.out.print("*\t");
                }else{
                System.out.print("\t");
                }
            }
            
            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                star++;
            }else{
                star--;
            }
    }
}
}