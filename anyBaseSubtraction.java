import java.util.Scanner;
public class anyBaseSubtraction {
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

public stattic int getSub(int n1, int n2, int b){
    int result= 0;
    int b=0;

    while(n1>0|| n2>0|| b>0){
        int d1=n1%10;
        int d2= n2%10;
        n1=n1/10;
        n2=n2/10;

        int dig= d2-d1-b;
        if(d2<d1){
            b==8;
        }
    }
    return result;
}
