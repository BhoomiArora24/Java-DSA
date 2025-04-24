import java.util.Scanner;
public class baseToDecimal {
    
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int b=scn.nextInt();
        
        int newBase=baseToDecimal(n, b);
        System.out.println(newBase);
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
}

