import java.util.Scanner;
public class fibonacciSeries {
  
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the number of terms you want in the series:");
    int n= scn.nextInt();
    int a=0;
    int b=1;
    for(int i=0; i<=n; i++){
      int c=a+b;
      a=b;
      b=c;
      System.out.print(a +"\n");
    }
    scn.close();
  }
}
