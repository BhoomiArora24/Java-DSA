import java.util.Scanner;

public class baseToBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();     // number to convert
        System.out.println("Enter the base of the number entered:");
        int b = scn.nextInt();     // original base
        System.out.println("Enter the new base in which the no is to converted:");
        int nb = scn.nextInt();    // new base to convert to

        int decimalValue = baseToDecimal(n, b);
        System.out.println(decimalValue); // decimal form
        
        int conversionBase = decimaltoBase(decimalValue, nb); // pass decimalValue and nb
        System.out.println(conversionBase); // converted to new base
    }

    public static int baseToDecimal(int n, int b) {
        int pow = 0;
        int result = 0;
        while (n > 0) {
            int dig = n % 10;
            result += dig * Math.pow(b, pow);
            n /= 10;
            pow++;
        }
        return result;
    }

    public static int decimaltoBase(int n, int b) {
        int pow = 1;
        int result = 0;
        while (n > 0) {
            int dig = n % b;
            n /= b;
            result += dig * pow;
            pow *= 10;
        }
        return result;
    }
}
