import java.util.Scanner;
public class IsnoPrime {
  
  public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the no of times prime no will be entered:");
    int t=  scn.nextInt();
    for(int i=1; i<=t; i++){
      System.out.println("Enter The number: ");
      int n=  scn.nextInt();
      int count=0;
      for(int a=1; a<=n; a++){
        if(n%a==0){
          count++;
      }
    }
      if(count==2){
        System.out.println(n +" is a prime number");
      }
      else{
        System.out.println(n +" is not a prime number");
      }
  }
  scn.close();
}
}