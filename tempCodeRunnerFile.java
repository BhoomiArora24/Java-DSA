import java.util.Scanner;
public class anyBaseSubtraction {
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
    int result= 0;
    int borrow=0;
    int p=1;

    while(n2>0){
        int d2=n2%10;
        int d1=n1%10;

        n2=n2/10;
        n1=n1/10;

        int dig;
        d2=d2+borrow;

        if(d2>=d1){
            dig= d2-d1;
            borrow=0;
        }
        else{
            borrow=-1;
            dig= d2+ b-d1;
        }

        result +=dig*p;
        p*=10;
    }
    return result;
}
}