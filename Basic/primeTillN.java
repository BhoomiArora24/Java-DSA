import java.util.Scanner;
public class primeTillN {
  
  public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the value of low:");
    int low= scn.nextInt();
    System.out.println("Enter the value of high:");
    int high= scn.nextInt();
    for (int i=low; i<high; i++){
      int count=0;
      for(int div=1; div<=high; div++){
        if(i%div==0){
          count++;
        }
      }
      if(count==2){
        System.out.println(i);
    }
    scn.close();
  }
}
}