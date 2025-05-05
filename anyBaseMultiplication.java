import java.util.Scanner;
public class anyBaseMultiplication {
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = scn.nextInt();
        System.out.println("Enter n2:");
        int n2 = scn.nextInt(); 
        System.out.println("Enter base:");
        int b = scn.nextInt();

        int mul= getMul(n1, n2, b);
        System.out.println("Multiplication of "+n1+" and "+n2+" in base "+ b+ "is:" + mul);
    }


    public static int getSum(int n1, int n2, int b){
        int result=0;
        int c=0;
        int p=1;
        while( n1>0 || n2>0 || c>0){
            int d1= n1%10;
            int d2= n2%10;
            n1=n1/10;
            n2=n2/10;

            
            int dig= d1+d2+c;
            c=dig/b;
            dig=dig%b;

            result +=  dig* p;
            p*=10;
        }
        return result;
    }


    public static int getProductwithySingleDigit(int n1, int b, int d2){
        int d=0;
        int c=0;
        int product=0;
        while(n2!=0){
            d=n2%10;
            n2/=10;
            System.out.println(d);
            int dig= d*n1 +c;
            int value=dig/b;
            c= dig%b;
        }
        return dig;
        
    }
}
