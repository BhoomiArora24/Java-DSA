import java.util.Scanner;
public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the first no:");
        int n1=scn.nextInt();
        System.out.println("Enter the second no:");
        int n2=scn.nextInt();
        System.out.println("Enter base:");
        int b=scn.nextInt();

        int sum=getSum(n1,n2,b);
        System.out.println(sum);
    }

    public static int getSum(int n1, int n2, int b){
        int d1 = n1%10;
        n1 /= 10;

        int d2 = n2%10;
        n2 /= 10;

        int carry=0;
        int sum = 0;

        while(d1>0 || d2>0 || c>0){
            int dig = d1 + d2 + carry;
            dig %= b;
            carry = dig/b;

            sum = dig * pow;
        }

    }
}
