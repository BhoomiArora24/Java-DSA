import java.util.Scanner;
public class decimalAnyBase {
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int b=scn.nextInt();
        int nb=  scn.nextInt();
        int newBase=decimalBase(n, b, nb);
        System.out.println(newBase);
    }
    public static int decimalBase(int n, int b, int nb){
        int pow=0;
        int result=0;
        while(n>0){
            int dig= n%nb;
            int value = dig * (int)Math.pow(b, pow);
            result +=value;
            n=n/nb;
            pow++;
        }
        return result;
    }
}