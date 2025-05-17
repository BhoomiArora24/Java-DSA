import java.util.Scanner;
public class anyBaseSubtraction{
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
        System.out.println("Enter the first no:");
        int n1=scn.nextInt();
        System.out.println("Enter the second no:");
        int n2=scn.nextInt();
        System.out.println("Enter base:");
        int b=scn.nextInt();

        int sub=getSub(n1,n2,b);
        System.out.println(sub);
}


public static int getSub(int n1, int n2, int b){
    
    int borrow = b;
    int sub = 0;
    int pow = 1;
    int dig=0;

    while(n1>0 || n2>0){
        int d1 = n1%10;
        n1=n1/10;

        int d2 = n2%10;
        n2 = n2/10;
        

        if(d2>d1){
            dig= d2-d1;
        }
        else if(d2<d1){
            dig= (d2+ borrow) -d1;
            n2 -=1;
        }

        sub += dig* pow;
        pow *= 10;
    }
    return sub;
}
}