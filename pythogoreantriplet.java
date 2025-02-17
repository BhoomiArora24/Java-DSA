import java.util.Scanner;
public class pythogoreantriplet {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a:");
        int a= scn.nextInt();
        System.out.println("Enter b:");
        int b = scn.nextInt();
        System.out.println("Enter c:");
        int c = scn.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        else if (c>max) {
            max=c;
            
        } 
        if(max==a){
            boolean flag= (b*b+c*c) == (a*a);
            System.out.println("a is hypoteneuse "+flag);
        }
        else if(max==b){
            boolean flag=(a*a+c*c)==(b*b);
            System.out.println("b is hypoteneuse "+flag);
        }
        else if(max==c){
            boolean flag=(a*a+b*b)==(c*c);
            System.out.println("c is hypoteneuse "+flag);
        }
    }
}
