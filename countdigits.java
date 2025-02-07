import java.util.Scanner;
public class countdigits {
  
  public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = scn.nextInt();
    int div=0;
    while(n!=0){
      n=n/10;
      div++;
    }
    System.out.println("Number of digits in the number is: "+div);
    scn.close();
  }
}
