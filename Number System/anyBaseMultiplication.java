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
        System.out.println("Multiplication: " + mul);
    }


    public static int getMul(int n1, int n2, int b){
        int rv=0;
        int carry= 0;
        int pow = 1;
        while(n2>0){
            if(n1>0){
                

            int d2 = n2%10;
            n2 = n2/10;


            while(n1>0){
                int d1 = n1%10;
            n1=n1/10;
            
            int dig = (d1  * d2) + carry;

            System.out.println("dig1: "+dig);
            carry = dig/b;

            System.out.println("Carray : "+ carry);
            dig = dig%b;

            System.out.println("dig2: " +dig);
            
            rv += dig* pow;
            pow *= 10;

            }
            
            if(carry>0){
                rv += carry*pow;
            }
            }
            

            


        }

        return rv;
    }

    
    
}
