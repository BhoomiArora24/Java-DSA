import java.util.Scanner;
public class baseToBase {
    
    
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int b=scn.nextInt();
        int nb=scn.nextInt();
        int newBase=baseToDecimal(n, b);
        System.out.println(newBase);
        int ConversionBase=decimaltoBase(n, b,nb);
        System.out.println(ConversionBase);
    }
    public static int baseToDecimal(int n, int b){
        int pow=0;
        int result=0;
        int d=10;
        while(n>0){
            int dig= n%d;
            int value = dig * (int)Math.pow(b, pow);
            result +=value;
            n=n/d;
            pow++;
        }
        return result;
    }

    public static int decimaltoBase(int newBase, int b, int nb){
        int rv=0;
        int p=1;
        while(newBase>0){
            int digit= newBase%nb;
            rv += digit*p;
            newBase=newBase/nb;
            p=p*10;
        }
        return rv;
    }
}
