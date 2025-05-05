import java.util.Scanner;
public class pattern18 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space=0;
        int star=n;
        for(int i=1; i<=n; i++){
            for(int j=0; j<space; j++){
                System.out.print("\t");
            }
            for(int k=1; k<=star; k++){
                if(i>1 && i<=n/2 && k>1 && k<star){
                    System.out.print("\t");
                }else{
                System.out.print("*\t");
                }
            }
            System.out.println();
            if(i<=n/2){
                space++;
                star-=2;
            }else{
                space--;
                star+=2;
            }
        }
        scn.close();
    }
}
