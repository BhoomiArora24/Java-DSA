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


    public static int getProductWithSingleDigit(int b, int n1, int d2){
        int rv=0;
        while(n1>0){
            int d1= n1%10;
            n1=n1/10;

            int d
        }
    }

    
    
}
