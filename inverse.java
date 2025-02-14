import java.util.Scanner;

public class inverse {
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= scn.nextInt();
        int inv=0;
        int op=1;
        while(n>0){
            int od=n%10;
            int ip=od;
            int id= op;
            inv=inv+id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println(inv);
        scn.close();
    }
}