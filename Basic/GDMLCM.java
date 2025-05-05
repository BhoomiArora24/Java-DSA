import java .util.Scanner;
public class GDMLCM{

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1= scn.nextInt();
        System.out.println("Enter second number:");
        int n2=scn.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1%n2!=0){
            int rem= n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd=n2;
        System.out.println(gcd);
        int lcm=(on1*on2)/gcd;
        System.out.println(lcm);
        scn.close();
    }
}