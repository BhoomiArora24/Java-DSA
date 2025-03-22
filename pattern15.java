import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int star=1;
        int space=n/2;
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            int cval=val;
            for(int k=1;k<=star;k++){
                
                
                System.out.print(cval);
                if(k<=star/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            System.out.println();
            if(i<n/2+1){
                space--;
                star+=2;
                val++;
            }else{
                space++;
                star-=2;
                val--;
            }
            
        }
    }
}
