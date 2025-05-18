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

        int mul1= getMul1(n1, n2, b);
        System.out.println("Multiplication: " + mul1);

        int mul2= getMul2(n1, n2, b);
        System.out.println("Multiplication: " + mul2);

        int sum= getSum(mul1, mul2, b);
        System.out.println("Sum: " + sum);
    }


    public static int getMul1(int n1, int n2, int b){
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
            
            int dig = (d1 * d2) + carry;

            // System.out.println("dig1: "+dig);
            carry = dig/b;

            // System.out.println("Carray : "+ carry);
            dig = dig%b;

            // System.out.println("dig2: " +dig);
            
            rv += dig* pow;
            pow *= 10;

            }
            
            if(carry>0){
                rv += carry*pow;
            }
            }
            

            return rv;
            


        }

        return rv;
    }


    public static int getMul2(int n1, int n2, int b){
        int rv=0;
        int carry= 0;
        int pow = 1;
        while(n2>0){
            if(n1>0){
                

            
            n2 = n2/10;
            int d2 = n2%10;


            while(n1>0){
                int d1 = n1%10;
            n1=n1/10;
            
            int dig = (d1 * d2) + carry;

            // System.out.println("dig1: "+dig);
            carry = dig/b;

            // System.out.println("Carray : "+ carry);
            dig = dig%b;

            // System.out.println("dig2: " +dig);
            
            rv += dig* pow;
            pow *= 10;

            }
            
            if(carry>0){
                rv += carry*pow;
            }
            }
            

            return rv;
            


        }

        return rv;
    }


    public static int getSum(int mul1, int mul2, int b){
        

        int carry=0;
        int summ = 0;
        int pow = 1;
        mul2 *= 10;

        while(mul1>0 || mul2>0 || carry>0){

            // System.out.println("mul1: "+ mul1);
            int d1 = mul1%10;
            mul1 /= 10;

            

            int d2 = mul2%10;
            mul2 /= 10;

            int dig = d1 + d2 + carry;
            // System.out.println("dig1: "+ dig);
            
            carry = dig/b;
            // System.out.println("Carry: "+ carry);
            dig %= b;
            // System.out.println("dig2: "+ dig);


            summ += dig * pow;
            pow *= 10;
            
        }
        return summ;

    
    
}
}