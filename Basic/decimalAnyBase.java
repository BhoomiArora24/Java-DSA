import java.util.Scanner;
public class decimalAnyBase {
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int b=scn.nextInt();
        int newBase=decimalBase(n, b);
        System.out.println(newBase);
    }
    public static int decimalBase(int n, int b){
        int pow=1;
        int result=0;
        while(n>0){
            int dig= n%b;
            n=n/b;
            result+=dig*pow;
            pow= pow*10;
        }
        return result;
    }
}