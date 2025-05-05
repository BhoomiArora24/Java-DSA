import java.util.Scanner;
public class functions{
    public static void display(int n, int r, int npr) {
        System.out.println("n: " + n + ", r: " + r + ", nPr: " + npr);
    }

    public static int f(int x){
        int xsquare= x*x;
        return xsquare;
    }

    public static int fact(int x){
        int rv=1;

        for (int i=1; i<=x; i++){
            rv=rv*i;

        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        int n = scn.nextInt();
        
        System.out.print("Enter value of r: ");
        int r = scn.nextInt();

        int nfact = fact(n);

        int nmrfact = fact(n-r);

        int npr = nfact / nmrfact;
        display(n,r,npr);

        scn.close();
    }
}
